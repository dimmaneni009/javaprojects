package com.java.Basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Traindetails {
	static Map<Integer,SettersandGetters> sgmap =new HashMap<Integer,SettersandGetters>();

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		SettersandGetters sg1= getStudentData(sc);
		List<SettersandGetters> ls=new ArrayList<SettersandGetters>();
		ls.add(sg1);
		
		SettersandGetters sg2= getStudentData(sc);
		ls.add(sg2);
		
		
	}
	
	public static SettersandGetters getStudentData(Scanner sc) {
		SettersandGetters sg = new SettersandGetters();
		System.out.println("Enter Trainnum: ");
		sg.setTrainnum(sc.nextLong());
		System.out.println("Enter traintime ");
		sg.setTraintime(sc.nextFloat());
		System.out.println("enter trainname: ");
		sg.setTrainname(sc.next());
		System.out.println("Enter Reservationno:   ");
		sg.setReservationno(sc.nextInt());
		
		return sg;
}}
