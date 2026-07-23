package com.basics;
 class Method{
	String sname;
	int sno;
	char gender;
	float fee;
	double due;
 }
 


 
public class Methods1 {
	
	static Method getDetails(){
		Method m=new Method();
		 m.sname="mahendra";
		 m.sno=23;
		 m.gender='M';
		 m.fee=3200.98f;
		 m.due=1200.098;
		 return m;
	 }

	public static void main(String[] args) {
		Method m=getDetails();
		
		System.out.println(m.sname);
		System.out.println(m.sno);
		System.out.println(m.gender);
		System.out.println(m.fee);
		System.out.println(m.due);
		

	}

}
