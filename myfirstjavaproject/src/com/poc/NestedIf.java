package com.poc;

import java.util.Scanner;

//Outer Layer: Check if the user is a premium member or a guest.
//Middle Layer: If they are premium, check the total cart value (e.g., over $100 gets 15%, under gets 5%).
//If they are a guest, check if they have a promo coupon.
//Inner Layer: Apply an extra conditional discount if it is the user's birth month or a holiday event.
//Core Advantage: Simplifies combining categorical boolean checks with numerical thresholds.
public class NestedIf {
public static void main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the customer is premium member or a guest:");
	boolean s=sc.nextBoolean();
	
	if( s) {
	     System.out.println("Enter the cart value($) :");
	     double i =sc.nextDouble();
		if(i>100) {
			System.out.println("Customer Gets 15% discount on Billing");
			System.out.println("Enter Customer Birth month :");
			 boolean j=sc.nextBoolean();
			System.out.println("The Customer get The Holiday Event");
			boolean holiday =sc.nextBoolean();
			if(j== true || holiday ==true) {
				System.out.println("Customer Gets Extra COnditional Discount");
			}
			
		}
		else {
			System.out.println("customer Gets 5% discount on Billing");
		}
		
	}
	else {
		System.out.println("Customer have a promo coupn code then get The discount");
	}
}
}
