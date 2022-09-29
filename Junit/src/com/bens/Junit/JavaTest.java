package com.bens.Junit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.*;

public class JavaTest extends TestCase {
	protected int value1, value2;

	// assigning the values
	protected void setUp() {
		value1 = 3;
		value2 = 3;
		System.out.println("Setup done");
	}

	// test method to add two values
	public void testAdd() {
		double result = value1 + value2;
		assertTrue(result == 6);
		System.out.println("Assert Done");
	}
}