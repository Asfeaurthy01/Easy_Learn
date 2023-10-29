package com.ny.javabasic;

public class Second_Test {
	// What is public? Ans : public is a access modifier.
	// What is static? Ans : Static is a java key word/ Non access modifier.
	// What is void? Ans: Void is a java key word which return nothing.
	// What is main? Ans: main is method name.
	// What is String? Ans: String is Non- primitive data type.
	// What is [] ? Ans: Take the multiple arguments/args

	public static void main(String[] args) {
		int salary = 100000;
		int pr_bonus = 5000;
		int signin_bonus = 10000;
		int total = (salary+ pr_bonus + signin_bonus);

		System.out.println("My yearly salary:: " + total);

	}

}
