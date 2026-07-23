package com.basics;

import java.util.Scanner;

public class Student2 {
	String name;
	int id;
	String course;

	public Student2() {

    this(2);
		

	}

	public Student2(int id) {
		this(id,"mahendra");
	}

	public Student2( int id,String name) {
		this(name,id,"jfs");
	}
	public Student2(String name, int id, String course) {
		
		this.name = name;
		this.id = id;
		this.course = course;
	}
void show() {
	System.out.println("Student Id :"+id);
	System.out.println("Student Name :"+name);
	System.out.println("Student Course:"+course);
}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id:");
		int i=sc.nextInt();
		System.out.println("enter name:");
		sc.nextLine();
		String s=sc.nextLine();
		System.out.println("enter course:");
        String b=sc.nextLine();
		
		
		//Student2 e=new Student2();
		//e.show();
        Student2 f=new Student2(i);
        f.show();
        Student2 g=new Student2(i,s);
        g.show();
        Student2 n=new Student2(s,i,b);
        n.show();
	}

}
