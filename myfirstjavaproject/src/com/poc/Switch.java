package com.poc;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		String s="";
		int vegsum=0;
		int fruitsum=0;
		do {
		System.out.println("Welcome To Shopping");
		System.out.println("-----------------------");
		System.out.println("Enter 1 for vegetable shopping");
		System.out.println("Enter 2 for fruits shopping");
		int b=sc.nextInt();
		switch (b) {
		case 1:
			System.out.println("1. Potato");
			System.out.println("2. Tomato");
			System.out.println("3. Chilli");
			System.out.println("4. Brinjal");
			System.out.println("5. LadysFinger");
		do {	
		System.out.println("Enter vegetable name");
		int veg=sc.nextInt();
		
		switch(veg) {
		case 1: 
			System.out.println("potato");
			int p=45;
			vegsum+=p;
			System.out.println("Potato Price:"+p);
		break;
		
		case 2: 
			System.out.println("Tomato");
			int t=25;
			vegsum+=t;
			System.out.println("Tomato Price:"+t);
		break;
		case 3: 
			System.out.println("chilli");
			int c=34;
			vegsum+=c;
			System.out.println("chilli Price:"+c);
		break;
		case 4: 
			System.out.println("Brinjal");
			int z=34;
			vegsum+=z;
			System.out.println("Brinjal Price:"+z);
		break;
		case 5: 
			System.out.println("LadysFinger");
			int l=34;
			vegsum+=l;
			System.out.println("LadysFinger Price:"+l);
		break;
		default :
			System.out.println("please select your vegetables ");
			}
	System.out.println("Do You Want to Continue?..");
	s=sc.next();
	
	}while(s.equalsIgnoreCase("y"));
			break;
	case 2:
		
		System.out.println("1.Mango");
		System.out.println("2.Watermelon");
		System.out.println("3.Dragon");
		System.out.println("4.Banana");
		System.out.println("5.Apple");
		do {
		System.out.println("Enter your fruits");
		int fr=sc.nextInt();
      switch(fr) {
      case 1:
    	  System.out.println("Mango");
    	  int m=150;
    	  fruitsum+=m;
    	  System.out.println("Mango price :"+m);
    	  break;
      case 2:
    	  System.out.println("Watermelon");
    	  int w=30;
    	  fruitsum+=w;
    	  System.out.println("Watermelon price :"+w);
    	  break;
      case 3:
    	  System.out.println("Dragon");
    	  int d=120;
    	  fruitsum+=d;
    	  System.out.println("Dragon price :"+d);
    	  break;
      case 4:
    	  System.out.println("Banana");
    	  int y=80;
    	  fruitsum+=y;
    	  System.out.println("Banana price :"+y);
    	  break;
      case 5:
    	  System.out.println("Apple");
    	  int a=200;
    	  fruitsum+=a;
    	  System.out.println("Apple price :"+a);
    	  break;
    	  default :
    		  System.out.println("please select your fruits");
      }
      System.out.println("Do You Want to Continue?...");
		s=sc.next();
		}while(s.equalsIgnoreCase("y"));
      break;
		}
		System.out.println("Do You Want to Continue?...");
		s=sc.next();
		}while(s.equalsIgnoreCase("y"));
		System.out.println("Total Bill :"+(vegsum+fruitsum));
	}

}
