package com.basics;

import java.util.Scanner;

public class SecondLargest {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter A number :");
		int a=sc.nextInt();
		System.out.println("Enter B number :");
		int b=sc.nextInt();
		System.out.println("Enter C Number :");
		int c=sc.nextInt();
		
		if(b>=a && b<=c || b<=a && b>=c) {
			System.out.println("The Second Largest Number is B "+b);
		}
		else if(a>=b && a<=c || a<=b && a>=c) {
			System.out.println("The Second Largest Number is A "+a);
		}
		else {
			System.out.println("The Second Largest Number is c "+c);
		}

	}

}
