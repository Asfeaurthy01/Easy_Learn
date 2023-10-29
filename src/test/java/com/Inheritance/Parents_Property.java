package com.Inheritance;

public class Parents_Property extends GrandParents_Property {

	public void getHouse() {
		System.out.println("Parents House");

	}

	public void getBusiness() {
		System.out.println("Parents Business");

	}

	public static void main(String[] args) {
		
		Parents_Property obj = new Parents_Property();
		obj.getBusiness();
		obj.getHouse();
		obj.getLand();

	}

}
