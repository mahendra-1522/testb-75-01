package com.basics;

import java.util.Scanner;

public class Movie1 {

	public static void main(String[] args) {
		
		System.out.println("Types of Tickets :");
		System.out.println("1.Silver : Rs.200/-");
		System.out.println("2.Gold : Rs.300/-");
		System.out.println("3.Platinum : Rs.500/-");
		int silver=200;
		int gold=300;
		int platinum=500;
		String s="";		
		do {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your choice :");
		int n=sc.nextInt();
		System.out.println("Enter your age :");
		int m=sc.nextInt();
		switch(n) {
		case 1:
			if(m>=60) {
				System.out.println("Silver Ticket Price :"+silver *0.9);
			}
			else {
				System.out.println("Silver Ticket Price :"+silver);
			}
			break;
		case 2:
			if(m>=60) {
				System.out.println("Gold Ticket Price :"+gold*0.9);
			}
			else {
				System.out.println("Gold Ticket Price :"+gold);
			}
			break;
		case 3:
			if(m>=60) {
				System.out.println("Platinum Ticket Price :"+platinum*0.9);
			}
			else {
				System.out.println("Platinum Ticket Price :"+platinum);
			}
			break;
			default :
				System.out.println("Invalid Choice ");
			}
		System.out.println("Do You Want To Continue?");
		sc.next();
		}while(s.equals(s));
	}

	
}
