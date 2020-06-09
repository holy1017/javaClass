/**
 * 
 */
package javaClass;


import java.io.*;

/**
 * @author "Holy"
 *
 */
public class CConsole implements IMain {

	public static void main(String[] args) {
		CConsole cc=new CConsole();
		cc.test();
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		IMain.super.test();
		
		String nm;
		char[] pw;
		Console con = System.console();
		
		if (con == null) {			
			System.out.print("con is null!");
		} else {
			System.out.print("name:");
			nm=con.readLine();
			System.out.print("password:");
			pw=con.readPassword();
			
			PrintWriter pr=con.writer();
			pr.println("name:"+nm);
			pr.println("password:"+pw);
		}
	}
	
	/**
	 * 
	 */
	public CConsole() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub

	}

	@Override
	public void Log(Object s) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
