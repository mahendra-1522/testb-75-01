package com.basics;

public class Swapping {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		System.out.println("Before Swapping");
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		
//		int temp=a;
//		a=b;
//		b=temp;
//		System.out.println("After Swapping");
//		System.out.println("A :"+a);
//		System.out.println("B :"+b);
		
		b=a+b;
		a=b-a;
		b=b-a;
		
		
		System.out.println("After Swapping");
		System.out.println("A :"+a);
		System.out.println("B :"+b);
		
		
	
		
	}

}
