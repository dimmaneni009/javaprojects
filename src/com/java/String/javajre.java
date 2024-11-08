package com.java.String;

import java.util.ArrayList;

public class javajre {
	
	public static void main(String[] args) {  	// Size 0, Capacity 0 
			ArrayList list = new ArrayList();   // // Object[] elementData = {}   ->   Object[] elementData = new Object[0];
			
			
			
			list.add("Hello");   // capacity 10, size 1
		    list.add("hello");   // capacity 10, size 2
		    list.add("10");       // capacity 10, size 3
		    list.add("10.6f");    // capacity 10, size 4
		    System.out.println(list); 
		    
		}
}
		
			
			 
		

