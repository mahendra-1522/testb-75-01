package com.basics;

public class Ternary4 {

	public static void main(String[] args) {
		int a=5;
		int b=10;
		int result=(a++>5)?(++a+b++):(++b+a++);
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("result="+result);

	}

}
