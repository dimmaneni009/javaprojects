package com.java.String;
import java.util.ArrayList;
//public class Linkedlist {
	
	
		//public static void main(String args[]) {
		//ArrayList<String> dd=new ArrayList<String>();
		//dd.add("hi");
		//dd.add("hello");
		//dd.add("this");
		//dd.add("method");
		//dd.add("is add");
		//System.out.println(dd);
		//dd.remove(1);
		//System.out.println(dd);
		//System.out.println(dd.get(1));

		//import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.Map;
import java.util.Set;

		public class Linkedlist {
			public static void main(String[] args) {

				ArrayList<String> l = new ArrayList<String>();
				l.add("hey1");
				l.add("hey2");
				l.add("hey3");
				l.add("hey4");
				l.add("hey5");
				l.add("hey6");
				l.set(4, "Hey10");

				System.out.println(l);
				
				Map<Integer, String> m = new HashMap<Integer, String>();

				m.put(1, "Hyd"); // Entry e = new Entry(k, v, null);
				m.put(2, "Gun");
				m.remove(2);
				m.containsKey(2);
				m.containsValue("Ram");
				m.get(1);
				m.entrySet();
				m.putIfAbsent(1, "Sap");
				m.replace(1, "ong");
	            m.size();
	            m.clear();
	           // m.entrySet();
	           
	            
			
			
			}
	}


