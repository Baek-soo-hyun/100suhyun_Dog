package com.hanbit.java;


public class Loop {

	public static void main(String[] args) {
		
		/*
		 * countDown 함수를 만들어서
		 * 입력받은 숫자부터 0까지를 출력하시오.
		 */
		
		countDown(10);
		countDown2(10);
		countDown3(10);
		countDown4(10);
	}
	
	
	/**
	 * for-each문 사용 
	 * 인덱스를 굳이 만들어서 사용
	 */
	static void countDown7(int input) {
		int[] numbers = new int[input + 1];
		int init = input; // init은 멤버변수라서 변하지 X
		for (int number : numbers) {
			numbers[init - input] = input--;
			//input은 지역변수라서 값이 변함 (for 안에서는 init은 변하지x / input만 변함)
			// 초기값이 동일한 init 과 input을 서로 빼면 0이 됨, 그후에 -1씩되는 input을 init에 빼주면 남은 수는 하나씩 중가하게 됨 -> index로 활용
		}

		for (int num : numbers) {
			System.out.println(num);
		}
	}
	
	
	
	/**
	 * for-each문 사용 
	 * 인덱스가 없을 때 사용
	 */
	static void countDown6(int input) {
		int[] numbers = new int[input + 1]; // 1~10 + 0도 찍어야 하니까 +1
		for (int number : numbers) {
			System.out.println(input--);
		}
		// for each문 : 인덱스 i가 없어도 ★배열의 길이만큼만★ 수행문을 반복함
		// (int number : numbers) -> numbers[]의 문자열들을 리스트로 가진다.
		// int number은 numbers[]의 i번째 문자
	}
	
	
	/**
	 * 재귀호출 사용
	 */
	static void countDown5(int input) {
		if (input < 0) {
			return;
		}
		System.out.println(input);

		countDown5(--input); //재귀호출(함수가 자기 자신을 호출하는 것)으로도 반복 가능 
	}

	
	/**
	 * while문 사용
	 */
	static void countDown4(int input) {
		while (true) {
			System.out.println(input--);

			if (input < 0) {
				break;
			}
		}
	}
	
	
	static void countDown3(int input) {
		while (input >= 0) {
			System.out.println(input--);
		}
	}
	

	/**
	 * for문 사용
	 */
	static void countDown(int input) {
		for (int i = 0; i <= input; i++) {
			System.out.println(input - i);
		}
	}
	
	
	/**
	 * for문 사용
	 */
	static void countDown2(int input) {
		for (int i = input; i >= 0; i--) {
			System.out.println(i);
		}
	}

}
