package com.java.Modifiers;

public class Poly {
	
    public void user() {
    	System.out.println("hi");
    	 }
    public void user1() {
    	System.out.println("hey");
    }
    public void user2() {
    	System.out.println("white");
    }
    public void user3() {
    	System.out.println("grey");
    }
    }

class Poly1 extends Poly{
	public static void main(String[] args) {
		Poly p= new Poly1();
		p.user();
		p.user1();
		p.user2();
		p.user3();	
		
	}	
	public void user() {
		System.out.println("hello");
	}
	protected void user1() {
		System.out.println("happy");
	}
	void user2() {
		System.out.println("black");
}
	private user3() {
		System.out.println("green");
	}
}
			
	
