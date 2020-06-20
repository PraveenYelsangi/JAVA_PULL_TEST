package com.java.dummy;

public class CatchMultiple {

	public static void main(String[] args) {
	
		
		try {
			/*String str=null;
			System.out.println(str.length());*/
			int a[] = new int [5];
			System.out.println(a[4]);
			a[4]=3/0;	
		} catch (ArithmeticException e) {
			System.out.println("Arithematic Exception");
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Array index out of bound Exception");
		}catch(Exception e){
			System.out.println("Comman Exception");
		}
		finally{
			System.out.println("Finally bolck");
		}
		System.out.println("Rest code");
	   
	}
}
