package com.java.Library;

public class BookDAOException extends Exception{
      public BookDAOException() {
    	  super();
      }
    	  public BookDAOException(String msg) {
    	        super(msg);
    		
    	}
    	  public BookDAOException(String message, Throwable cause) {
    	        super(message, cause);
}
}