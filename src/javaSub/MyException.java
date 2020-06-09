/**
 * 
 */
package javaSub;

class OverException extends Exception{
	public OverException() {super();}
	public String toString() {return "OverException";}
}
class UderException extends Exception{
	public UderException() {super();}
	public String toString() {return "UderException";}
}
public class MyException {
	public static void test(int i) throws OverException, UderException {
		if (i>7) throw new OverException(); 
		if (i<3) throw new UderException();			
	}
	public static void main(String[] args) throws OverException {
		try {
			test(9);
		} catch (UderException e) {
			System.out.println(e);
		}
		try {
			test(9);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			test(2);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
