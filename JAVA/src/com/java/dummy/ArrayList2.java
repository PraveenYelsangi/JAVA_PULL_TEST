package com.java.dummy;

import java.util.ArrayList;

public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		
		System.out.println("Before Adding data: "+al);
		al.add("POU");
		al.add("PAVI");
		al.add("RAVAN");
		al.add("RAM");
		System.out.println("After Adding data: "+al);
		
		al.add(1, "PRAVEEN");
		System.out.println("Extra data added to index: "+al);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("RAMAN");
		al2.add("GHANTA");
		al.addAll(al2);
		System.out.println("Add data using addAll() method: "+al);
		
		ArrayList<String> al3 = new ArrayList<String>();
		al3.add("YELSANGI");
		al3.add("RAVAIN");
		al.addAll(2, al3);
		System.out.println("Add data using addAll(index, method) method: "+al);
		
		al.remove(8);
		System.out.println("After remove method: "+al);
		
		al.removeAll(al3);
		System.out.println("After removeALL method: "+al);
		
		al.removeIf(str -> str.contains("RAM"));
		System.out.println("After removeIF method: "+al);
		
		System.out.println("Before set method: "+al);
		al.set(2, "PAVYA");
		System.out.println("After set method: "+al);
		
		/*al.clear();
		System.out.println("All cleared: "+al);*/
		
				
	}
}
