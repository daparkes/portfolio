package com.qa.primeNumbers;

public class Runner {
	public static void main(String[] args) {
		System.out.println(primeNumbers(24));
	}
	
	public static int primeNumbers(int maxNum) {
		int x = 0;
		for (int i = 2; i < maxNum; i++) {
			boolean prime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					prime = false;
					break;
				}	
			}
			if (prime==true) {
				x++;
			}			
		}
		return x;
	}
	
}
