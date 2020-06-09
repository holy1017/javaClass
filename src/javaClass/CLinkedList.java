/**
 * 
 */
package javaClass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author "Holy"
 *
 */
public class CLinkedList implements ILog {

	static LinkedList<String> l=new LinkedList<String>();
		
	/**
	 * 
	 */
	public CLinkedList() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		ILog.SLog(o);
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
		SLog(l.offer("1adsfg"));
		SLog(l.offer("2qweradsfg"));
		SLog(l.offer("3zcvqweradsfg"));
		print();
	}
	
	public static void print() {
		/*
		String s= l.poll();
		 * while (s != null) { SLog(s); s= l.poll(); }
		 */
		String s;
		while ((s= l.poll())  != null) {
			SLog(s);
		}
	}

}
