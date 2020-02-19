package com.qa.uniqueList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Runner {
	public static void main(String[] args) {
		System.out.println(uniqueList("Hello all of you"));
		System.out.println(uniqueLetters("hello"));
	}
	
	public static String uniqueList(String sentence) {
		char[] sArray = sentence.toCharArray();
		ArrayList<String> outputArray = new ArrayList<>();
		for (char c : sArray) {
			if (!outputArray.contains(String.valueOf(c))) {
				outputArray.add(String.valueOf(c));
			}
		}
		String output = "";
		for (String s : outputArray) {
			output += s;
		}
		return output;
	}
	
	public static String uniqueLetters(String sentence) {
		return Arrays.asList(sentence.split(""))
				.stream()
				.distinct()
				.collect(Collectors.joining(""));
	}
}
