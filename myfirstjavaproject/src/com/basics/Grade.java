package com.basics;

public class Grade {

//	        Marks >= 90 → A
//			Marks >= 75 → B
//			Marks >= 60 → C
//			Marks >= 40 → D
//			Otherwise → Fail
	public static void main(String[] args) {
		int marks=90;
		
		String grade =(marks>=90)?"A":(marks>=75)?"B":(marks>=60)?"c":(marks>=40)?"D":"fail";
		System.out.println("The Student Grade Is :"+grade);

	}

}
