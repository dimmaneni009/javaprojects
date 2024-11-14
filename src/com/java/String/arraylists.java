package com.java.String;

import java.util.ArrayList;

public class arraylists {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();   // // Object[] elementData = {}   ->   Object[] elementData = new Object[0];
		
		
		
		list.add("Hello");   // capacity 10, size 1
	    list.add("hello");   // capacity 10, size 2
	    list.add(10);       // capacity 10, size 3
	    list.add("10.6f"); 
	   
	    list.contains(list);
	    list.get(0);
	    
	   list.containsAll(list);
	  //list.iterator();
	   list.remove(1);
	   list.clear();      // remove all the elements from the list
	   list.set(2, 20);
	   list.size();
	  // list.sort();
	   list.clone();	
	   
	    
	    
	}

}
