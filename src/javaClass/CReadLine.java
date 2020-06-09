/**
 * 
 */
package javaClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author "Holy"
 *
 */
public class CReadLine implements IMain {

	/**
	 * 
	 */
	public CReadLine() {
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
		return null;
	}

	@Override
	public void test() {
		// TODO Auto-generated method stub
		IMain.super.test();
		File fl = new File("src/javaClass/CReadLine.java");
		try {
			FileReader fr = new FileReader(fl);
			LineNumberReader rn = new LineNumberReader(fr);
			String ln;
			while ((ln=rn.readLine())!=null) {
				System.out.print(rn.getLineNumber()+"\t");
				System.out.println(ln);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CReadLine cr = new CReadLine();
		cr.test();
	}

}
