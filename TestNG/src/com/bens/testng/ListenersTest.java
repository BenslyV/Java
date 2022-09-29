package com.bens.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.bens.testng.TestNGListeners.class)
public class ListenersTest {
	@Test
	public void test1() {
		System.out.println("Test");
	}
}
