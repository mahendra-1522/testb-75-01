package com.basics;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter character:");
		char c =sc.next().charAt(0);
		c=Character.toUpperCase(c);
		String c1=(c=='A'||c=='E'||c=='I'||c=='O'||c=='U')?"Vowels":"Consonants";
		System.out.println("The Given Word Is :"+c1);
		
	}

}
