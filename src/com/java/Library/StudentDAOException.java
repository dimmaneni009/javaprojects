package com.java.Library;

public class StudentDAOException extends Exception {
         public StudentDAOException() {
        	 super();
         }
         public StudentDAOException(String msg) {
        	 super(msg);
         } 	 
        	 public StudentDAOException(String message, Throwable cause) {
     	        super(message, cause);
}
}