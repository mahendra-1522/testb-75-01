package com.basics;

public class Swap {

	public static void main(String[] args) {
		int a=54;
		int  b=43;
		System.out.println("before swaping :a="+a+",b="+b);
        // using XOR
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After swaping :a="+a+",b="+b);
		//using normal arithmetic operations
		a=a+b;
		b=a-b;
		a=a-b;
		
        System.out.println("After swaping :a="+a+",b="+b);
	}

}
