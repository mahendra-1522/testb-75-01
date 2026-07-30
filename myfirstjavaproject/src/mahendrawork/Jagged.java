package mahendrawork;

import java.util.Arrays;

public class Jagged {

	public static void main(String[] args) {
	 int [][] num=new int[4][];
	 num[0]=new int[2];
	 num[1]=new int [1];
	 num[2]=new int [4];
	 num[3]=new int[3];
	 
	 num[0][0]=7;
	 num[1][0]=5;
	 num[2][3]=3;
	 num[3][2]=76;
	 
	 System.out.println(Arrays.deepToString(num));

	}

}
