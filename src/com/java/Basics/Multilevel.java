package com.java.Basics;

class Pa1 {
	
   void add() {
		
		System.out.println("Print add");
	
		}
}

class Pa2 extends Pa1{
	void sub() {
		System.out.println("print sub");
	}
}

class Pa3 extends Pa2{
	void mul() {
		System.out.println("print mul");
	}
}
public class Multilevel {
	
	public static void main (String[] args) {
	Pa3 pa=new Pa3();
	pa.mul();
	pa.sub();
	pa.add();
		
	}

}
