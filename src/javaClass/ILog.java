/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public interface ILog {
	
	public String name="IMain";
	
	public default void DNLog(Object o) {
		CLog.Log(name+":"+o);
	}
	
	public default void DLog(Object o) {
		CLog.Log(o);
	}
	/**
	 * @param o
	 * 이건 상속(extend)하던가 IMain.SLog(); 처럼 쓸것
	 */
	public static void SNLog(Object o) {
		CLog.Log(name+":"+o);
	}
	public static void SLog(Object o) {
		CLog.Log(o);
	}
	
	public abstract void Log(Object o) ;
}
