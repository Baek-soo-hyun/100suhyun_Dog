package com.hanbit.java;

public class FirstClass {
	int number; //멤버변수(파란색)
	int sum;
	
	FirstClass(int number) {
		this.number=number;
	}

	int getNumber() {
		return number;
	} //멤버메서드

	int addNumber(int add) { //지역매개변수 (갈색)
		number += add;
		
		int sum = number;
		this.sum = sum; //this. 은 이름이 동일한 멤버/지역 변수를 구분해준다. 
		
		return number;
	}

}
