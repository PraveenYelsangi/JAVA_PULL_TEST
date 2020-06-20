package com.java.dummy;

public class Wrapper {

	public static void main(String[] args) {
		/*int a=30;
		Integer i= a; //Autoboxing Implicitly
		System.out.println(i);
		
		Integer i = Integer.valueOf(a); //Autoboxing Explicitly
		System.out.println(" "+a+ " "+i);*/
		
		Integer a =  new Integer(3);
		int i=a.intValue();
		int j=a;
		System.out.println(a+ " "+i+" "+j);
		
	}
}
