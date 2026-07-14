package com.basics;

public class Recharge {
	void plandetails() {
		int p=299;
		int i=28;
		float f=1.5f;
		String s="Unlimited";
		System.out.println("Current Recharge Plan");
		System.out.println("Plan Nmae: "+"Unlimited"+p);
		System.out.println("Validity : "+i+" Days");
		System.out.println("Data :"+f+" GB/Day");
		System.out.println("Calls :"+s);
	}
	void recharge(double amount) {
	if(amount ==299 ) {
		System.out.println("Recharge Successful!!");
		System.out.println("Recharge amount:$"+amount);
		
	}
	else {
		System.out.println("Recharge was Declined");
	}
		
	}
void main() {
	plandetails();
	recharge(299);
}
}
