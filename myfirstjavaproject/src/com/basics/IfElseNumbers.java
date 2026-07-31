package com.basics;

import java.util.Scanner;

public class IfElseNumbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number :");
		int a=sc.nextInt();
		
		if(a>=0 && a<=9) {
			System.out.println("The Given Number Is SINGLE DIGIT :"+a);
			
		}
		else if(a>=10 && a<=99) {
			System.out.println("The Given Number Is TWO DIGIT :"+a);
		}
		else if(a>=100 && a<=999) {
			System.out.println("THe Given Number Is THREE DIGIT :"+a);
		}
		else {
			System.out.println("The Given NUmber Is More Than Three Digit Number :"+a);
		}

	}

}
