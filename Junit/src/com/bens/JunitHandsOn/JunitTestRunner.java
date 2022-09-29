package com.bens.JunitHandsOn;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import junit.framework.TestResult;

public class JunitTestRunner {

	public static void main(String[] args) {

		Result rst = JUnitCore.runClasses(JunitTest.class);

		System.out.println(rst.getRunTime());

		for (Failure flr : rst.getFailures()) {

			System.out.println(flr.toString());
		}

		System.out.println(rst.wasSuccessful());
		

	}

}
