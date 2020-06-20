package com.java.dummy;

abstract class Pou{
	abstract void office();
	Pou(){
		System.out.println("Constructor Loading....");
	}
	void getrun(){
		System.out.println("Running Abstract method");
	}
}

 class Trans extends Pou{
	  void office(){
		  System.out.println("TRANS class");
		  
	  }
  }
 class Vision extends Pou{
	 void office(){
		 System.out.println("Vision Class");
	 }
 }
 
 class Visionary extends Pou{
	 void office(){
		 System.out.println("Visionary Class");
	 }
 }

class AbstractClass{
	public static void main(String[] args) {
      Pou p = new Vision();
      p.office();
      p.getrun();
      /*Pou p1 = new Trans();
      p1.office();*/
        
	}
}