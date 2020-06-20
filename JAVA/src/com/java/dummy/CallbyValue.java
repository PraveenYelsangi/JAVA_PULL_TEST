package com.java.dummy;
public class CallbyValue {
	int a=20;
	void get(int a){
	a=a+10;		
	}
public static void main(String[] args) {
	CallbyValue c= new CallbyValue();
	System.out.println("Before :"+c.a);
	c.get(3);
	System.out.println("After :"+c.a);
		
	}
}
