package com.qa.fibonacci;

public class Runner {

	public static void main(String[] args) {
		System.out.println(sequence(8));
	}
	
	public static int sequence(int pos) {
		int j = 0;
		int i = 1;
		for (int x=1; i<=pos; i++) {
			int temp = j;
			j = x + j;
			x = temp;
		}
		return j;
	}
}
