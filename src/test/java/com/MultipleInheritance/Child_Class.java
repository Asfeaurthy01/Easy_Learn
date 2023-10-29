package com.MultipleInheritance;

public class Child_Class implements Parents_A, Parents_B {

	@Override
	public void getGold() {
		System.out.println("Parents_B Property : Gold ");
	}

	@Override
	public void getHome() {

		System.out.println("Parents_A Property : Home ");

	}
	
	public static void main(String[] args) {
		
		Child_Class obj = new Child_Class();
		
		obj.getGold();
		obj.getHome();
	}

}
