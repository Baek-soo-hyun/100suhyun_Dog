package com.hanbit.java;

public class FirstClassRunner {
	public static void main(String[] args) {
		FirstClass firstClass = new FirstClass(3);
		FirstClass secondClass = new FirstClass(4);
		
		System.out.println(firstClass.addNumber(5));
		System.out.println(firstClass.addNumber(5));

		System.out.println(secondClass.getNumber());
		System.out.println(secondClass.addNumber(5));
	}

}
