/**
 * 
 */
package javaClass;

/**
 * @author "Holy"
 *
 */
public class CString implements IMain {

	
	public void run() {
		String s1="test";
		String s2="test";
		String s3=new String("test");
		String s4=new String("TEST");
		Log(s1==s2);
		Log(s1==s3);
		Log(s2==s3);
		Log(s1.equals(s2));
		Log(s1.equals(s3));
		Log(s2.equals(s3));
		Log(s3.equals(s4));
		Log(s3.equalsIgnoreCase(s4));
		Log(s1.hashCode());
		Log(s2.hashCode());
		Log(s3.hashCode());
		Log(s4.hashCode());
		Log(s1.toUpperCase().hashCode());
		
		String s5 = "test1.txt";
		Log(s5.startsWith("te"));
		Log(s5.endsWith("txt"));
		
		StringBuffer sb=new StringBuffer("tet"); //시본 문자열 길이에 버퍼 16
		Log(sb.capacity());
		Log(sb.length());
		sb.append("test1234");
		Log(sb.capacity());
		Log(sb.length());
		StringBuffer sb1=new StringBuffer();
		Log(sb1.capacity());
		Log(sb1.length());
		sb1.append("test1234");
		Log(sb1.capacity());
		Log(sb1.length());
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

}
