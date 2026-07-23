package mahendrawork;

import java.util.Scanner;

public class PerfectCube {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		int i =sc.nextInt();
		
		int s=(int)Math.round(Math.cbrt(i));
		
		if(s*s*s==i) {
			System.out.println("The given number is a Perfect Cube");
		}

	}

}
