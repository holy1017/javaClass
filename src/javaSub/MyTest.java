package javaSub;

enum Value { v1,v2,v3,v4,v5,v6,v7 }
	
interface MyInterface1{
	String name = "MyInterface1";
	Value v=Value.v1;
	public static void outS()  {System.out.println(name+":outS:"+v);}
	public default void outD() {System.out.println(name+":outD:"+v);}
	public void out() ;
}
interface MyInterface2 extends MyInterface1{
	String name = "MyInterface2";
	Value v=Value.v1;
	public static void outS2()  {System.out.println(name+":outS2:"+v);}
	public default void outD2() {System.out.println(name+":outD2:"+v);}
	public void out2() ;
}
class MyClass1 implements MyInterface1,MyInterface2{
	String name = "MyClass1";
	Value v=Value.v2;
	public void outD() {System.out.println(name+":outD:"+v);}	
	public void out()  {System.out.println(name+":out:"+v);}
	public void out2() {System.out.println(name+":out2:"+v);}
}
abstract class MyClass2 implements MyInterface1,MyInterface2{
	String name = "MyClass2";
	Value v=Value.v3;
	public void outD() {System.out.println(name+":out2:"+v);}	
}
public class MyTest extends MyClass2 {
	String name = "MyTest";
	Value v=Value.v4;
	public void outD() {System.out.println(name+":outD:"+v);}
	public void out()  {System.out.println(name+":out:"+v);}
	public void out2()  {System.out.println(name+":out2:"+v);}
	public static void main(String[] args) {
		MyInterface1.outS(); 	// (L1)
		MyInterface2.outS2();	// (L2)
		new MyInterface1() {
			Value v=Value.v3;
			public void out() {System.out.println(name+":out:"+v);}
		}.out();				// (L3)
		new MyInterface2() {
			Value v=Value.v3;
			public void out()  {System.out.println(name+":out:"+v);}
			public void out2() {System.out.println(name+":out2:"+v);}
		}.outD();				// (L4)
		new MyClass1() {Value v=Value.v3;}.outD();// (L5)
		new MyClass1().out();	// (L6)
		new MyClass1().outD2();	// (L7)
		new MyClass2() {
			Value v=Value.v3;
			public void out()  {System.out.println(name+":out:"+v);}
			public void out2() {System.out.println(name+":out2:"+v);}
		}.outD();				// (L8)
		new MyTest().outD();	// (L9)
		new MyTest() {Value v=Value.v3;	}.out();// (L10)
	}
}
