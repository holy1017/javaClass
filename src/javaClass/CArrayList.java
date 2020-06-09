/**
 * 
 */
package javaClass;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author "Holy"
 *
 */
public class CArrayList implements ILog {

	static List<String> l=new ArrayList<String>();
	
	/**
	 * 
	 */
	public CArrayList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub

	}

	public static void SLog(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(o);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SLog(l.add("test"));
		add(new String[] {"zxcv","sdfg"});
		SLog(l.size());
		SLog(l.indexOf("qwer"));
		SLog(l.indexOf("zxcv"));
		SLog(l.get(2));
		SLog(l.lastIndexOf("sdfg"));
		SLog(l.toString());
		//SLog(l.add(5,"test")); // ¾ë ¹ºµ¥ void³Ä
		//l.add(5,"5test");
		l.add(1,"5test");
		SLog(l.set(2,"1bsdb"));
		SLog(l.remove(0));
		SLog(l.remove("fdas"));
		SLog(l.toString());
		print1();
		print2();
		print3();
	}

	public static void add(String[] arg) {
		for (int i = 0; i < arg.length; i++) {
			l.add(arg[i]);			
		}
	}
	
	public static void print1() {
		Iterator<String> i=l.iterator();
		while (i.hasNext()) {
			String s = (String) i.next();
			SLog(s);
		}
	}
	
	public static void print2() {
		for (int i = 0; i < l.size(); i++) {
			SLog(l.get(i));
		}
	}
	
	public static void print3() {
		for (String s : l) {
			SLog(s);
		}
	}
	
}
