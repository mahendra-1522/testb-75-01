package com.basics;
import java.util.Scanner;

public class StudentResult {
	void student(String s) {
		System.out.println("The Student Name is :"+s);
	}
   void totalmarks(int m1,int m2,int m3) {
	   System.out.println("enter the marks m1 :"+m1);
	   System.out.println("enter the marks m2 :"+m2);
	   System.out.println("enter the marks m3 :"+m3);
	   System.out.println("total marks :"+(m1+m2+m3));
   }
   void average(int m1,int m2,int m3) {
	
		   System.out.println("AVERAGE MARKS :"+(m1+m2+m3)/3);
	}
  void main() {
	  
	  Scanner sc =new Scanner(System.in);
	   System.out.println("enter the marks m1 :");
	   int m1=sc.nextInt();
	   System.out.println("enter the marks m2 :");
	   int m2=sc.nextInt();
	   System.out.println("enter the marks m3 :");
	   int m3=sc.nextInt();
	   
	   System.out.println("enter the name :");
	   sc.nextLine();
	   String s =sc.nextLine();
	   
	   
	   student(s);
	   totalmarks(m1,m2,m3);
	   average(m1,m2,m3);
	   
   }
}
