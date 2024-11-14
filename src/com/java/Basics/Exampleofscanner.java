package com.java.Basics;

import java.util.Scanner;

public class Exampleofscanner {
	public static void main(String[] args) {
		 //pre -defined class 
		 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("what is your age");
		int age=sc.nextInt();
		
		System.out.println("what is your name");
		String str = sc.next();
		System.out.println("phone no:");
		float fl=sc.nextFloat();
		
		System.out.println("student id:");
		int id=sc.nextInt();
		


}
