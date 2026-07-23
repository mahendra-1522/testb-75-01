package com.basics;

import java.util.Scanner;

public class InterestCalculator {
	static Scanner sc =new Scanner(System.in);
double calculateInterest(double principal,double rate,int time) {
	double s=(principal*rate*time)/100;
	return s;
}


	public static void main(String[] args) {
		System.out.println("Enter the Amount :");
		double d=sc.nextDouble();
		System.out.println("Enter the Interest percentage :");
		double f=sc.nextDouble();
		System.out.println("Enter the Total no.of.months :");
		int g=sc.nextInt();
		InterestCalculator i =new InterestCalculator();
		double r=i.calculateInterest(d,f,g);
		System.out.println("The total Interst amount is :"+r);
		System.out.println("The total amount is :"+(r+d));
		
	}

}
