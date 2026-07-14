package com.basics;

public class Student1 {
	int age;
	String name;
	int id;
	String address;
	
	
	
	static int instiuteid=543;
	static String instiutename="VCube";
	

	public static void main(String[] args) {
		
		
		Student1 sd = new Student1();
		
		sd.name="Mahendra";
		sd.age=23;
		sd.id=324;
		sd.address="LAKKAVARAM,THALLURU,A.P";
		System.out.println(instiuteid);
		System.out.println(instiutename);
		System.out.println(sd.name);
		System.out.println(sd.id);
		System.out.println(sd.address);
		System.out.println(sd.age);
		
		
		
       Student1 reddy = new Student1();
		
		reddy.name="vasanth";
		reddy.age=29;
		reddy.id=6644;
		reddy.address="Nagireddygudem,Mirayalaguda,T.G";
		
		instiuteid =2435;
		
		System.out.println(instiuteid);
		System.out.println(instiutename);
		System.out.println(reddy.name);
		System.out.println(reddy.id);
		System.out.println(reddy.address);
		System.out.println(reddy.age);

	}

}
