/**
 * 
 */
package javaClass;


class Counter2{
	
	int c=0;
	public synchronized void inc() {
		c++;
	}
	public synchronized void dec() {
		c--;
	}
	public void inc2() {
		synchronized(this) {c++;}
	}
	public void dec2() {
		synchronized(this) {c--;}
	}
	
	
	public int getC() {
		return c;
	}
	
}

class TSync implements Runnable , ILog {

	Counter2 c;
	String name;
	/**
	 * 
	 */
	public TSync(Counter2 c,String name) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.name=name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int j = 0; j < 100; j++) {			
			setI();
			Log(c.getC());
		}
	}
	
	public void setI() {
		
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
public class CSync implements ILog {

	/**
	 * 
	 */
	public CSync() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter2 c=new Counter2();
		Thread t1=new Thread(new TSync(c,"t1") {
			/**
			 * 
			 */
			public void setI() {
				// TODO Auto-generated method stub
				c.inc();
			}
		}
				,"t1");
		Thread t2=new Thread(new TSync(c,"t2"){
			/**
			 * 
			 */
			public void setI() {
				// TODO Auto-generated method stub
				c.dec();
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
		SLog(c.getC());
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
}
