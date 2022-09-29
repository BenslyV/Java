package com.bens.telusko;

public class Loops1 {

	public static void copyOflast3digitsOfsubstring() {
		String main_string = "Python 3.0";

		String last_three_chars = main_string.substring(main_string.length() - 3);
		System.out.println(last_three_chars + last_three_chars + last_three_chars + last_three_chars);
	}

	public static void shortLongShort() {
		String str1 = "Python";
		String str2 = "Tutorial";
		System.out.println(str1.length() + " " + str2.length());
		if (str1.length() >= str2.length())
			System.out.println(str2 + str1 + str2);
		else
			System.out.println(str1 + str2 + str1);
	}

	public static void main(String[] args) {
		//copyOflast3digitsOfsubstring();
		shortLongShort();
	}

}
