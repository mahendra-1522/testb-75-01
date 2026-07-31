package mahendrawork;

import java.util.Arrays;

public class Jagged {

	public static void main(String[] args) {
	 int [][] num= {{1,32,43,5},{11,43,65},{19,29,39,42,12}};
	 
	 
	 num[0][0]=7;
	 num[1][2]=5;
	 num[2][3]=3;
	for(int i=0;i<num.length;i++) {
		for(int j=0;j<num[i].length;j++) {
			System.out.println(num[i][j]);
		}
		System.out.println();
	}
	 
	 System.out.println(Arrays.deepToString(num));

	}

}
