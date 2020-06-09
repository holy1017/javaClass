/**
 * 
 */
package javaClass;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

/**
 * @author "Holy"
 *
 */
public class CWatch implements ILog{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new CWatch().watch("C:\\Users\\lilly\\eclipse-workspace\\javaClass\\src\\javaClass");
		
	}

	public void watch(String path) {
		StandardWatchEventKinds SW = null ;
		try {
			WatchService ws=FileSystems.getDefault().newWatchService();
			Path ph=Paths.get(path);
			ph.register(ws, 
					SW.ENTRY_CREATE, 
					SW.ENTRY_DELETE, 
					SW.ENTRY_MODIFY);
			WatchKey wk;
			WatchEvent.Kind wek;			
			//Log("while");
			while (true) {
				wk=ws.take();
				//Log("take");
				//Log("for");
				for (WatchEvent<?> we : wk.pollEvents()) {
					wek=we.kind();
					Path p=(Path)we.context();					
					//Log("F :"+p.getFileName());
					//Log("F :");
					if (wek==SW.ENTRY_CREATE) {
						Log("FC:"+p.getFileName());
					}else if (wek==SW.ENTRY_DELETE){
						Log("FD:"+p.getFileName());						
					}else if (wek==SW.ENTRY_MODIFY){
						Log("FM:"+p.getFileName());						
					}else if (wek==SW.OVERFLOW){
						Log("SW.OVERFLOW");						
					}
					
					
				}				
				if(!wk.reset()) break;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		DLog(o);
	}
	
}
