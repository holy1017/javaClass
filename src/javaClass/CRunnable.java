/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */

class subRunnable1 implements Runnable , ILog{
	
	static int i=0;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 1000; j++) {			
			Log(i++);
		}
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(Thread.currentThread().getName()+":"+o);
	}		
}

class Counter{
	int i=0;

	public int incI() {
		//Log(i);
		return ++i;
	}
	public int decI() {
		//Log(i);
		return --i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog("Counter:"+o);
	}		
}

class subRunnable2 implements Runnable , ILog{
	
	Counter c;
	String name;
	/**
	 * 
	 */
	public subRunnable2(Counter c,String name) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 10000; j++) {			

			setI();
			Log(c.getI());
		}
	}
	
	public void setI() {
		
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(Thread.currentThread().getName()+":"+o);
	}		
}


public class CRunnable implements ILog {

	/**
	 * 
	 */
	public CRunnable() {
		// TODO Auto-generated constructor stub
	}

	
	public static void SLog(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(o);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//test1();
		test2();
		
	}
	public static void test2() {
		Counter c=new Counter();
		Thread t1=new Thread(new subRunnable2(c,"t1") {
			/**
			 * 
			 */
			public void setI() {
				// TODO Auto-generated method stub
				c.incI();
			}
		}
				,"t1");
		Thread t2=new Thread(new subRunnable2(c,"t2"){
			/**
			 * 
			 */
			public void setI() {
				// TODO Auto-generated method stub
				c.decI();
			}
		},"t2");
		t1.start();
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		SLog(c.getI());
	}
	public static void test1() {
		Thread t1=new Thread(new subRunnable1(),"t1");
		Thread t2=new Thread(new subRunnable1(),"t2");
		t1.start();
		t2.start();
	}


	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		
	}

}
