package com.qa.chickenAndRabbit;

public class Runner {
	public static void main(String[] args) {
		chickenAndRabbits(35, 94);
	}
	
	public static void chickenAndRabbits(int heads, int legs) {
		int chickenNumber = (heads*2) - (legs/2);
		int rabbitNumber = chickenNumber-heads;
		if (chickenNumber >= 0 && rabbitNumber >= 0) {
			System.out.println("Number of chickens: " + chickenNumber + "\nNumber of rabbits: "
					+ rabbitNumber);
		}
	}
}
