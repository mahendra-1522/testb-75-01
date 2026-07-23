package com.basics;

public class Product {
	int productid;
	String productName;
	Product(){
		
	}
	Product(int productid,String productName){
		this.productid=productid;
		this.productName=productName;
		System.out.println("Product ID :"+productid);
		System.out.println("Product Name :"+productName);
	}

	 void main() {
		
		Product p=new Product(12344,"Soap");
		Product p1=new Product(234,"Bottle");
		Product p2=new Product(31345,"Laptop");
		
	}

}
