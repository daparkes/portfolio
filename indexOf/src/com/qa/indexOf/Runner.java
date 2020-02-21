package com.qa.indexOf;

public class Runner {
	public static void main(String[] args) {
		System.out.println(indexOf('e',""));
	}

	public static int indexOf(char c, String sentence) {
		char[] senArray = sentence.toCharArray();
		for (int i = 1; i<=sentence.length(); i++) {
			if (senArray[i] == c) {
				return i;
			}
		}
		return -1;
	}

}