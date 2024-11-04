package com.java.String;

public class StringEx {
	public static void main(String[] args) {
		String s1="DIVYA";          // string pool 
		String s2="Java class";
		String s3="divya";
		String s4="welcome";
		String s5="100";
		String s6= "   ";
		String name="first class";
		System.out.println(name.length());
		System.out.println(s6.length()); 
//		System.out.println(s6.isBlank());  // nospace
//		System.out.println(s6.isEmpty());  // it will count spaces
		System.out.println(s1);
		System.out.println(s2);
		 System.out.println(s4);
		 
		 
	  String str=new String("DIVYA");    //heap 
	  System.out.println(str.length());
	  System.out.println(str);
	 // System.out.println(new StringEx());
	  
//STRING METHODS:
	  
	     System.out.println(s1.equals(s3));                   // equals method (to verify data) 
         System.out.println(s1.equalsIgnoreCase(s3));         //sensitive comparison
	     System.out.println(s3.contains("i"));                 // verify 
         System.out.println(s2.length());                     //length
         System.out.println(s1.concat(s4));                //s1+s4
         System.out.println(s1.charAt(1));           //to find char
         System.out.println(s2.indexOf('a'));                 // index of first "a"
         System.out.println(s2.lastIndexOf('a'));             //index of last "a"
         System.out.println(s1.toLowerCase());
         System.out.println(s2.trim());                 //to avoid leading spaces and ending spaces
         System.out.println(s2.substring(2));                //print from index 2 to last 
         System.out.println(s2.substring(2, 6));           // print from index to index 6    
         System.out.println(s2.replace('a', 'o'));                 // to replace char
         System.out.println(s2.replace("class", "welcome"));         // replace word
       System.out.println(s2.codePointAt(0));                    // unicode values
       System.out.println(s1.valueOf('D'));
      //System.out.println(s5.repeat(0));
       
       
          
      // System.out.println(s2.chars());
      //System.out.println(s2.split("  ")); 
	     
	   
	
	
	}
	

}
