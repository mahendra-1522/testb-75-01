package mahendrawork;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number :");
		int i=s.nextInt();
		
		if(i%2==0 && i%3==0) {
			System.out.println("The Given Number is Divsible by 2 and 3");
		}

	}

}
