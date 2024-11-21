package com.java.Basics;

import java.util.Scanner;

public class CPU {
	public static void main(String[] args) {
		 Scanner snr=new Scanner(System.in);
		 Laptop l=new Laptop();
		 CPU c=new CPU();
		 
		 System.out.print("How many lapnames would you like to enter? \n");
		 int numberoflap= snr.nextInt();
		 int i;
		 for(i=0;i<=numberoflap;i++);
		 System.out.println("\nEnter details for Person :" + i  );
		 
		 
		 
		 
		 System.out.print("Enter lapname: ");
	     String lapname = snr.next();

	     System.out.print("Enter storage: ");
	     int storage = snr.nextInt();
	    

	     System.out.print("display: ");
	     String display = snr.next(); 
	     
	     System.out.println("enter ram:");
	     int ram=snr.nextInt();
	     
	     CPU.displayLaptopDetails(l);
	}


public static void displayLaptopDetails(Laptop laptop) {
	 System.out.println("laptop details: " + laptop.getDetails());
	
	 
	
     
}
}







