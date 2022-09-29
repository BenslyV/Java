package com.bens.udemy;

import java.util.Scanner;

public class JavaUdemy {

	int adda;
	int addb;

	public static void main(String[] args) {
		System.out.println(JavaUdemy.add(10, 7));
		int result = JavaUdemy.add(30, 5);
		System.out.println(result);
	}

	static int add(int a, int b) {
		int addition = a + b;
		return addition;
	}

	void misc() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		int max = Integer.MIN_VALUE;
		System.out.println(max);
		int byt = Byte.SIZE;
		System.out.println(byt);
		int a = (int) 2.8;
		System.out.println(a);
	}

	void parse() {
		String str = "234";
		int in = Integer.parseInt(str);
		double dou = Double.parseDouble(str);
		System.out.println("int and dou" + in + dou);

		Scanner sc = new Scanner(System.in);
	}

	public JavaUdemy(int a, int b) {
		// TODO Auto-generated constructor stub
		this.adda = a;
		this.addb = b;
	}

	public void add() {
		int addition = adda + addb;
		System.out.println(addition);
	}

	public void sub() {
		int sub = adda - addb;
		System.out.println(sub);
	}

}
