package com.java.dummy;
 class Shape{
	 int hi= 30;
	 void draw(){
		 System.out.println("Shape Class");
	 }
 } 
 
  class Triangle extends Shape{
	int hi= 40;
	 void draw(){
		 System.out.println("Triangle Class");
	 }
 } class Rectangle extends Triangle{
	 void draw(){
		 System.out.println("Rectangle calsss");
	 }
 }

public class ShapePolymorphism {
	public static void main(String[] args) {
		Shape s= new Rectangle();
		s.draw();
		Triangle t = new Rectangle();
		t.draw();
		Shape s1=new Triangle();
		s1.draw();
		System.out.println(s1.hi);
		//ShapePolymorphism pu = new ShapePolymorphism();

	}

}
//https://www.javatpoint.com/runtime-polymorphism-in-java