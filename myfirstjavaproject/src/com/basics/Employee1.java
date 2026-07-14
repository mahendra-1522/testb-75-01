package com.basics;

public class Employee1 {
	
	byte employID=1;
	double employsalary=50000;
	long phonenumber=98765456789L;
	short workingdays=658;
	float bonusamount=5000;
	byte employexperience=6;
			char grade=66;
			boolean employ=true;


	public static void main(String[] args) {
		Employee1 e=new Employee1();
		System.out.println("Employee Id:"+e.employID);
		System.out.println("Employee Salary:"+e.employsalary);
        System.out.println("Employee Phone Number:"+e.phonenumber);
        System.out.println("Employee Working Days:"+e.workingdays);
        System.out.println("Employee bonus aAmount:"+e.bonusamount);
        System.out.println("Employee Experience:"+e.employexperience+" years");
        System.out.println("Empployee Grade:"+e.grade);
        System.out.println("Employee Status:"+e.employ);
	}

}
