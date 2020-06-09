package javaClass;



/**
 * @author "Holy"
 *
 */
public class CSub implements IMain {
	
	/**
	 * 
	 */
	public String Name="CSub";
	
	/**
	 * 
	 */
	public CSub() {
		// TODO Auto-generated constructor stub
		Log("CSub()");
		Log("CSub().name:"+name);
		DLog("CSub()");
		IMain.SLog("CSub()");
		Log("CSub()"+getName());
		Log("CSub()"+getNameD());
		Log("CSub()"+IMain.getNameS());
	}
	
	/**
	 * @param s
	 */
	public CSub(Object s) {
		// TODO Auto-generated constructor stub
		Log("CSub(String s) , " + s);
	}
	
	public void test(String s) {
		Log("CSub.test(String s)"+ s);		
	}

	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub
		// Log("name():"+super.name);		
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
}
