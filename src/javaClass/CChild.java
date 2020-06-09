/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public class CChild extends CParent {

	String name="CChild"; //�ͳ�..... CChild() ���� ���� �Ҵ��.
	
	/**
	 * 
	 */
	public CChild() { // CParent() ���� �� �Ҵ��
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
	public void Log(String s) { // �̰� �������̵� �Ǽ� �Լ��� �����͵� �ٲ�...
		CLog.Log(name+":"+s); //;;;;; �̰� name�����Ͱ�  CChild.name ���� �ٲ�� ���� ���ٸ�..
	}
	
}
