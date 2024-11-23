package com.java.Library;

public class Student {
	
	    private int id;
	    private String name;
	    private int age;
	    private String gender;
	    private String course;

	    // Getters and Setters
	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getGender() {
	        return gender;
	    }

	    public void setGender(String gender) {
	        this.gender = gender;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", course=" + course
					+ "]";
		}

}


