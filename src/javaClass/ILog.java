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
	 * �̰� ���(extend)�ϴ��� IMain.SLog(); ó�� ����
	 */
	public static void SNLog(Object o) {
		CLog.Log(name+":"+o);
	}
	public static void SLog(Object o) {
		CLog.Log(o);
	}
	
	public abstract void Log(Object o) ;
}
