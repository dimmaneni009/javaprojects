package com.java.Basics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Library {
	
	// JDBC driver name and database URL
		static final String JDBC_DRIVER = "org.h2.Driver";
		static final String DB_URL = "jdbc:h2:~/test";

		// Database credentials
		static final String USER = "sa";
		static final String PASS = "";
	
	public static void main(String[] args) throws SQLException {
		
		Scanner scanner = new Scanner(System.in);
	//connection
		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
		Statement stmt = conn.createStatement();
		//creating table
        String createSql = "CREATE TABLE LIBRARY " + "(id INTEGER not NULL, " + " TITTLE VARCHAR, "
				+ " AUTHOR VARCHAR, " + " USERNAME VARCHAR " + " PRIMARY KEY ( id ))";
        stmt.executeUpdate(createSql);
		
	//allowing user 
	System.out.println("enter book id:");
	int BOOKid = scanner.nextInt();
    System.out.print("Enter book title: ");
    String title = scanner.nextLine();
    System.out.print("Enter author: ");
    String author = scanner.nextLine();
    System.out.print("Enter publisher: ");
    String username = scanner.nextLine();
	}
   public static void insertbookdetails(int id,String TITTLE , String Author, String Username) {

	//  String sql = "INSERT INTO createsql " ;
	   String sql = "INSERT INTO books (id,TITTLE, Author, Username) VALUES ("+id+" ,+'" + TITTLE + "', '" + Author + "', '" + Username+ "');";
	 
	   try {
		   Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
	   
		   stmt = conn.createStatement();

           //  Execute the query
           stmt.executeUpdate(sql);
	   }
		   catch (SQLException e) {
	            // Handle SQL errors 
	            System.out.println("SQL error while saving book details: " + e.getMessage());
	   }}
	   // update
	   
	   private static void updateBookInDatabase(int Id, String TITTLE, String Author, String Username) {
	        String sql = "UPDATE books SET title = '" + TITTLE + "', Author = '" + Author + "', username = '" + Username + "' WHERE id = " + Id + ";";
	   
	   try {
		   Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql);
	   }catch(Exception e) {
	   
   }}
}
		   
      
			
	   
           // Create a statement
         //  stmt = conn.createStatement();

           // Step 2: Execute the query
         //  int rowsInserted = stmt.executeUpdate(sql);
   
   
 /*Connection con = getConnection();

	Statement stmt = getStatement(con);

	private Connection getConnection() {
		//try
		return null;
	}
	private Statement getStatement(Connection con2) {
	  
		//tryblock
		return null;
	}*/












    