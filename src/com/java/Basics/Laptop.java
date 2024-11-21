package com.java.Basics;

import java.util.Scanner;

public class Laptop {
	private String lapname;
	private int storage;
	private String display;
	private int ram;
	
	
	
		Scanner sr = new Scanner(System.in);
	 
		public String getLapname() {   
			return lapname;
		}
		public void setLapname(String lapname) {
			this.lapname=lapname;
		}	
		public void setStorage(int storage) {
			this.storage=storage;
		}
	
	  public int getStorage() {
		  return storage;
	  }
	public void setDisplay(String display) {
		this.display=display;
	}
	  public String getDiaplay() {
		  return display;
	  }
	  public void setRam(int Ram) {
		  this.ram=ram;
	  }
	  public int getRam() {
		  return ram;
	  }
	  public String getDetails() {
	        return "Name: " + lapname + ", storage: " + storage + ", display: " + display;
	    }
}
	 
	

	


