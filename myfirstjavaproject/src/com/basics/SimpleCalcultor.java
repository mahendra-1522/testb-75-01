package com.basics;

import java.util.Scanner;

public class SimpleCalcultor {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter num1 Number :");
		int num1=sc.nextInt();
		System.out.println("Enter num2 Number :");
		int num2 =sc.nextInt();
		System.out.println("Enter character :");
		char c=sc.next().charAt(0);
		int result=(c=='+')?num1+num2:num1-num2;
		System.out.println(result);

	}

}
