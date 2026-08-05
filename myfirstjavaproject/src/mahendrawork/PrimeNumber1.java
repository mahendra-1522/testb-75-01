package mahendrawork;

import java.util.Scanner;

public class PrimeNumber1 {
	
 static void primenumber(int n) {
	 for(int i=0;i<=n;i++) {
		 int count=0;
		 for(int j=1;j<=i;j++) {
			 if(i%j==0) {
				 count++;
			 }
		}
		 if(count==2) {
			 System.out.println(i+" prime number");
			 }
		 }
	  }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number :");
		int n=sc.nextInt();
		primenumber(n);
	}
}
