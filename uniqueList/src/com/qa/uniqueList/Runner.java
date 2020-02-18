package com.qa.uniqueList;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		System.out.println(uniqueList("Hello all of you"));
	}
	
	public static List<String> uniqueList(String sentence) {
		char[] sArray = sentence.toCharArray();
		ArrayList<String> outputArray = new ArrayList<>();
		for (char c : sArray) {
			if (!outputArray.contains(String.valueOf(c))) {
				outputArray.add(String.valueOf(c));
			}
		}
		return outputArray;
	}
}
