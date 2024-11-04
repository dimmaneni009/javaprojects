package com.java.Basics;


public class Firstclass {
	public static void main (String[] args) {
   
	Sec1 sec = new Sec1();
    sec.printA();
    sec.printB();
	}
}
	
	
	class Fa1{
		void printA() {
			System.out.println("print A");
	}
		
		}
	
  class Sec1 extends Fa1  {
 
	 void printB() {
		
		System.out.println("print B");
	}
 }
	

	
  //single,multilevel

