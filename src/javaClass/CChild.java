/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public class CChild extends CParent {

	String name="CChild"; //와나..... CChild() 선언 직후 할당됨.
	
	/**
	 * 
	 */
	public CChild() { // CParent() 선언 후 할당됨
		// TODO Auto-generated constructor stub
		super();
		Log("----------");
		Log("CChild()");
		Log("CChild().name:"+name);
		Log("CChild().super.name:"+super.name);
		DLog("CChild()");
		IMain.SLog("CChild()");
		Log("CChild()"+getName());
		Log("CChild()"+getNameD());
		Log("CChild()"+IMain.getNameS());
	}
	
	public void name() {
		Log("name():"+name);		
	}
	
	public void nameSuper() {
		Log("nameSuper():"+super.name);		
	}
	
	/**
	 *
	 */
	public void Log(String s) { // 이게 오버라이드 되서 함수의 포인터도 바뀐...
		CLog.Log(name+":"+s); //;;;;; 이건 name포인터가  CChild.name 으로 바뀐건 이해 간다만..
	}
	
}
