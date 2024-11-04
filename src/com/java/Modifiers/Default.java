package com.java.Modifiers;

public class Default {
	int k = 67;

	void mpc() {
		System.out.println("Default method");

	}

	void cse() {
		System.out.println("def");
	}
}

class Default1 extends Default {
	void mpc() {
		System.out.println("child method");

	}

	protected void cse() {
		System.out.println("defff");
	}

	public static void main(String[] args) {
		Default d = new Default1();
		
		d.mpc();
		d.cse();
		
	}
}
