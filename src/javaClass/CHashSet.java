/**
 * 
 */
package javaClass;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author "Holy"
 *
 */
public class CHashSet implements ILog {

	static Set<String> s=new HashSet<String>();
	
	/**
	 * 
	 */
	public CHashSet(String[] arg) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < arg.length; i++) {
			s.add(arg[i]);			
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CHashSet hs=new CHashSet(new String[]{"asd","sdfa","zxcvzxcv"});
		
		SLog(s.size());
		
		SLog(s.contains("asd"));
		SLog(s.contains("sdfa"));
		SLog(s.contains(new String("asd")));
		
		SLog(s.remove("sdfa"));
		SLog(s.remove(new String("asd")));		
		SLog(s.size());
		
		s.clear();		
		SLog(s.size());
	}
	
	public void Log(Object o) {
		// TODO Auto-generated method stub
		DLog(o);
	}
	
	public static void SLog(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(o);
	}
}
