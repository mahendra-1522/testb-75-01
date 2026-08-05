package com.basics;

import java.util.Scanner;

public class Table {
static void table(int n) {
	for(int i=1;i<=10;i++) {
		int sum=n*i;
		System.out.println(n +"*"+i+"="+sum);
	}
}
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Table number");
		int n=sc.nextInt();
		table(n);
	}

}
