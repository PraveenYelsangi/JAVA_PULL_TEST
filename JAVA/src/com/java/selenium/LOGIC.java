package com.java.selenium;

public class LOGIC {

	int a = 5;
	int b = 10;
	int c = 51;
	int d = 52;
	int e = 53;

	public void calc(){
		if (a==2 || b==1){
			
			if (c==51 || d ==60 || e==65){
				System.out.println("GODD");
			}
			else{
				System.out.println("NOT");
				}
		}else{
		System.out.println("NOT in");
		}
	}
	
	public static void main(String[] args) {
		LOGIC l = new LOGIC();
		l.calc();
	}
	

}
