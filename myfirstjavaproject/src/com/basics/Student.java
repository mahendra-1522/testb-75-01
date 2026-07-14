package com.basics;

public class Student {
	// Instance variables
	int id = 32;
	String name = "Mahendra";

	static int cid = 233;
	static String cname = "Software";
	
	
	static {
		System.out.println("Boddu Mahendra Reddy");
	}

	public static void main(String[] args) {

		// Initialize static variables
		cid = 234;
		cname = "VCube";

		System.out.println("Institute ID : " + Student.cid);
		System.out.println("Institute Name : " + Student.cname);

		// First object
		Student s = new Student();
		s.id = 33;
		s.name = "Manikanta";

		System.out.println("Student ID : " + s.id);
		System.out.println("Student Name : " + s.name);

		// Second object
		Student s1 = new Student();
		s1.id = 34;
		s1.name = "Vamsi";

		System.out.println("Student ID : " + s1.id);
		System.out.println("Student Name : " + s1.name);

		// Third object
		Student s2 = new Student();
		s2.id = 35;
		s2.name = "Varshik";

		System.out.println("Student ID : " + s2.id);
		System.out.println("Student Name : " + s2.name);
	}
	{
		
		System.out.println("Hello good Morning!!");
	}

}
