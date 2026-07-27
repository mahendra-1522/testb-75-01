package com.basics;

public class Tractor {
	
	String name;
	int model;
	int capacity;
	double price;
	String feautres;
	
	Tractor(){
		this("Tractor");
	}
	Tractor(String name){
		//this(t,2000);
		this.name=name;
	}
	Tractor(Tractor t,int model){
		this.name=t.name;
		this.model=model;
	}
	Tractor(Tractor t,int capacity,double price){
		this.name=t.name;
		this.model=t.model;
		this.capacity=capacity;
		this.price=price;
	}
	Tractor(Tractor t,String feautres){
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
		Tractor t=new Tractor();
		t.details();
		Tractor t1=new Tractor("Mahindra");
		t1.details();
		Tractor t2=new Tractor(t1,2018);
		t2.details();
		Tractor t3=new Tractor(t2,40,1999999.99);
		t3.details();
		Tractor t4=new Tractor(t3,"harevester");
		t4.details();

	}

}
