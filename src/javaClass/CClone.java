/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public class CClone implements Cloneable,IMain {

	String test1="tes1";
	String test2="tes2";
	
	public String getTest1() {
		return test1;
	}

	public void setTest1(String test1) {
		this.test1 = test1;
	}

	public String getTest2() {
		return test2;
	}

	public void setTest2(String test2) {
		this.test2 = test2;
	}

	/**
	 * 
	 */
	public CClone(String test1) {
		// TODO Auto-generated constructor stub
		this.test1=test1;
	}
	
	public Object clone() {
		try {
			return super.clone();
		} catch (Exception e) {
			// TODO: handle exception
			return null;	
		}			
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+","+test1+","+test2;
	}

	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Log(Object s) {
		// TODO Auto-generated method stub
		CLog.Log(name+":"+s);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}
}
