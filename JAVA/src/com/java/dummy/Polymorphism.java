package com.java.dummy;
class Animal{
	void display(){
		System.out.println("Animals class");
	}
}
	class Dog extends Animal{
		void display(){
			System.out.println("Dog Barks");
		}

}

public class Polymorphism {

	public static void main(String[] args) {
		Animal ani=new Dog();
		ani.display();
	}

}
//https://www.javatpoint.com/runtime-polymorphism-in-java