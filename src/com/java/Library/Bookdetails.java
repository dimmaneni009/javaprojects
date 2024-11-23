package com.java.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;
import java.util.Scanner;


public class Bookdetails {
	 public static void main(String[] args) throws BookDAOException{
		 Bookdetails book = new Bookdetails();
		
	        Scanner scr = new Scanner(System.in);
	        int choice;
	        choice = scr.nextInt();

	 do {
	            System.out.println("\nLibrary Management System \n 1.insert 2.update 3.delete 4.select 5. exit");
	        
	            System.out.print("Enter your choice: ");
	           
	         choice = scr.nextInt();
	    			
	    			switch (choice) {
	    			case 1:
	    				book.insertbook(scr);
	    				break;
	    			case 2:
	    				book.updatebook(scr);
	    				break;
	    			case 3:
	    				book.deletebook(scr);
	    				break;
	    			case 4:
	    				List<Book> empList = b.retrieveEmplyeeDetails();
	    				for (Employee employee : empList) {
	    					System.out.println(employee);
	    				}
	    				
	    				break;
	    			}
	 }while (choice != 5) ;
	 }
	

	private void deletebook(Scanner scr) {
		Book b = getBookDetails(scr, "delete");
	}

	private void updatebook(Scanner scr) {
		Book b = getBookDetails(scr, "update");
		
	}

  public void insertbook(Scanner scr) {
		Book b = getBookDetails(scr , "insert");
	}
   private Book getBookDetails(Scanner scr, String string) {
	    Book b = new Book();
	
	System.out.println("Enter book tittle");
	b.setTitle(scr.next());

	System.out.println("Enter book ");
	b.setAuthor(scr.next());

	System.out.println("Enter Emplyee Address");
	b.setYear(scr.nextInt());

	System.out.println("Enter Emplyee age");
	b.setId(scr.nextInt());

	return b;
}
		
}
	  			

