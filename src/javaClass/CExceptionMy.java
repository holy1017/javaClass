/**
 * 
 */
package javaClass;

class CExceptionEx extends Exception{
	/**
	 * 
	 */
	public CExceptionEx() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return super.toString();
		return "CExceptionEx";
	}
}

/**
 * @author "Holy"
 *
 */
public class CExceptionMy {

	/**
	 * 
	 */
	public CExceptionMy() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			CExceptionMy.test(5);
		} catch (CExceptionEx e) {
			System.out.println(e);
			// TODO: handle exception
		}finally {
			System.out.println("finally");
		}
		// TODO Auto-generated method stub
	}
	
	public static void test(int i) throws CExceptionEx {
		if (i>3) throw new CExceptionEx()	;
	}

}

