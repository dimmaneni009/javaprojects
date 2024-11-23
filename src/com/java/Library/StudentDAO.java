package com.java.Library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.java.Basics.EmployeeDAOException;



public class StudentDAO {
	// JDBC driver name and database URL
		static final String JDBC_DRIVER = "org.h2.Driver";
		static final String DB_URL = "jdbc:h2:~/test";

		// Database credentials
		static final String USER = "sa";
		static final String PASS = "";

		Connection conn = null;
          Student st = new Student();
		public Connection getConnection() throws StudentDAOException {
			try {
				if (conn == null) {
					Class.forName(JDBC_DRIVER);
					conn = DriverManager.getConnection(DB_URL, USER, PASS);
				}else {
					return conn;
				}
			} catch (ClassNotFoundException e) {
				throw new StudentDAOException("Not able to Create DB Connection", e);
			} catch (SQLException e) {
				throw new StudentDAOException("Not able to Create DB Connection", e);
			}
			System.out.println("Creating Connection");
			return conn;
		}

		public Statement getStatement(Connection conn) throws StudentDAOException {
			Statement stmt = null;
			try {
				stmt = conn.createStatement();
			} catch (SQLException e) {
				throw new StudentDAOException("Not able to Create Statement", e);
			}
			return stmt;
		}
		
				   
        int result=0;

		public int insertStudent(Student st) throws StudentDAOException {
			String createtableSQL = "CREATE TABLE Student = ID INTEGER NOT NULL, NAME VARCHAR, AGE INTEGER, COURSE VARCHAR, GENDER VARCHAR, PRIMARYKEY(ID))";
				Connection conn = getConnection();

				Statement stmt = getStatement(conn);
			   
			    String insertQuery = "INSERT INTO students  " +
			                         " (" + st.getId() + ", '" + st.getName() + "', " + st.getAge() + ", '" +
			                         st.getGender() + "', '" + st.getCourse() + "')";
				
				 try {
				        result = stmt.executeUpdate(insertQuery);
				    } catch (SQLException e) {
				        throw new StudentDAOException("Not able to Insert Student into table", e);
				    }
                 return result;
}
		 public int updateStudent(Student student) throws SQLException {
			 Connection conn = getConnection(); 
	        	Statement stmt = getStatement(conn);
		 
		        String query = "UPDATE students SET "+"('" + st.getName() + "', "+ st.getAge() +",'"+ st.getGender() +"',
                                 '" + st.getCourse() +"'  WHERE id = "+ st.getId() +" )";
		      
		        	try {
		    			stmt.executeUpdate(updateDataQuery);
		    		} catch (SQLException e) {
		    			msg = "FAILED";
		    			throw new EmployeeDAOException("Not able to Update Employee in table", e);
		    		}
		    		return msg;
		    	}
		  public String deleteStudent(int id) throws SQLException, StudentDAOException {
			  
			  String msg = "SUCCESS";
				Connection conn = getConnection();

				try {
					Statement stmt = getStatement(conn);
				} catch (StudentDAOException e) {
					msg = "delete";
					throw new StudentDAOException("Not able to Delete Employee from table", e);
				}
				String deleteQuery = "DELETE EMPLOYEE WHERE ID = " + st.getId();
				return msg;
		  }
		  public List<Student> getAllStudents() throws SQLException {
		        
		        String query = "SELECT * FROM student";

		        try  {
		        	Connection conn = getConnection();

					Statement stmt = getStatement(conn);
		        
		            ResultSet rst = stmt.executeQuery(query);
		            while (rst.next()) {
		                Student st = new Student();
		                st.setId(rst.getInt("id"));
		                st.setName(rst.getString("name"));
		                st.setAge(rst.getInt("age"));
		                st.setGender(rst.getString("gender"));
		                st.setCourse(rst.getString("course"));
		                stList.add(st);
		            
		            }
				} catch (SQLException e) {
					throw new EmployeeDAOException("Not able to get Employee details from table", e);
				}
				return stList;
		       
		  }
}


		                 

                              
                                 	     

