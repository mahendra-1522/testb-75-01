package com.basics;

public class Strudent {
	String accontname;
	int balance;
	
	static String bankname ="SBI";
	
	static void deposit() {
		System.out.println("addamount"); 
		}
	void withdraw() {
		System.out.println("withdraw money from account");
		
	}

	public static void main(String[] args) {
		
		
		Strudent bank =new Strudent();
		System.out.println("Bank Name:"+bankname);
		bank.accontname="Mahendra";
		bank.balance=8765;
		System.out.println("Bank account holder name:"+bank.accontname);
		System.out.println("Bank acoount balance remaining:"+bank.balance);
		deposit();
		bank.withdraw();
	
	}

}
