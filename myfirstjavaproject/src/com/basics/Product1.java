package com.basics;

import java.util.Scanner;

public class Product1 {
	String productname;
	double price;
	int quantity;
	double cost;
	
	Product1(){
		this("MAhendra");
	}
	Product1(String productname){
		this(productname,50000);
	}
	Product1(String productname,double price){
		this(productname,price,2);
	}
	Product1(String productname,double price,int quantity){
		this.productname=productname;
		this.price=price;
		this.quantity=quantity;
		
	}
   void show() {
	   double cost=price*quantity;
	   System.out.println("Product Name :"+productname);
	   System.out.println("Product Price :"+price);
	   System.out.println("Product Quantity :"+quantity);
	   System.out.println("Total cost :"+cost);
   }
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Product Name :");
		String s=sc.nextLine();
		System.out.println("Enter Product Price :");
		double d =sc.nextDouble();
		System.out.println("Enter Product Quantity :");
		int i=sc.nextInt();
		
		Product1 p=new Product1(s,d,i);
		p.show();
		

	}

}
