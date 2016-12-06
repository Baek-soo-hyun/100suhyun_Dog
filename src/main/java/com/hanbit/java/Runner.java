package com.hanbit.java;

import com.hanbit.animal.Dog;

public class Runner {
	
	public static void main(String[] args) {
		Dog dog = new Dog("도베르만", "검정");
		Dog dog2 = new Dog("검둥이", "도베르만", "검정");
		Dog dog3 = new Dog("바둑이", "달마시안", "검정/흰색");

		
		System.out.println(dog);
		System.out.println(dog2);
		System.out.println(dog3);
	}

}
