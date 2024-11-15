package com.java.Basics;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EmployeeDetails {
	static Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int perform = 0;
		do {
			System.out.println(
					"Avilable Operations \n 1. Insert \n 2. Update \n 3. Delete \n 4. Retrive \n 5. Exit. Please Select Your Operation ");
			perform = sc.nextInt();
			switch (perform) {
			case 1:
				insertEmployee(sc);
				break;
			case 2:
				updateEmployee(sc);
				break;
			case 3:
				deleteEmplyee(sc);
				break;
			case 4:
				retrieveEmplyeeDetails();
				break;
			
			}
		} while (perform != 5);
	}
			


	
	private static void retrieveEmplyeeDetails() {
		System.out.println(empMap);
		
	}
	private static void deleteEmplyee(Scanner sc) {
		System.out.println("Enter Emplyee Id");
		empMap.remove(sc.nextInt());
		
	}
	private static void updateEmployee(Scanner sc) {
		Employee emp = getEmployeeeDetails(sc, "Update");
		empMap.put(emp.getEmpId(), emp);
		
	}
	private static void insertEmployee(Scanner sc) {
		Employee emp = getEmployeeeDetails(sc, "Insert");
		empMap.put(emp.getEmpId(), emp);
		
	}
	public static Employee getEmployeeeDetails(Scanner sc, String perform) {
		Employee emp = new Employee();
		
		System.out.println("Enteremployee name:");
		emp.setEmpName(sc.next());
		System.out.println("Employee salary:");
		emp.setSalary(sc.nextInt());
        System.out.println("enter employe address:");
        emp.setAddress(sc.next());
		
		
		return emp;
		



}}
