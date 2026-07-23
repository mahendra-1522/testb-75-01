package com.basics;

import java.util.Scanner;

public class Hotel {
	String customer;
	int room;
	int days;
	double roomCharge;
	
	 Hotel(){
		this("mahe");
	 }
	 Hotel(String customer){
		 this(customer,3);
	 }
	 Hotel(String customer,int room){
		 this(customer,room,10);
	 }
	 Hotel(String customer,int room,int days){
		 this(customer,room,days,750);
	 }
     Hotel(String customer,int room,int days,double roomCharge){
    	 this.customer=customer;
    	 this.room=room;
    	 this.days=days;
    	 this.roomCharge=roomCharge;
     }
     
     void show() {
    	 double bill=room*days*roomCharge;
    	 System.out.println("Enter Customer Name :"+customer);
    	 System.out.println("Room Number :"+room);
    	 System.out.println("No.of.Days :"+days);
    	 System.out.println("Room Charge Per Day :"+roomCharge);
    	 System.out.println("Total Bill :"+bill);
     }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Customer Name :");
		String s=sc.nextLine();
		System.out.println("No.of Rooms :");
		int i=sc.nextInt();
		System.out.println("Enter No.of Days :");
		int j=sc.nextInt();
		System.out.println("Enter cost of Room per Day :");
		double d=sc.nextDouble();
		
		
		Hotel h=new Hotel();
		h.show();
		Hotel h1=new Hotel(s);
		h1.show();
		Hotel h2=new Hotel(s,i);
		h2.show();
		Hotel h3=new Hotel(s,i,j);
		h3.show();
		Hotel h4=new Hotel(s,i,j,d);
		h4.show();

	}

}
