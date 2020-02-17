package com.qa.factorial;

public class Runner {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}
	
	static int factorial(int x) {
		int y=x;
		
		for (int i = x ; i > 2 ; i--) {
			x--;
			y *= x;
			
		} return y;
	}
}
