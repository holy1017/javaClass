package javaClass;

public class CComparable implements Comparable<CComparable> {

	int i;

	public CComparable(int i) {	this.i=i;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CComparable c1=new CComparable(1);
		CComparable c2=new CComparable(2);
		Log(c1.compareTo(c2));
		Log(c2.compareTo(c1));
		Log(c2.compareTo(c2));
	}

	@Override
	public int compareTo(CComparable o) {
        if 		(this.i == o.i) { return 0;	} 
        else if	(this.i < o.i) 	{ return -1;} 
        else 					{ return 1; }
	}

	public static void Log(Object o) {	System.out.println(o);	}
}
