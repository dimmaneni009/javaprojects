package com.java.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.Basics.EmployeeDAOException;

public class BookDAO {

	static final String JDBC_DRIVER = "org.h2.Driver";
	static final String DB_URL = "jdbc:h2:~/test";

	static final String USER = "sa";
	static final String PASS = "";
	Connection conn = null;
	Statement stmt = null;

	public Connection getConnection() throws BookDAOException, Throwable {
		try {
			    Class.forName(JDBC_DRIVER);
				conn = DriverManager.getConnection(DB_URL, USER, PASS);
			
		} catch (BookDAOException e) {
			throw new BookDAOException("Not able to Create DB Connection", e);
		}
		System.out.println("Creating Connection");
		return conn;
	}
	public Statement getStatement(Connection conn) throws BookDAOException {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			throw new BookDAOException("Not able to Create Statement", e);
		}
		return stmt;
	}
	 String createTableBooks = "CREATE TABLE Books (" +
             "id INT PRIMARY KEY," +
             "title VARCHAR," +
             "author VARCHAR," +
             "year INT)" ;
         
	try {
		int result = stmt.executeUpdate(createTableBooks);
	} catch (SQLException e) {
		throw new BookDAOException("Not able to Create Employee table", e);
	}
	return result;
}
}
	public int insertbook(Book b) throws BookDAOException {
		 String insertQuery = "INSERT INTO books  
		 
	}}
	 public String updateBook(Book b) throws BookDAOException {
	        String msg = "SUCCESS";
	        String updateQuery = "UPDATE book SET title = "'+ b.title()+"', author = '" +b.Author()+'" , year = "'+b.Year()'", WHERE id = "'+b.id()'";
	}
	
	 public String deleteBook(int bookId) throws BookDAOException {
	        String msg = "SUCCESS";
	        String deleteQuery = "DELETE FROM books WHERE id = "+b.id()+";
	
	}
	 public List<Book> getBooks() throws BookDAOException {
	        String selectQuery = "SELECT id, title, author, year, FROM books";
	        List<Book> books = new ArrayList<>();
	
	
	 }}
	
	
	
	
	
	
	
