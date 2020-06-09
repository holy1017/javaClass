/**
 * 
 */
package javaClass;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;

/**
 * @author "Holy"
 *
 */
public class CFileSystem implements ILog{

	/**
	 * 
	 */
	public CFileSystem() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileSystem fst = FileSystems.getDefault();
			for (FileStore fs : fst.getFileStores()) {
				SLog("이름:"+fs.name());
				SLog("타입:"+fs.type());
				long t=fs.getTotalSpace();
				long f=fs.getUnallocatedSpace();
				long u=fs.getUsableSpace();				
				SLog("전체:"+t);
				SLog("사용1:"+f);
				SLog("사용2:"+u);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}

	public static void SLog(Object o) {
		// TODO Auto-generated method stub
		CLog.Log(o);
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		
	}
	
	

}
