package com.java.Modifiers;

public class Morphism {
	public static void main(String[] args) {
		Morphism m=new Mor1();
	    m.psw1();
		m.psw2();
		m.psw3();
		m.psw4();
	}
	
	private void psw1() {
		System.out.println("users");
	}

	private void psw2() {
		System.out.println("user2");
	}

	private void psw3() {
		System.out.println("user4");
	}

	private void psw4() {
		System.out.println("user6");
	}
}

class Mor1 extends Morphism {
	

	private void psw1() {
		System.out.println("username");
	}

	public void psw2() {
		System.out.println("user3");

	}

	protected void psw3() {
		System.out.println("user5");
	}

	void psw4() {
		System.out.println("user7");
	}
}
