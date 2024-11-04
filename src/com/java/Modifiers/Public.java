package com.java.Modifiers;


 public class Public {
	 
   public void EEEE() {
    	System.out.println("public method ");
    	
    }
 }
class Public1 extends Public {
	public void EEE() {
		System.out.println("public");
	}
	

	public static void main(String[] args) {
		Public a=new Public1();
		a.EEEE();
	}
	}
 


