package javaClass;

/**
 * @author "Holy"
 *
 */
public class CLog {
	
	public CLog() {
		// TODO Auto-generated constructor stub
		Log("CLog()");
	}
	
	public CLog(Object o) {
		// TODO Auto-generated constructor stub
		Log("CLog(Object o)");
		Log(o);
	}
	
	public static void Log(Object o) {
		System.out.println(o);
	}
}
