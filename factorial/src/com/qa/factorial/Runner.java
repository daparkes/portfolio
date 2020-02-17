package com.qa.factorial;

public class Runner {

	public static void main(String[] args) {
		System.out.println(factorial(5));

	}
	
	static int factorial(int x) {
		int y = x;
		while (x > 1) {
			y += (x * (x-1));
			x--;			
		} return y;
	}

}
