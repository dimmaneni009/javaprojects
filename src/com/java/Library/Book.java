package com.java.Library;

public class Book {                                   
	                                         
	    private int id;                        
	    private String title;
	    private String author;
	    private int year;

	 
	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public int getYear() {
	        return year;
	    }

	    public void setYear(int year) {
	        this.year = year;
	    }
        //System.out.println("ID: " + book.getId() + ", Title: '" + book.getTitle() + "',
	    //                    Author: " + book.getAuthor() + ", Year: " + book.getYear());

	    // Method to print book details as a formatted string
	   
	    public String getBookDetails() {
	        return "ID: " + id + ", Title: '" + title + "', Author: " + author + ", Year: " + year;
	    }

	
	}



