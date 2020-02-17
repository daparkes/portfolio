package com.qa.find;

public class Runner {

	public static void main(String[] args) {
		System.out.println(find("Hello", 2, 'e'));
	}

	static boolean find(String str, int index, char letter) {
		char[] strArray = str.toCharArray();
		if (strArray[index-1] == letter) {
			return true;
		} else {
			return false;
		}
	}
}
