package com.ny.javabasic;

public class Method_Type_One {

	// Minimum requirements to create a method
	// getEmpInfo --> method name
	// {method body where we type some code }
	// void is java keyword which return nothing
	// public is a access modifier

	// Method declaration:  
	// Void method example:
	public void getEmpInfo() {
		String SSN = "111-33-4676";
		System.out.println("Employee SSN Number: " + SSN);
	}

	// return method example:
	String getEmpAddress() {
		String Address = "123 Main St";
		System.out.println("Employee Address: " + Address);
		return Address;

	}

	// Parameter method example:
	public void getEmpName(String name) {
		System.out.println("Employee Name:" + name);

	}

}
