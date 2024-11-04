package com.java.Basics;

public class Dell extends AbstarctEx {

	
	public void Hp() {	
		System.out.println("HP");
		
	}

	public void hp() {
		System.out.println("hp");
		
		
	}
	public void Lenovo() {
		System.out.println("lenovo");
	}
	
	public static void main(String[] args) {
		Dell d=new Dell();
		d.Apple();
		d.Lenovo();
		d.storage();
	}

	@Override
	public void storage() {
	}
		
		
	}


