package com.java.Basics;

public class EmployeeDAOException extends Exception {
	public EmployeeDAOException() {                  //public Exception() {
        super();
		                                               //super();
	}

	public EmployeeDAOException(String msg) {
		super(msg);
	}

	public EmployeeDAOException(String msg, Throwable cause) {
		super(msg, cause);                                                  //  public Exception(String message, Throwable cause) {
                                                                          // super(message, cause);
	}
}


