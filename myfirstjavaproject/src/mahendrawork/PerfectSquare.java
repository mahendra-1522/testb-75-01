package mahendrawork;

import java.util.Scanner;

public class PerfectSquare {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number:");
		int i=sc.nextInt();
		
        int s=(int)Math.sqrt(i);
        
        if(s*s==i) {
        	System.out.println("the Given Number is a perfect Square");
        }
	}

}
