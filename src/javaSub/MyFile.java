/**
 * 
 */
package javaSub;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class MyFile {
	public static void main(String[] args) {
		File f=new File("MyFile.txt");
		try {
			FileInputStream is=new FileInputStream(f);
			FileReader fr=new FileReader(f);
			InputStreamReader isr=new InputStreamReader(new FileInputStream(f),"UTF-8");
			int d, c1=0, c2=0, c3=0;			
			while ((d= is.read())!=-1) {
				System.out.println( ++c1 + ":" + (char)d + ":" + d );
			}
			while ((d= fr.read())!=-1) {
				System.out.println( ++c2 + ":" + (char)d + ":" + d );
			}
			while ((d= isr.read())!=-1) {
				System.out.println( ++c3 + ":" + (char)d + ":" + d );
			}
		} catch (Exception e) { e.printStackTrace(); }
	}
}
