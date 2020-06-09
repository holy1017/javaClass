/**
 * 
 */
package javaClass;

import java.io.RandomAccessFile;

/**
 * @author "Holy"
 *
 */
public class CRAF implements IMain {

	String name="CRAF";
	
	public void test() {
		try {
			RandomAccessFile raf=new RandomAccessFile("CRAF.txt", "rw"); // ������ �� �������� ����
			for (int i = 0; i < 10; i++) {
				raf.write(i); // ����Ʈ ����
			}
			for (int i = 9; i >= 0; i--) {
				raf.seek(i);
				Log(raf.read());
			}
			raf.close();
		} catch (Exception e) {
			// TODO: handle exception
			Log(e);
		}
	}
	
	@Override
	public void nameSuper() {
		// TODO Auto-generated method stub
		
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
