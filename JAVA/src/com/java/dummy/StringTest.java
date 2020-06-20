package com.java.dummy;

public class StringTest {

	public static void main(String[] args) {
		String s= "Praveen";
		//s.concat("Yel");
		/*s=s.concat(" Yelsangi"); // String concat by reference variable
		System.out.println(s);*/
		
		//Immutable string
		s=s.concat(" Yelsangi");
		s=s.concat(" Sharma");
		System.out.println(s);
		
		
	}
}
