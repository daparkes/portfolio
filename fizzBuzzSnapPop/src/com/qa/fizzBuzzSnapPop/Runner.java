package com.qa.fizzBuzzSnapPop;

public class Runner {
	public static void main(String[] args) {
		System.out.println(fizzBuzzSnapPop(13));
	}
	
	public static String fizzBuzzSnapPop(int num) {
		String str = "";
		
		if (num % 3  == 0) {
			str += "Fizz";
		}
		if (num % 5  == 0) {
			str += "Buzz";
		}
		if (num % 7  == 0) {
			str += "Snap";
		}
		if (num % 11 == 0) {
			str += "Pop";
		}
		
		if (str.equals("")) {
			return String.valueOf(num);
		} else {
			return str;
		}
	}
}
