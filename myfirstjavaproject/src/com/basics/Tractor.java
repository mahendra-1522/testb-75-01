package com.basics;

public class Tractor{
	
	String name;
	int model;
	int capacity;
	double price;
	String feautres;
	static Tractor t;
	
	Tractor(){
		this("mak");
	}
	Tractor(String name){
	this(t,name,2000);
		this.name=name;
	}
	Tractor(Tractor t,String n,int model){
		this(t,t.name,model,43,24335);
		this.name=t.name;
		
		this.model=model;
	}
	Tractor(Tractor t,String n,int model,int capacity,double price){
		this(t,t.name,model,capacity,price,"hard");
		this.name=t.name;
		this.model=t.model;
		this.capacity=capacity;
		this.price=price;
	}
	Tractor(Tractor t,String n,int model,int capacity,double price,String feautres){
		this.name=t.name;
		this.model=t.model;
		this.capacity=t.capacity;
		this.price=t.price;
		this.feautres=feautres;
	}
	
	void details() {
		System.out.println("Tractor Name :"+name);
		System.out.println("Tractor Model :"+model);
		System.out.println("tractor capacity :"+capacity+"cc");
		System.out.println("Tractor Price :"+price);
		System.out.println("Tractor Features :"+feautres);
		System.out.println("******************************");
	}
	public static void main(String[] args) {
		
		Tractor t1=new Tractor("Mahindra");
		t1.details();
		Tractor t2=new Tractor(t1,t1.name,2018);
		t2.details();
		Tractor t3=new Tractor(t2,t2.name,t2.model,40,1999999.99);
		t3.details();
		Tractor t4=new Tractor(t3,t3.name,t3.model,t3.capacity,t3.price,"harevester");
		t4.details();

	}

}
