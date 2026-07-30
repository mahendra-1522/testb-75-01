package mahendrawork;

import java.util.Arrays;

public class Array2 {

	public static void main(String[] args) {
		int [][] a = {
				{21,23,24},
				{43,34,41},
				{18,16,12}
		};
		
		a[1][2]=234;
		System.out.println(a[1][1]);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.println(a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(a));
		
	}

}
