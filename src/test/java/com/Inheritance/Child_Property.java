package com.Inheritance;

public class Child_Property extends Parents_Property {
	// Single Inheritance >> connection between Parents and child> with help of extends keyword
	// Multilevel Inheritance >> connection between GrandParents/classA> Parents/ClassB> and child/ClassC> with help of extends keyword

	public void getCar() {

		System.out.println("Child Car");
	}

	public static void main(String[] args) {
		Child_Property obj = new Child_Property();

		obj.getCar();
		obj.getBusiness();
		obj.getHouse();
		obj.getLand();

	}

}
