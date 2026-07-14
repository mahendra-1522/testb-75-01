package com.basics;

public class Friends {
	String name;
	int age;
	long ph;
	  
	
	static int pin =523264;
	static String village ="lakkavaram";
	static {
   System.out.println("Mahendra friends");
	}
	public static void main(String[] args) {
		
		
	
        
        Friends mahe = new Friends();
        mahe.name="Vamsi";
        mahe.age=21;
        mahe.ph=9876543210l;
       
        
        System.out.println("mandal pin code :"  +pin);
        System.out.println("village name :"+village);
        
        System.out.println("friend name :"+mahe.name);
        System.out.println("friend age :"+mahe.age);
        System.out.println("friend phone number :"+mahe.ph);
        
        
        Friends ma = new Friends();
        ma.name="Varshik";
        ma.age=22;
        ma.ph=9865864847l;
       
        
        System.out.println("mandal pin code :"  +pin);
        System.out.println("village name :"+village);
        
        System.out.println("friend name :"+ma.name);
        System.out.println("friend age :"+ma.age);
        System.out.println("friend phone number :"+ma.ph);
        
        
        Friends va = new Friends();
        va.name="Vasanth";
        va.age=22;
        va.ph= 9392706160l;
        
        pin =757463;
        village = "Nagireddy Gudem";
       
        
        System.out.println("mandal pin code :"  +pin);
        System.out.println("village name :"+village);
        
        System.out.println("friend name :"+va.name);
        System.out.println("friend age :"+va.age);
        System.out.println("friend phone number :"+va.ph);
        
        
        
		
		
	}

}