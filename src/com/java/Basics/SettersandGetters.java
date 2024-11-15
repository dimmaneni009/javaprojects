package com.java.Basics;

public class SettersandGetters {
	private long Trainnum ;
	private float Traintime;
	private String Trainname;
	private int Reservationno;
	private int whichclass;
	private String Destination;
	
	
	public long getTrainnum() {   //get method must have return typa
		return Trainnum;
	}
	public void setTrainnum(long Trainnum) {
		this.Trainnum=Trainnum;
	}
	
	public void setTraintime(float Traintime){ //set
		this.Traintime=Traintime;
	}	
	public float getTraintime() {
		return Traintime;
	}
		
	public void setTrainname(String Trainname) {
		this.Trainname=Trainname;
	}
	public String getTrainname() {
		return Trainname;
		
	}
	public int getReservationno() {
		return Reservationno;
	}
	public void setReservationno(int Reservationno) {
		}  
	 
//    
     


}




  
    

 