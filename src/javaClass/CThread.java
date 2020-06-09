/**
 * 
 */
package javaClass;

class subThread1 extends Thread implements ILog{
	
	static int i=0;
	String name;
	
	/**
	 * 
	 */
	public subThread1(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int j = 0; j < 10; j++) {			
			Log(i++);
			//Thread.yield();// CPU연결 해제
		}
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(name+":"+o);
	}
}

class subThread2 extends Thread implements ILog{
	
	static int i=0;
	String name;
	
	/**
	 * 
	 */
	public subThread2(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int j = 0; j < 10; j++) {			
			Log(i++);
			Thread.yield();// CPU연결 해제
		}
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(name+":"+o);
	}
}


class subThread3 extends Thread implements ILog{
	
	static int i=0;
	String name;
	Thread nextThread=null;
	
	public Thread getNextThread() {
		return nextThread;
	}
	public void setNextThread(Thread nextThread) {
		this.nextThread = nextThread;
	}
	/**
	 * 
	 */
	public subThread3(String name,Thread nextThread) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.nextThread=nextThread;
	}
	public subThread3(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int j = 0; j < 10; j++) {			
			try {
				Thread.sleep(1000000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				;
				Log(i++ +":"+ e.getMessage());
				if (nextThread.isAlive()) {
					nextThread.interrupt();//슬립 해제
				}
			}			
			//Thread.yield();// CPU연결 해제
		}
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(name+":"+o);
	}
}




/**
 * @author "Holy"
 *
 */
public class CThread implements ILog {

	static String name="CThread";
	/**
	 * 
	 */
	public CThread() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(name+":"+o);
	}
	
	public static void SLog(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(name+":"+o);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//test1();		
		//test2();
		test3();
	}

	public static void test3() {
		subThread3 t11=new subThread3("t11");
		subThread3 t12=new subThread3("t12",t11);
		subThread3 t13=new subThread3("t13",t12);
		t11.setNextThread(t13);
		
		t11.start();
		t12.start();
		t13.start();
		
		t11.interrupt();
		try {
			t11.join();
			t12.join();
			t13.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SLog("end");
	}

	public static void test2() {
		Thread t11=new subThread1("t11");
		Thread t12=new subThread1("t12");
		t11.start();
		t12.start();
//		try {
//			t1.join();
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		SLog("end");
	}

	public static void test1() {
		Thread t1=new subThread2("t1");
		Thread t2=new subThread2("t2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();// 바로 다음행으로 안넘어감
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SLog("end");
	}

}
