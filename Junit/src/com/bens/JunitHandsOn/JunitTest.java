package com.bens.JunitHandsOn;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JunitTest {

	String msd = "message";
	String msg1 = "message";

	@Test
	public void testMethod() {

		assertEquals("1message1", msd);
		System.out.println("Assert Done using Junit");
	}
	
	@Test
	public void testMethod2() {

		assertEquals("1message1", msd);
		System.out.println("Assert Done using Junit");
	}
	
	@Test
	public void testMethod3() {

		assertEquals("message", msd);
		System.out.println("Assert Done using Junit");
	}

}
