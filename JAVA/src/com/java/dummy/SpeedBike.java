package com.java.dummy;

public class SpeedBike {
	int speed;
	boolean birthday;
	
	 SpeedBike(int speed, boolean birthday){
		 this.speed=speed;
		 this.birthday=birthday;
		
		if(speed<=60){
			
			System.out.println("No Ticket");
			
		} 
			//System.out.println("Speed Five time 1");
		if (birthday== true)	{
		 if(speed>61 && speed<=80) {
			 
			System.out.println("Speed Five time 2"); 
			
		} else{
			System.out.println("Small Ticket");
	}
		}
		if (birthday== true)	{
		 if(speed>81) {
			
			System.out.println("Big Ticket");
		}
		
		 else{
				System.out.println("Small Ticket11");
			}
		}
	}
	
	public static void main(String[] args) {
		SpeedBike s = new SpeedBike(62,true);
	
		
	}
}
