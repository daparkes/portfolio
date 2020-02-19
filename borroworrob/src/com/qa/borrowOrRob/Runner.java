package com.qa.borrowOrRob;

public class Runner {
	public static void main(String[] args) {
		System.out.println(borrowOrRob("race car"));
		System.out.println(palindrome("Borrow Or Rob"));
	}
	
	public static boolean borrowOrRob(String sentence) {
		boolean isPalindrome = true;
		String noSpace = sentence.replace(" ", "");
		char[] array = noSpace.toCharArray();
		for (int i = 0; i < noSpace.length()/2; i++) {
			if (array[i] != array[noSpace.length()-1-i]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
	
	//different implementation
	public static boolean palindrome(String sentence) {
		String sen = sentence.replace(" ", "").toLowerCase();
		String reversedString = "";
		for (int i = sen.length()-1; i>=0; i--) {
			reversedString = reversedString + sen.charAt(i);
		}
		return sen.equals(reversedString);
	}
}
