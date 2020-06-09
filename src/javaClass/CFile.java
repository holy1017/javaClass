/**
 * 
 */
package javaClass;


import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


/**
 * @author "Holy"
 *
 */
public class CFile implements IMain {

	String name="CFile";
	
	public static void main(String[] args) {
		CFile cf=new CFile();
		cf.test();
		cf.test2();
	}
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		IMain.super.test();
		try {
			File ofl,ifl;
			ifl=new File("CFileIn.txt");
			ofl=new File("CFileOut.txt");
			InputStream is=new FileInputStream(ifl);
			OutputStream os=new FileOutputStream(ofl);
			int n;
			n=is.read();
			while (n != -1) {
				os.write(n);
				System.out.print((char)n);
				n=is.read();				
			}
			System.out.println();
			is.close();
			os.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			Log(e);
		}
	}
	
	public void test2() {
		Path pa=Paths.get("src/javaClass/");
		try {
			DirectoryStream<Path> ds;
			ds = Files.newDirectoryStream(pa);
			for (Path p : ds) {
				if (Files.isDirectory(p)) {
					Log("����:"+p.getFileName());					
				}else {
					Log("����:"+p.getFileName());				
					Log("�뷮:"+Files.size(p));							
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}
	
	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub
		//super.
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
