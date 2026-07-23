package com.basics;

import java.util.Scanner;

public class Stastics {
	String playername;
	int matchesplayed;
	int totalruns;
	
	Stastics(String name,int matches,int runs){
		playername=name;
		matchesplayed=matches;
		totalruns=runs;
		System.out.println("Player Name :"+playername);
		System.out.println("No.of.Matches Played :"+matchesplayed);
		System.out.println("Total Runs Scored :"+totalruns);
	}
	static void main(int matches,int runs) {
	   double average=runs/matches;
	   System.out.println("Average runs of the player :"+average);
	}
	

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Player Name :");
		String nam=sc.nextLine();
		System.out.println("Enter Matches Played :");
		int n=sc.nextInt();
		System.out.println("Enter Total runs Scored :");
		int m=sc.nextInt();
		Stastics s=new Stastics(nam,n,m);
		main(n,m);
		
		System.out.println("Enter Player Name :");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("Enter Matches Played :");
		int n1=sc.nextInt();
		System.out.println("Enter Total runs Scored :");
		int m1=sc.nextInt();
		Stastics s1=new Stastics(name,n1,m1);
		main(n1,m1);
		

	}

}
