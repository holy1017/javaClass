/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public class CParent implements IMain {
	
	String name="CParent";
	
	/**
	 * 
	 */
	public CParent() {
		// TODO Auto-generated constructor stub
		super();
		Log("----------");
		Log("CParent()"); // CChild 에 있는 Log 호출
		Log("CParent().name:"+name);
		DLog("CParent()");
		IMain.SLog("CParent()");
		//Log("CParent().name:"+super.name);
		Log("CParent()"+getName());
		Log("CParent()"+getNameD());
		Log("CParent()"+IMain.getNameS());
	}	
	
	public void Log(Object s) {
		CLog.Log(name+":"+s);
	}

	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub
		//Log("name():"+super.name);		
	}
	
	public String getName() {
		return name;
	}
	
}
