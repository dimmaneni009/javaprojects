package com.java.Library;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Studentdetails {
	StudentDAO dao = new StudentDAO();

	public static void main(String[] args) throws StudentDAOException, SQLException {
		Scanner sc = new Scanner(System.in);
		Studentdetails std = new Studentdetails();

		int perform = 0;
		do 
		{
			System.out.println("Avilable Operations \n 1. Insert \n 2. Update \n 3. Delete \n 4. Retrive \n 5. Exit. Please Select Your Operation ");
			perform = sc.nextInt();
			switch (perform) {
			case 1:
				std.insertStudent(sc);
				break;
			case 2:
				std.updateStudent(sc);
				break;
			case 3:
				std.deleteStudent(sc);
				break;	
			case 4:
				List<Student> stList = std.retrieveStudentDetails();
				for (Student student : stList) {
					System.out.println(student);
				}	
				break;
			}
				} while (perform != 5);
		}
			private void deleteStudent(Scanner sc) {
		Student st = getStudentdetails(sc, "delete");
		
	}
			private List<Student> retrieveStudentDetails() throws StudentDAOException, SQLException {
				return dao.getAllStudents();
		
	}
			private void updateStudent(Scanner sc) throws StudentDAOException, SQLException{
				Student st = getStudentdetails(sc, "Update");
				
				dao.updateStudent(st);
		
	}
			private void insertStudent(Scanner sc) throws StudentDAOException {
				Student st = getStudentdetails(sc, "Insert");
				
		dao.insertStudent(st);
	}
			public Student getStudentdetails(Scanner sc, String operation) {
				 Student st = new Student();
				 if (operation.equalsIgnoreCase("Insert") || operation.equalsIgnoreCase("Update")) {
						System.out.println("Enter student Id");
						st.setId(sc.nextInt());
					}
				
				System.out.println("Enter student id");
				st.setId(sc.nextInt());

				System.out.println("Enter student Name");
				st.setAge(sc.nextInt());

				System.out.println("Enter student course");
				st.setCourse(sc.next());

				System.out.println("Enter student age");
				st.setName(sc.next());

				System.out.println("Enter student Geneder");
				st.setGender(sc.next());

				return st;
			}
}


