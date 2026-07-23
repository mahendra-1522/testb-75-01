package com.basics;

import java.util.Scanner;

public class StringMethod {
	static Scanner sc=new Scanner(System.in);
	
String getName(String fname,String lname) {
		
		return fname+" "+lname;
	}

int getAge(int a) {
	int ag=a;
	return ag;
}
char getGender(String h) {
	char s=h.charAt(0);
	return s;
}







void main() {
	 System.out.println("Enter first Name of the Student :");
	 
		String s=sc.nextLine();
		 System.out.println("Enter last Name of the Student :");
		
			String l=sc.nextLine();
		System.out.println("Enter Age :");
		int age=sc.nextInt();
		System.out.println("Enter Gender :");
		String ys=sc.next();
		
		
		String g=getName(s,l);
		System.out.println("the first name is :"+g);
		
		
		int i=getAge(age);
		System.out.println("the age is :"+i);
		char y=getGender(ys);
		System.out.println("the Gender of the student :"+y);
  }
}
