package com.basics;

public class Employee2 {
	int empid;
	String empName;
	double salary;
	Employee2(){
		
	}
	Employee2(int empid,String name,double price){
		this.empid=empid;
		this.empName=name;
		this.salary=price;
	}
	Employee2(Employee2 e,String name){
		this.empid=e.empid;
		this.empName=name;
		this.salary=e.salary;
		
	}
	void salary(double amount) {
		this.salary=salary+amount;
	}
		
 void display() {
	 System.out.println("Employee Id :"+empid);
	 System.out.println("Employee Name :"+empName);
	 System.out.println("Employee Salary :"+salary);
 }
	public static void main(String[] args) {
		Employee2 e =new Employee2(101,"Mahendra",50000);
		e.display();
		Employee2 e1 =new Employee2(e,"Vishnu");
		
		
		e1.salary(19999);
		e1.display();
		
		
		
	}

}
