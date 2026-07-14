package com.basics;

import java.util.Scanner;

public class Even {

	void main() {
		Scanner  sc =new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		System.out.println("the even numbers are:");
		for(int i=0;i<n;i++) {
		if( i%2==0) {
			System.out.println(i+"");
		}
		
	}
		System.out.println("the odd numbers are:");
		for(int i=0;i<n;i++) {
		if( i%2!=0) {
			System.out.println(i+"");
		}
		
	}
		sc.close();

  }
	
}
