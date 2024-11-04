package com.java.Basics;

class Ppa1{
	void add() {
		System.out.println("print Pa1");
		
	}
}
class Ppa2 extends Pa1{
	void sub() {
		System.out.println("Print Pa2 ");
	
	}
}

class Ppa3 extends Pa1{
	void mul() {
		System.out.println("Print pa3");
		
	}
	
}
public class Hierarchical {
    public static void main (String[] args) {
    	Ppa3 p=new Ppa3();
    	Ppa2 pp=new Ppa2();
    	p.mul();
    	p.add();
    	pp.sub();
    	pp.add();
    	
    }
}
