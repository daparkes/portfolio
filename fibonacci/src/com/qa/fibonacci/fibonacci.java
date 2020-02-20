package com.qa.fibonacci;

public class fibonacci {

	public static void main(String[] args) {
		
	}
	public static int sequence(int pos) {
		for (int i = 1, j = 0, x=1; i<=pos;i++) {
			int temp = j;
			j = x + j;
			x = temp;
		}
		return 
	}
}
