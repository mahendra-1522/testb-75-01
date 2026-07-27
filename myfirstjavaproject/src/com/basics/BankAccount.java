package com.basics;

public class BankAccount {
	String holderName;
	long accNumber;
	double balance;
	
	BankAccount(){
		this("Unknown");
	}
	BankAccount(String name){
		this(name,0);
	}
	BankAccount(String name,long accnumber){
		this(name,accnumber,0);
	}
	BankAccount(String name,long accnumber,double balance){
		
		this.holderName=name;
		this.accNumber=accnumber;
		this.balance=balance;
	}

	
	void display() {
		System.out.println("Account Holder Name :"+holderName);
		System.out.println("Account number :"+accNumber);
		System.out.println("Account Balance :"+balance);
	}

	public static void main(String[] args) {
		BankAccount b=new BankAccount();
		b.display();
		BankAccount b1=new BankAccount("Mahendra");
		b1.display();
		BankAccount b2=new BankAccount("Boddu",1234475l);
		b2.display();
		BankAccount b3=new BankAccount("Mahendra Reddy",676453,2349);
		b3.display();

	}

}
