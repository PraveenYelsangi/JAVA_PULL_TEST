package com.java.dummy;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList1 {

	public static void main(String[] args) {
		Student s1 = new Student(11,"Praveen",23,001);
		Student s2 = new Student(12,"Prakash",24,002);
		Student s3 = new Student(13,"Prashanth",25,003);
		Student s4 = new Student(14,"Pratibha",26,004);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<Student> itr = al.iterator();
		while (itr.hasNext()){
			
			//System.out.println(itr.next());
			Student st = itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age+" "+st.id);
			//break;
		}
		
		
	}
}
