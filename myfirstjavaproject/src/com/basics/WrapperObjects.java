package com.basics;

public class WrapperObjects {
	Byte productid =2;
	String productname="soap";
	Short productprice=324;
	Double productrating=5.0;
	Boolean productstatus=true;
	Integer stockquantity=34545;
	Byte discountpercentage=5;
	Integer productcode=243432;


	public static void main(String[] args) {
		WrapperObjects w =new WrapperObjects();
		System.out.println(w.productid);
		System.out.println(w.productname);
		System.out.println(w.productprice);
		System.out.println(w.productrating);
		System.out.println(w.productstatus);
		System.out.println(w.stockquantity);
		System.out.println(w.discountpercentage);
		System.out.println(w.productcode);
		
		
	}

}
