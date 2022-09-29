package com.bens.JunitHandsOn;

import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

public class JunitAnnotaions extends TestCase {

	int b;
	int a;

	@Before

	public void setup() {
		b = 20;
		a = 20;
	}

	@Test
	public void testMethod1() {
		System.out.println("test method 1");
		System.out.println(this.countTestCases());
		int c = b + a;
		System.out.println(c);
		
	}

}
