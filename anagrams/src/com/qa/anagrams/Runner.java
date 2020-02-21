package com.qa.anagrams;

import java.util.ArrayList;
import java.util.List;

public class Runner {
	public static void main(String[] args) {
		System.out.println(anagrams("Hello", "oll eh"));
	}
	
	public static boolean anagrams(String a, String b) {
		List<Character> listA = new ArrayList<>();
		List<Character> listB = new ArrayList<>();
		char[] charA = a.replace(" ","").toLowerCase().toCharArray();
		char[] charB = b.replace(" ","").toLowerCase().toCharArray();
		
		for (char c : charA) {
			listA.add(c);
		}
		for (char c : charB) {
			listB.add(c);
		}
		listA.sort(null);
		listB.sort(null);
		
		return listA.equals(listB);
	}
}
