/**
 * 
 */
package javaClass;

import java.io.IOException;
import java.nio.file.*;

/**
 * @author "Holy"
 *
 */
public class CDir implements IMain{
	
	public static void main(String[] args) {
		new CDir("src/javaClass");
	}
	
	
	/**
	 * 
	 */
	public CDir(String path) {
		// TODO Auto-generated constructor stub
		DirListPrint(path);
	}
	
	public void DirListPrint(String path) {
		Path ph= Paths.get(path);
		try {
			DirectoryStream<Path> ds=Files.newDirectoryStream(ph);
			for (Path p : ds) {
				if (Files.isDirectory(p)) {
					Log("D:"+p.getFileName());
				} else {
					Log("F:"+p.getFileName()+"\t"+Files.size(p));
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
		
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		CLog.Log(o);
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
}
