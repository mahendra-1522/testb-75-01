package com.basics;

public class Rectangle {
	 void calculatearea() {
		int length=20;
		int breadth=23;
		int area=length*breadth;
		System.out.println("Area of Rectangle:"+area);
	}

	public static void main(String[] args) {
		Rectangle r =new Rectangle();
	    r.calculatearea();	

	}

}
