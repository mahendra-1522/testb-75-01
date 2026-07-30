package com.basics;

public class Operators {

	public static void main(String[] args) {
		int a=34;
		int b=54;
		int c=65;
		
		System.out.println("Addition :"+(a-b+c));
		System.out.println("Subtraction :"+(c-a-b));
		System.out.println("multiplication :"+a*b/c);
		System.out.println("Division :"+a%b*c);
		
		
		
		System.out.println(++a);
		System.out.println(a++);
		
		System.out.println(a--);
		System.out.println(--a);
		
		
		System.out.println(+a);
		System.out.println(-a);
		char g='B';
		int f=(int)g;
		System.out.println(f);
		
		
		Integer i=10;
		System.out.println(i instanceof Integer);
		String s="mahendra";
		System.out.println(s instanceof String);
		

	}

}
