package com.java.String;

public class Student {
		public int studentId;

		public String studentName;

		public int whichClass;

		public Student(int studentId, String studentName, int whichClass) {
			this.studentId = studentId;
			this.studentName = studentName;
			this.whichClass = whichClass;
		}

		@Override
		public String toString() {
			return "Student Id:\t " + studentId + "\n Stduent Name:\t " + studentName + "\n Which Class:\t " + whichClass;
		}

	
public static void main(String[] args) {
	Student[] std = {new Student(100, "Hari", 10), new Student(100, "Hari", 10), new Student(100, "Hari", 10)};
	
	Student[]  std2 = new Student[1000];
	std2[0] = new Student(100, "Hari", 10);
	
	System.out.println("");
}
}
	
	



