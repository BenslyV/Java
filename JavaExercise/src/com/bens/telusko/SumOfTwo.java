package com.bens.telusko;

import java.io.InputStream;
import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println(a + b);

		System.out.println(27 + 39);

		Scanner in = new Scanner(System.in);
		/*
		 * System.out.println("Values of c"); int c = in.nextInt();
		 * System.out.println("value of D"); int d = in.nextInt(); System.out.println(c
		 * + d); System.out.println("printing line");
		 */

		System.out.println("Divition" + b / a);

		System.out.println(-5 + 8 * 6);
		System.out.println((55 + 9) % 9);

		System.out.println(20 + -3 * 5 / 8);
		System.out.println(5 + 15 / 3 * 2 - 8 % 3);
		int w = -5 + 8 * 6;
		int x = (55 + 9) % 9;
		int y = 20 + (-3 * 5 / 8);
		int z = 5 + 15 / 3 * 2 - 8 % 3;

		System.out.print(w + "\n" + x + "\n" + y + "\n" + z);
		System.out.println("\r\nhello " + "\n" + "world");
		System.out.println("Input Mul1");

		int mul1 = in.nextInt();
		System.out.println("Inut Mul2");

		int mul2 = in.nextInt();
		System.out.println(mul1 * mul2);
		
		System.out.println(mul1 % mul2);

	}

}
