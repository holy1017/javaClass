package javaClass;


import java.util.ArrayList;
import java.util.List;

public class CMain implements IMain {

	final static String name="CMain";
	
	public CMain() {
		// TODO Auto-generated constructor stub
		Log("CMain()");
		Log("CMain().name:"+name);
		//Log("CChild().super.name:"+super.name);
		Log("CMain()"+getName());
		Log("CMain()"+getNameD());
		Log("CMain()"+IMain.getNameS());
	}
	
	public static void main(String[] args) {


		SLog("====================");
		CConsole ccl=new CConsole();
		ccl.test();
		SLog("====================");
		SLog("main() , "+args);
		
		SLog("====================");
		int i = 0;
		for ( i = 0; i < 3; i++) {
			SLog(i);
		}
		SLog("====================");
		SLog(i);
		SLog("====================");
		
		CSub cs1 = new CSub();
		cs1.test("test2");
		
		SLog("====================");
		
		CSub cs2 = new CSub("test1");
		cs2.test("test3");
		
		SLog("====================");
		
		CChild cc = new CChild();

		SLog("====================");
		
		cc.name();
		cc.nameSuper();
		SLog("main()"+cc.getName());//CMain:main()CParent
		SLog("main()"+cc.getNameD());
		SLog("main()"+IMain.getNameS());
		
		SLog("====================");		
	
		List<String> l=new ArrayList<String>();
		l.add("test1");
		l.add("test2");
		l.add("test3");
		SLog(l.toString());

		SLog("====================");
		
		CGenric<String, Integer, Integer, Integer, Integer> cg1=new CGenric<>();
		//cg.setE(1);
		cg1.setE("test5");
		SLog(cg1.toString());
		
		SLog("====================");	
		
		CGenric<String, Integer, Integer, Integer, Integer> cg2=new CGenric<>("test8",4,7,1,8);
		SLog(cg2.toString());
				
		SLog("====================");	
		
		CGenricInteger cgs = new CGenricInteger(9,8,7,6,5);
		SLog(cgs.toString());
				
		SLog("====================");	
		
		CGenric cg3=new CGenric("คต",1,"คร",8,"คล");
		SLog(cg3.toString());
		
		SLog("====================");		
		SLog(CException.getTest());
		SLog("====================");
		
		CException ce = new CException();
		SLog(CException.getTest());
		try {
			ce.makeException();
		} catch (Exception e) {
			// TODO: handle exception
			SLog("CException catch:"+e);
		}
		SLog("====================");
		
		CClone cc1=new CClone("test3");
		CClone cc2=(CClone) cc1.clone();
		cc2.setTest2("test4");
		SLog(cc1.toString());
		SLog(cc2.toString());
		
		SLog("====================");
		
		CString cs=new CString();
		cs.run();
		
		SLog("====================");
		
		CRAF raf =new CRAF();
		raf.test();
		
		SLog("====================");
		
		CFile cf =new CFile();
		cf.test();
		
		SLog("====================");
	}
	
	public static void SLog(Object s) {
		CLog.Log(name+":"+s);
	}
	
	@Override
	public void Log(Object s) {
		// TODO Auto-generated method stub
		CLog.Log(name+":"+s);
	}
	
	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub
		// Log("name():"+super.name);	
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}


	
}
