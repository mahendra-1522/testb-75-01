package mahendrawork;

public class Pattern {

	public static void main(String[] args) {
		
		//Square pattern
		for(int i=0;i<=4;i++) {
			for(int j=0;j<=10;j++) {
			System.out.print("*");
		}
		System.out.println();
	}
		System.out.println("-----------------------------------------");
		//Right reverse half pyramid
		for(int i=0;i<=10;i++) {
		for(int j=0;j<=10-i;j++) {
			
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------------");
		//Right half pyramid
			for(int i=0;i<=10;i++) {
				for(int j=0;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
			System.out.println("-----------------------------------------");
			//left half  pyramid
			for(int i=0;i<10;i++) {
				for(int j=10;j>i;j--) {
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) {
					System.out.print("*");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------");
			//left half reverse pyramid
			for(int i=0;i<10;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				for(int k=10;k>i;k--) {
					System.out.print("*");
				}
				System.out.println();
			}
			
			System.out.println("-----------------------------------------");
			//Triangle
			for(int i=0;i<10;i++) {
				for(int j=10;j>i;j--) {
					System.out.print(" ");
				}
				for(int k=0;k<i;k++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("-----------------------------------------");
			//Reverse Triangle
			for(int i=0;i<10;i++) {
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				for(int k=10;k>i;k--) {
					System.out.print(" *");
				}
				System.out.println();
			}
	}
}


