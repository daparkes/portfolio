package com.qa.chickenAndRabbit;

public class Runner {
	public static void main(String[] args) {
		chickAndRabbit(35, 94);
		chickenAndRabbitMaths(35, 94);
	}
	
	// Brute force
	public static void chickAndRabbit(int heads, int legs) {
		boolean solution = false;
		for (int i=0; i<=heads; i++) {
			int r = heads-i;
			int c = i;
			if ((r*4 + c*2) == legs) {
				System.out.println("rabbits: " + r);
				System.out.println("chickens: " + c);
				solution = true;
			}
		}
		if (solution == false) {
			System.out.println("No solution found.");
		}
	}
	
	// Algebraic solution
	public static void chickenAndRabbitMaths(int heads, int legs) {
		int rabbit = (legs/2) - heads;
		System.out.println("rabbits: " + rabbit);
		int chicken = heads - rabbit;
		System.out.println("chickens: " + chicken);
	}
}
