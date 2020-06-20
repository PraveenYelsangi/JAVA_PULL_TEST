package com.java.dummy;
public class CallbyValue2 {
 int r=30;
 void getmgs(CallbyValue2 c){
	 c.r=c.r+20;
 }
 
public static void main(String[] args) {
	CallbyValue2 c = new CallbyValue2();
	System.out.println("Before :" + c.r);
	c.getmgs(c);
	System.out.println("After :" + c.r);
}
}
