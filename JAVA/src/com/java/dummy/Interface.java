package com.java.dummy;

interface Object{
		default void run(){
		System.out.println("Default interface");
	}
		void obj();
}
   class Remote implements Object{
	  public void obj(){
		  System.out.println("Remote Object");
	  }
  }
  class Bottel implements Object{
	  public void obj(){
		  System.out.println("Bottel Object");
	  }
	  
  }
public class Interface {
	public static void main(String[] args) {
		Object ob= new Bottel();
		ob.obj();
		ob.run();
	}
}
