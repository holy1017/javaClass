package javaClass;

import java.util.Scanner;

public class CScanner {

	static Scanner sc;
	static int[] n;
	
	static {
		System.out.println("static");
		if(sc==null) sc=new Scanner(System.in);
		if(n==null) n=new int[3];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("main Start");
		int i=0;
		while(true) {
			System.out.print("inpu number:");
			if(sc.hasNextInt()) {
				System.out.println("input number:"+(n[i]=sc.nextInt()));
				i++;
			}else {
				System.out.println("not number:"+sc.nextLine());
			}
			if(i>=3) break;
		}
		System.out.println("main End");
	}

}
