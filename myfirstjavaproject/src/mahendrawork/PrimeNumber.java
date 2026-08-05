package mahendrawork;

import java.util.Scanner;

public class PrimeNumber {
	int count=0;
	
	void check(int n) {
		 
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				
				count =count+1;
				
			}
			
			
		}
		
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n Number");
		int n=sc.nextInt();
		PrimeNumber p =new PrimeNumber();
		p.check(n);
      System.out.println(p.count);
	}

}
