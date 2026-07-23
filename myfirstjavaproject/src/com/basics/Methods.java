package com.basics;

import java.util.Scanner;

public class Methods {
	static Scanner sc=new Scanner(System.in);
	
	
	
	
	int add(int a,int b) {
		int ad=a+b;
		return ad;
	}
	int subtract(int a,int b) {
		int sub=a-b;
		return sub;
	}
	int multiply(int a,int b) {
		int mul=a*b;
		return mul;
	}
	double division(int a,int b) {
		int div=a/b;
		return div;
	}
	double modulus(int a,int b) {
		int mod=a%b;
		return mod;
	}
 static void evenOrOdd(int a,int b) {
	  
	if(a%2==0)
	  {
		  System.out.println("the given number is Even");  
	  }
	  else {
		  System.out.println("the given number is odd");
	  }
	if(b%2==0)
	  {
		  System.out.println("the given'A' number is Even");  
	  }
	  else {
		  System.out.println("the given 'B' number is odd");
	  }
	
	 
  }
 int swapNumbers(int a,int b)
 {
	int temp=a;
	a=b;
	b=temp;
	System.out.println("the swap A number is :"+a);
	System.out.println("the swap B number is :"+b);
	return temp;
 }
 double deposit(double de) {
	
	 double f=sc.nextDouble();
	 
	 return f;
 }
 
 
 
 
 
	public static void main(String [] args) {
		Methods m =new Methods();
		
		
		System.out.println("Enter A value :");
		int a=sc.nextInt();
		System.out.println("Enter B value :");
		int b=sc.nextInt();
		System.out.println("the deposit amount is :");
		double d=sc.nextDouble();
		
		
	   int w= m.add(a, b);
	   System.out.println("the add value is :"+w);
	   int q=m.subtract(a,b);
	   System.out.println("the sub value is :"+q);
	   int e=m.multiply(a, b);
	   System.out.println("the mul value is :"+e);
	   double r=m.division(a, b);
	   System.out.println("the div value is :"+r);
	   double t=m.modulus(a, b);
	   System.out.println("the mod value is :"+t);
	   evenOrOdd(a,b);
	   m.swapNumbers(a,b);
	   double s=m.deposit(d);
	   System.out.println("the total deposit amount is :"+s);
	  
	}

}
