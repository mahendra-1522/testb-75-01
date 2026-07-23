package com.basics;

import java.util.Scanner;

public class Patient {
	String patientname;
	int age;
	long room;
	int days;

	Patient() {

	}

	Patient(String patientname, int age, long room, int days) {
		this.patientname = patientname;
		this.age = age;
		this.room = room;
		this.days = days;

	}

	void show() {
		long bill = room * days;
		System.out.println("Patient Name :" + patientname);
		System.out.println("Age :" + age);
		System.out.println("Room Charge Per Day :" + room);
		System.out.println("Days Admitted :" + days);
		System.out.println("Total Hospital Bill :" + bill);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter patient name:");
		String name = sc.nextLine();
		System.out.println("enter age:");
		int age = sc.nextInt();
		System.out.println("enter room charge:");
		long l = sc.nextLong();
		System.out.println("enter no.of days:");
		int i = sc.nextInt();
		Patient p = new Patient(name, age, l, i);
	
		System.out.println("Do you Continue:");
		

		
		Patient p1 = new Patient(sc.next(), sc.nextInt(), sc.nextLong(), sc.nextInt());
		p.show();
		p1.show();

	}

}
