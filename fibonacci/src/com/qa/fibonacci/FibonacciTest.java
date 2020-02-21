package com.qa.fibonacci;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibonacciTest {
	@Test
	public void recursionTest() {
		Runner run = new Runner();
		assertEquals(102334155, run.fibonacci(50));
	}
	@Test
	public void interationTest() {
		Runner run = new Runner();
		assertEquals(102334155, run.sequence(50));
	}
}
