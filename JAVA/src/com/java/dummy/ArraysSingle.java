package com.java.dummy;
public class ArraysSingle {
	public static void main(String args[]) {
		/*int a[] = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;*/
		
		int a[] = {1,23,6,9};
		
	/*for (int i=0; i<a.length; i++)
	    System.out.println(a[i]);*/
		
		for ( int i:a)	
			System.out.println(i);
	}
}
