package com.basics;

public class LinearSearch {
	public static void main(String[]args) {
		int nums[]= {4,67,79,2,7,95};
		int target=95;
		int result=linearsearch(nums,target);
		
		if(result!=-1) {
			System.out.println("the value is in the index of: "+result);
			}
		else {
			System.out.println("the value is not found");
			
		}
	}
		public static int linearsearch(int[]nums,int target) {
			for(int i=0;i<nums.length;i++) {
				if(nums[i]==target)
					return i;
			}
			return -1;
		}
}


