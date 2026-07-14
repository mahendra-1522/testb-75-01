package com.basics;

public class Employee {
	 static String compname;
	 static String comploc;
	 
	 String emploname;
	 int emplsalary;
	 
	 static {
		 compname="VCube";
		 comploc="KPHB";
		 
	 }
	 
	/*
	 static void add() {
		 System.out.println("hello mahendra");
		
	 }
	 
	 void mun() {
		 
		 add();
		 
		 System.out.println("hello mahendra1");
	 }
	int mul(int a,int b) {
		System.out.println("hello vcube");
		return a+b;
		 
	 }*/
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("null pointer variable is satisfied");
	}
	 
	public static void main(String[] args) {
		
		Employee e = new Employee();
		System.out.println("company name:"+compname);
		System.out.println("company location:"+comploc);
		e.emploname="Mahendra";
		e.emplsalary=32;
		System.out.println("Employe name:"+e.emploname);
		System.out.println("Employe salary:"+e.emplsalary);
		
		Employee e1 = new Employee();
		System.out.println("company name:"+compname);
		System.out.println("company location:"+comploc);
		e1.emploname="venky";
		e1.emplsalary=33;
		System.out.println("Employe name:"+e1.emploname);
		System.out.println("Employe salary:"+e1.emplsalary);
		
		
	/*	add();
		
		e.mun();
		e.mul(30, 40);
		System.out.println(e.mul(30, 40));
		 */
		
		e=null;
		e1=null;
		System.gc();
		
		System.out.println(e.emploname);
		int a =0x7ad041f3;
		System.out.println(a);
		
		}
	}
	



