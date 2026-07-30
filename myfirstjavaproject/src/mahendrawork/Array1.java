package mahendrawork;

import java.util.Arrays;

public class Array1 {
      
	public static void main(String [] args) {
		int array[]= {11,43,12,23,22};
		int nums[]= {22,23,12,43,11};
		System.out.println(nums.length);
		array[3]=22;
		nums[1]=22;
		  
	     
	      System.out.println(Arrays.toString(array));
	      Arrays.sort(array);
	     System.out.println(Arrays.toString(array));
	     System.out.println(Arrays.toString(nums));
	     Arrays.sort(nums);
	     System.out.println(Arrays.toString(nums));
	    
	     System.out.println(Arrays.equals(array,nums));
	      for(int i=0;i < array.length;i++) {
	    	  System.out.println("The values of the index "+i+" :"+array[i]);
	      }
	      
	}
}
