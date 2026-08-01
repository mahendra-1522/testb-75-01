package com.basics;

import java.util.Scanner;

public class BonusStatus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employye Rating");
		float f=sc.nextFloat();
		boolean status=(f>=4.0 && f<=5.0)?true:false;
		System.out.println("The Employee Is Elgible For Perfomance Bonus :"+status);

	}

}
