package mahendrawork;

import java.util.Scanner;

public class PositiveNegative {
	
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number :");
		int i=sc.nextInt();
		
		if(i>0) {
			System.out.println("Positive");
		}
		
		if(i<0) {
			System.out.println("Negative");
		}
		
		if(i==0) {
			System.out.println("Zero");
		}
		
		

	}

}
