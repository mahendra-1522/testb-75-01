package com.basics;

import java.util.Scanner;

public class SalarySlip {
	String name;
	double salary;
	
	 SalarySlip(String n,double s) {
		 name=n;
		 salary=s;
		double hra=salary*20/100;
		double da=salary*10/100;
		double pf=salary*5/100;
		double grosssalary=salary+hra+da+pf;
		System.out.println("Employee Name :"+name);
		System.out.println("Basic salary:"+salary);
		System.out.println("HRA(20%) :"+hra);
		System.out.println("DA(10%) :"+da);
		System.out.println("PF(5%) :"+pf);
		System.out.println("Gross Salary :"+grosssalary);
	}

	public static void main(String[] args) {
		SalarySlip s=new SalarySlip("mahendra",100000);
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter Employee Name :");
		//String name=sc.nextLine();
		//System.out.println("Enter Salary :");
		//double salary=sc.nextDouble();
	//s.salary(name,salary);
	}

}
