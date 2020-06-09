/**
 * 
 */
package javaClass;

import java.nio.file.*;
import java.util.Iterator;

/**
 * @author "Holy"
 *
 */
public class CPath implements IMain {

	/**
	 * 
	 */
	public CPath() {
		// TODO Auto-generated constructor stub
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

	/**
	 * @param args
	 * 경로 예제
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path p = Paths.get("src/javaClass/test");
		SLog("파일 이름:"+p.getFileName());
		SLog("상위 폴더 경로:"+p.getParent());
		SLog("상위 폴더 이름:"+p.getParent().getFileName());
		SLog("경로 길이:"+p.getNameCount());
		
		for (int i = 0; i < p.getNameCount(); i++) {
			System.out.print(p.getName(i)+"/");
			
		}
		System.out.println();
		
		SLog("===============");
		
		Iterator<Path> ip=p.iterator();
		while (ip.hasNext()) {
			Path pn = (Path) ip.next();
			System.out.print(pn.getFileName()+"/");
		}
		
	}

	/**
	 * @param string
	 */
	public static void SLog(Object o) {
		// TODO Auto-generated method stub
		CLog.Log(o);
	}

	
}
