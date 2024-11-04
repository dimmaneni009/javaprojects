package com.java.Modifiers;

public class Private {
	
	static int i = 123 ;
	
    private void Abcd() {
    	i=10;
    	
    	System.out.println("private method");
    	System.out.println(i);
   	 
    }
   	
  public static void main (String[] args) {
   			Private p = new Private();
   			Public q = new Public();
   			q.EEE();
   			System.out.println(q.j);
   			p.Abcd();
   			System.out.println(p.i);
   	}
}
 



