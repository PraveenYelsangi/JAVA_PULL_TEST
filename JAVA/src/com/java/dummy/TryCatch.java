package com.java.dummy;

public class TryCatch {

	public static void main(String[] args) {
		
		int a=12;
		int b =0;
		//int c;
		
		try {
			int c = a/b;
		} catch (ArithmeticException e) {
			
			 //System.out.println(a/(b+2));
		  System.out.println(e);	
		}
		
		System.out.println("REST");
		
	}
}
