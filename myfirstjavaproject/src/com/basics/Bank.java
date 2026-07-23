package com.basics;

public class Bank {
	static int account=10013010;
	static String bname="SBI";
	static long ifsc=100123092l;
	double balance;
	String hname;
	
	 static void show(){
		 System.out.println("Bank Name :"+bname);
		 System.out.println("IFSC Code :"+ifsc);
	 }
	
	{
		account++;
		System.out.println("Account Number :"+account);
	}
	
	void show(String name,double balance) {
		System.out.println("Account Holder Name :"+name);
		System.out.println("Account Balance :"+balance);
		}

	

	public static void main(String[] args) {
		Bank b =new Bank();
		show();
		b.show("Mahendra",1234);
		
		
		Bank b1 =new Bank();
		show();
		b1.show("Vishnu",134);
		
		Bank b2 =new Bank();
		show();
		b2.show("Bhanu",124);
		
	}

}
