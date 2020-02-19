package com.qa.fizzBuzzSnapPop;

public class Runner {
	public static void main(String[] args) {
		System.out.println(fizzBuzzSnapPop(105));
	}
	
	public static String fizzBuzzSnapPop(int num) {
		String str = "";
		
		if (num % 3 == 0) {
			str += "fizz";
		}
		if (num % 5 == 0) {
			str += "buzz";
		}
		if (num % 7 == 0) {
			str += "snap";
		}
		if (num % 11 == 0) {
			str += "pop";
		}
		
		if (str == "") {
			return String.valueOf(num);
		} else {
			return str;
		}
	}
}
