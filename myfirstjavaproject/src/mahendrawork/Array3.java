package mahendrawork;

import java.util.Arrays;

public class Array3 {

	public static void main(String[] args) {
		int num[][]= {{21,23,24},
				{43,-34,41},
				{18,16,12}};
		num[1][2]=0;
		num[0][1]=12;
		//System.out.println(Arrays.deepToString(num));
		
		for(int i=0;i<num.length;i++) {
			
			for(int j=0;j<num[i].length;j++) {
				if(num[i][j]<0) {
					num[i][j]=0;
					
				}
					System.out.println(num[i][j]);
				}
				System.out.println();
			}
		
		}
		

	}


