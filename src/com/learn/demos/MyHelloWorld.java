package com.learn.demos;

public class MyHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		swapNumbers();
		reverseArrayUsingLoop();
		checkForPalindrome("asdsa");

	}

	private static void checkForPalindrome(String string) {
		// TODO Auto-generated method stub

		/*for (int i = 0; i < (chars.length / 2); i++) {

			char c = chars[i];
			char d = chars[chars.length - (i + 1)];
			chars[i] = d;
			chars[chars.length - (i + 1)] = c;

		}*/

		
		
	}

	private static void reverseArrayUsingLoop() {

		char[] chars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };

		for (int i = 0; i < (chars.length / 2); i++) {

			char c = chars[i];
			char d = chars[chars.length - (i + 1)];
			chars[i] = d;
			chars[chars.length - (i + 1)] = c;

		}

		System.out.println(chars);
	}

	private static void swapNumbers() {
		int a = 20, b = 30;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" a " + a + " - b " + b);
	}

}
