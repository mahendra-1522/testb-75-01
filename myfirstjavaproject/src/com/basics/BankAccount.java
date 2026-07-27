package com.basics;

public class BankAccount {
	String holderName;
	long accNumber;
	double balance;
	
	BankAccount(){
		this("Unknown");
	}
	BankAccount(String name){
		this(name,0l);
	}
	BankAccount(String name,long number){
		this(name,number,0.0);
	}
	BankAccount(String name,long number,double balance){
		this.holderName=name;
		this.accNumber=number;
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
		BankAccount b1=new BankAccount("mahendra");
		b1.display();
		BankAccount b2=new BankAccount("Boddu",1234475l);
		b2.display();
		BankAccount b3=new BankAccount("Boddu",1234475l,2349);
		b3.display();

	}

}
