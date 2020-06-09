/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public interface IMain {
	
	public String name="IMain";
	
	
	public default void name() {
		Log("name():"+name);		
		Log("CMain()"+getName());
		Log("CMain()"+getNameD());
		Log("CMain()"+IMain.getNameS());
	}
	
	public void nameSuper() ;
	
	public default void test() {
		CLog.Log(name+": test");
	}
	
	public default void DLog(Object o) {
		CLog.Log(name+":"+o);
	}
	
	
	/**
	 * @param o
	 * 이건 상속(extend)하던가 IMain.SLog(); 처럼 쓸것
	 */
	public static void SLog(Object o) {
		CLog.Log(name+":"+o);
	}
	
	public abstract void Log(Object o) ;
	
	public default String getNameD() {
		return name;
	}
	
	public default void setNameD(String name) {
		//this.name=name;
	}
	
	public static String getNameS() {
		return name;
	}
	
	public abstract String getName() ;
}
