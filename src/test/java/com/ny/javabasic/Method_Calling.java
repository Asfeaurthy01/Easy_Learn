package com.ny.javabasic;

public class Method_Calling {

	public void getEmpInfo() {
		String SSN = "111-33-4676";
		System.out.println("Employee SSN Number: " + SSN);
	}

	String getEmpAddress() {
		String Address = "123 Main St";
		System.out.println("Employee Address: " + Address);
		return Address;

	}

	public void getEmpName(String name) {
		System.out.println("Employee Name:" + name);

	}

	public static void main(String[] args) {

		// How to call Non-static method?
		// Ans: In order to call a non static method we have to create an object.
		// How to create an object?
		// Ans: By Class name
		// What is the Syntax of creating an object?
		// Ans: ClassName ObjectName = new ClassName();

		Method_Calling object = new Method_Calling();
		object.getEmpAddress();
		object.getEmpInfo();
		object.getEmpName("Saimul");
		
		// How Java understand that you created an object?
		// Ans: As soon as we declare new key word then java understand that we have created an object.
	}
}
