package com.basics;

public class Car {
	
	String model;
	String brand;
	double price;

	public Car(){
		System.out.println("No-Arg from Car ");
		this("Audi");
	}
	

	public Car(String model) {
		this(model,"Suzuki");
	}


	public Car(String model, String brand) {
		this(model,brand,119999.9);
	}


	public Car(String model, String brand, double price) {
		
		this.model = model;
		this.brand = brand;
		this.price = price;
	}

	void show() {
		System.out.println("Model of car :"+model);
		System.out.println("Brand of car :"+brand);
		System.out.println("Price of car :"+price);
		System.out.println("************************");
	}
	

}
class Vechicle extends Car{
	
	
	
Vechicle(){
	
	//this("Edge 50 fusion","motorala");
	System.out.println("No-Arg from Vechicle");

}

Vechicle(String Mode,String Bran){
	
	super(Mode,Bran);
	
}

	Vechicle(String Model,String Brand,Double Price){
		super(Model,Brand,Price);
		
		
		
	}
	public static void main(String[] args) {
		System.out.println("main metod started");
		Vechicle v=new Vechicle();
		v.show();
		Vechicle v2=new Vechicle("1R","One Plus");
		v2.show();
		Vechicle v1=new Vechicle("17","iphone",120000.00);
		v1.show();
		System.out.println("main metod ended");
		
	}
}