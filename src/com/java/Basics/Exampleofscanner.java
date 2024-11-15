package com.java.Basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exampleofscanner {
	private int studentId;
	private String studentName;
	private int age;
	private int whichClass;
	private float fee;
	private long mobile;
	
	public static void main(String[] args) {
		  
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
}



