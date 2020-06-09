/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public class CException implements IMain {
	
	final static String name="CMain";



	static String test;
	
	/**
	 * 
	 */
	public CException() {
		// TODO Auto-generated constructor stub
		Log("-------------");
		try {
			if (test == null) {
				throw new Exception("test null");
			}else {
				Log(test);
			}
		} catch (Exception e) {
			// TODO: handle exception		
			Log("CException catch:"+e);
			test="test";
		} finally {
			// TODO: handle finally clause
			Log("CException finally");
		}
		Log(test);
		Log("-------------");
	}
	
	public void makeException() throws Exception {
		throw new Exception("makeException");
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
		return name;
	}
	
	public static String getTest() {
		return test;
	}

	public static void setTest(String test) {
		CException.test = test;
	}
}
