/**
 * 
 */
package javaClass;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.*;


/**
 * @author "Holy"
 *
 */
public class CFileChannel implements ILog {

	public String name="CFileChannel";
	
	public static void main(String[] args) {
		CFileChannel cfc=new CFileChannel();
		//cfc.write("CFileChannel.txt",new String[] {"1번!!","2번"});
		//cfc.write("..\\javaClass\\CFileChannel2.txt",new String[] {"1번!!","2번654"});
		cfc.read("..\\javaClass\\CFileChannel2.txt");
	}

	public void write(String filePath,String[] text) {
		Path ph=Paths.get(filePath);		
		try {
			Files.createDirectories(ph.getParent());//기존에 파일 없을경우 오류
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			FileChannel fc = FileChannel.open(ph, StandardOpenOption.CREATE,StandardOpenOption.WRITE);		
			Charset cs=Charset.defaultCharset();
			ByteBuffer bf;
			int bc=0;
			for (int i = 0; i < text.length; i++) {
				bf=cs.encode(text[i]);
				bc=fc.write(bf);			
				Log(bc);
			}
			fc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void read(String filePath) {
		Path ph=Paths.get(filePath);		
//		try {
//			Files.createDirectories(ph.getParent());//기존에 파일 없을경우 오류
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		try {
			FileChannel fc = FileChannel.open(ph, StandardOpenOption.READ);		
			Charset cs=Charset.defaultCharset();
			//ByteBuffer bf=ByteBuffer.allocate(1024*1024);
			ByteBuffer bf=ByteBuffer.allocate(128);
			
			StringBuffer sb=new StringBuffer();
			int bc=0;
			while ( (bc=fc.read(bf)) >=0) {
				Log(bc);
				bf.flip();
				sb.append(cs.decode(bf));
				bf.clear();
			}
			Log(sb);
			fc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void Log(Object o) {
		// TODO Auto-generated method stub
		DLog(name+":"+o);
	}
	

	
	
}
