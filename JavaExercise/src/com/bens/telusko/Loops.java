package com.bens.telusko;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.Reader;
import java.nio.charset.Charset;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.apache.commons.*;
import org.apache.commons.lang3.StringUtils;

public class Loops {
	int avg1;
	int tot;

	public void exercise2() {
		System.out
				.println("Write a Java program to display the following pattern.\r\n" + "\r\n" + "Sample Pattern :\r\n"
						+ "\r\n" + "   J    a   v     v  a                                                  \r\n"
						+ "   J   a a   v   v  a a                                                 \r\n"
						+ "J  J  aaaaa   V V  aaaaa                                                \r\n"
						+ " JJ  a     a   V  a     a");
		System.out.println("Actual Output");

		System.out.println("   J    a   v     v  a ");
		System.out.println("   J   a a   v   v  a a");
		System.out.println("J  J  aaaaa   V V  aaaaa");
		System.out.println(" JJ  a     a   V  a     a");

	}

	public static void exercise1() {
		System.out.println("pgm that takes a number and prints its mul table uptoExpected Output :\r\n"
				+ "8 x 1 = 8\r\n" + "8 x 2 = 16\r\n" + "8 x 3 = 24\r\n" + "...\r\n" + "8 x 10 = 80");

		System.out.println("Actual Output");
		int val = 8;
		int i;
		for (i = 1; i <= 10; i++) {
			System.out.println(val + "X" + i + " = " + val * i);

		}

	}

	private void e3() {
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));

		System.out.println("Expression 2");
		double pi = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));
		System.out.println(pi);

	}

	public void perimeterOfCircle() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the radies of the circle");
		double r = s.nextDouble();
		double perimeter = 2 * Math.PI * r;
		double squareForArea = Math.pow(r, 2);
		double area = Math.PI * squareForArea;
		System.out.println("Perimeter of the Circle is----  " + perimeter);
		System.out.println("Area of the circle is ------" + area);
		s.close();
	}

	public int avgOfThree(int a) {
		int b = 20, c = 9;
		int total = a + b + c;
		int avg = total / 3;
		// System.out.println(avg);
		// Other solution using loops
		return avg;

		/*
		 * int[] numbers= {18,20,7}; System.out.println("Input values"); int t=0; for
		 * (int i = 0; i < numbers.length; i++) { t += numbers[i];
		 * System.out.println(t); } int avg1=t/numbers.length;
		 * 
		 * System.out.println("Average of three"+avg1); return avg1;
		 */
	}

	public void rectangle() {
		// Formula P=2l+2w , A=lw
		double length = 8.5;
		double width = 5.5;
		System.out.println("Area of rectangal is ---" + length * width);
		System.out.println("Perimeter of rectangal is" + 2 * (length + width));
	}

	public void americanFlagonScreen() {
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println(" * * * * *  ==================================");
		System.out.println("* * * * * * ==================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
		System.out.println("==============================================");
	}

	public void swapTwoNumbers() {
		/*
		 * int a=10; int temp=a; int b=20; //The simplest method to swap two variables
		 * is to use a third temporary variable :
		 * System.out.println("Before Swapping"+a+b); a=b; b=temp;
		 * 
		 * System.out.println("After Swapping"+a+b);
		 */
		// Without using third variable
		System.out
				.println("logic for swapping --- a=a+b; a=15, b=10\r\n" + "b=a-b; a=15, b=5\r\n" + "a=a-b; a=10, b=5");
		int a, b;
		a = 15;
		b = 27;
		System.out.println("Before swapping : a, b = " + a + ", " + +b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("After swapping : a, b = " + a + ", " + +b);

	}

	public void binaryNoAddition() {
		Scanner s = new Scanner(System.in);
		System.out.println("First Line");
		String one = s.nextLine();
		System.out.println("Second Line");
		String second = s.nextLine();
		int one1 = Integer.parseInt(one);
		int second2 = Integer.parseInt(second);
		int sum = one1 + second2;
		String binSum = Integer.toBinaryString(sum);
		System.out.println("Binary addition -----" + binSum);
		s.close();
	}

	private static void javaInstalled() {

		System.out.println("\nJava Version: " + System.getProperty("java.version"));
		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
		System.out.println("Os Version" + System.getProperty("os.version"));
	}

	private static void compareTwoNumbers() {
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		int number1; // first number to compare
		int number2; // second number to compare

		System.out.print("Input first integer: "); // prompt
		number1 = input.nextInt(); // read first number from user

		System.out.print("Input second integer: "); // prompt
		number2 = input.nextInt(); // read second number from user

		if (number1 == number2)
			System.out.printf("%d == %d\n", number1, number2);
		if (number1 != number2)
			System.out.printf("%d != %d\n", number1, number2);
		if (number1 < number2)
			System.out.printf("%d < %d\n", number1, number2);
		if (number1 > number2)
			System.out.printf("%d > %d\n", number1, number2);
		if (number1 <= number2)
			System.out.printf("%d <= %d\n", number1, number2);
		if (number1 >= number2)
			System.out.printf("%d >= %d\n", number1, number2);
	}

	private static int sumOfDigits() {
		int sum = 0;
		int n = 234;
		while (n != 0) {
			sum += n % 10;
			n /= 10;
		}
		return sum;

	}

	public static boolean booleanReturn() {
		int a = 10, b = 20;
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean bool2(int num) {
		boolean success = true;

		/*
		 * Scanner in = new Scanner(System.in); int num = in.nextInt();
		 */

		if (num > 10) {
			// Handle the condition.
			success = false;
		} else if (num > 20) {
			// Handle the other condition.
			success = false;
		}
		if (num > 50) {
			// Handle the third condition.
		}

		// Do some more critical things.
		// in.close();

		return success;

	}

	public static void reverseAString() {
		String a = "helloworld";
		int i = a.length();

		while (i != 0) {
			System.out.print(a.charAt(i - 1));
			i--;
		}
	}

	public static void countAString() {

		String a = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";

		char[] cha = a.toCharArray();
		System.out.println(cha);
		int letter = 0;
		int space = 0;
		int digit = 0;

		for (char c : cha) {

			if (Character.isLetter(c)) {
				letter++;
			}

			if (Character.isSpace(c)) {

				space++;
			}
			if (Character.isDigit(c)) {

				digit++;
			}

		}

		System.out.println("count of letters " + letter);
		System.out.println("count space " + space);
		System.out.println("count of letters " + digit);

	}

	public static void countUniqueNumbers() {
		int count = 0;
		System.out.println("Unique Numbers would be");
		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 5; j++) {
				for (int k = 1; k < 5; k++) {
					// System.out.println("Unique Numbers would be");

					if (i != j && i != k && j != k) {
						count++;

						System.out.println(i + "" + j + "" + k);
					} else {
						// System.out.println("--No Unique numbers will be in this number combination");
					}

				}

			}

		}
		System.out.println("Count of unique numbers " + count);

	}

	public void listOfAvailableCharSets() {
		System.out.println("List of available character sets: ");
		for (String str : Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}

	}

	public void ASCII() {

		int chr = 'Z';
		int char1 = 16;
		System.out.println("The ASCII value of Z is :" + chr + "value of 16 will be" + char1);

	}

	public void readPassword() {

		Console cons;
		if ((cons = System.console()) != null) {
			char[] pass_ward = null;
			try {
				pass_ward = cons.readPassword("Input your Password:");
				System.out.println("Your password was: " + new String(pass_ward));
			} finally {
				if (pass_ward != null) {
					java.util.Arrays.fill(pass_ward, ' ');
				}
			}
		} else {
			throw new RuntimeException("Can't get password...No console");
		}
	}

	public void acceptIntAndDoCal() {
		// int n=5;
		// System.out.println("value of n+nn+nnn"+n+n+""+n+n+""+n+""+n);
		int n;
		char s1, s2, s3;
		Scanner in = new Scanner(System.in);
		System.out.print("Input number: ");
		n = in.nextInt();
		System.out.printf("%d + %d%d  + %d%d%d\n", n, n, n, n, n, n);
		in.close();

	}

	public void getFileSize() {
		String FILE_NAME = "C:\\Users\\bensl\\OneDrive\\Desktop\\BensResume";
		File file = new File(FILE_NAME);

		long fileSize = FileUtils.sizeOf(file);

		System.out.println(fileSize + " bytes");

	}

	public void displaySystemTime() {
		/*
		 * SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		 * Date date = new Date(avg1); System.out.println(formatter.format(date));
		 */
		System.out.println("Current Time" + System.currentTimeMillis());
	}

	public void printOddNumbers() {
		System.out.println("Execution started");
		System.out.println("Odd values would be");
		int noOfOddNumbers = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
				noOfOddNumbers++;
			}

		}
		System.out.println("Execution Done: No of odd numbers " + noOfOddNumbers);
		System.out.println("Enter the number to calculate odd or even : ");
		Scanner s = new Scanner(System.in);
		int inputNo = s.nextInt();
		if (inputNo % 2 != 0) {
			System.out.println("Numbers is an odd number  " + "1");
		} else {
			System.out.println("Numbers is an even number  " + "2");
		}

		System.out.println("Execution of second time");
		int count = 0;
		for (int i = 1; i < 100; i++) {
			if (i % 2 == 0) {

			} else {
				System.out.println(i);
				count++;
			}

		}
		System.out.println("No of odd num" + count);

	}

	public void stringToInteger() {
		String a = "34";
		// Integer num = new Integer(a);
		int num = Integer.parseInt(a);
		System.out.println(num);

	}

	public boolean sumOfTwoAndCompareWithThird() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first No ");
		int first_no = s.nextInt();
		System.out.println("Enter Second No");
		int second_no = s.nextInt();
		System.out.println("Enter third No ");
		int third_no = s.nextInt();
		s.close();
		if (first_no + second_no == third_no) {
			return true;
		} else {
			return false;
		}

	}

	public void divBy3and4() {
		System.out.println("Div By 3");

		for (int i = 1; i < 100; i++) {

			if (i % 3 == 0) {
				System.out.println(i);
			}

		}
		System.out.println("Div By 5");
		for (int i = 1; i < 100; i++) {
			if (i % 5 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("Div By 3 & 5");
		for (int i = 1; i < 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

	public boolean compareThreeNumbers() {
		// return false;
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first Number");
		int a = s.nextInt();
		System.out.println("Enter second Number");
		int b = s.nextInt();
		System.out.println("Enter third Number");
		int c = s.nextInt();

		if (b > a && c > b) {
			return true;

		} else {
			return false;
		}

		// s.close();

	}

	public boolean sameRightMostCheck() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter first Number");
		Integer a = s.nextInt();
		System.out.println("Enter second Number");
		int b = s.nextInt();
		System.out.println("Enter third Number");
		int c = s.nextInt();
		s.close();
		if ((a % 10 == b % 10) || (b % 10 == c % 10) || (c % 10 == a % 10)) {
			return true;
		} else {

			return false;
		}

	}

	public void secondToHourandMin() {
		Scanner in = new Scanner(System.in);

		// enter the seconds here.
		System.out.print("Enter seconds : ");

		int seconds = in.nextInt();
		int p1 = seconds % 60;
		int p2 = seconds / 60;
		int p3 = p2 % 60;
		p2 = p2 / 60;
		System.out.print(p2 + ":" + p3 + ":" + p1);
		System.out.print("\n");
	}

	public int rangeOfTwoNumbers() {
		int count = 0;
		for (int i = 5; i < 20; i++) {
			int p = 3;
			if (i % p == 0) {
				count++;
			}

		}
		return count;

	}

	public void factorsofNumbers() {
		int count = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the input number");
		int in = s.nextInt();
		s.close();
		for (int i = 0; i <= in; i++) {
			for (int j = 0; j <= in; j++) {

				if (i * j == in) {
					count++;
				}

			}

		}
		System.out.println("No of factors " + count);

	}

	public void capFirstLetter() {
		Scanner in = new Scanner(System.in);
		System.out.print("Input a Sentence: ");
		String line = in.nextLine();
		String line1 = in.nextLine();
		String upper_case_line = "";
		Scanner lineScan = new Scanner(line);
		while (lineScan.hasNext()) {
			System.out.println(lineScan);
			String word = lineScan.next();
			upper_case_line += Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ";
		}
		System.out.println(upper_case_line.trim());

		// StringUtils st= new StringUtils();
		System.out.println("To Lower " + line1.toLowerCase());
		StringUtils.capitalize(line);
		StringUtils.uncapitalize(line);

	}

	public void penultimateAndReverse() {
		String st = "The quick brown fox jumps over the lazy dog.";
		String[] str = st.split("\\s+");
		System.out.println(str.length);
		System.out.println("penultimate of string would be " + str[str.length - 2]);
		System.out.println("reverse a string ");
		for (int i = st.length() - 1; i >= 0; i--) {
			st += st + st.charAt(i);
			System.out.println(st);
		}
	}

	public void acceptThreeNumbers() {
		Scanner s = new Scanner(System.in);
		boolean sta = false;
		boolean sta1 = false;
		System.out.println("Enter first no");
		int x = s.nextInt();
		System.out.println("Enter Second No");
		int y = s.nextInt();
		System.out.println("Enter third no");
		int z = s.nextInt();
		if ((Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20)) {
			sta = true;
		}
		s.close();
		if (y == z) {
			sta1 = true;
		}
		System.out.println("value of sta" + sta);
		System.out.println("value of sta1" + sta1);
	}

	public int get2val() {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter first no");
		int x = s.nextInt();
		System.out.println("Enter Second No");
		int y = s.nextInt();

		if (x == y)
			return 0;
		if (x % 6 == y % 6)
			return (x < y) ? x : y;
		return (x > y) ? x : y;
	}

	public boolean common_digit() {
		int p = 23;
		int q = 45;
		if (p < 25 || q > 75) {
			return false;
		}
		int x = p % 10;
		int y = q % 10;
		p /= 10;
		q /= 10;
		return (p == q || p == y || x == q || x == y);
	}

	public void insertAString() {

		String main_string = "Python 3.0";
		String word = "Tutorial";
		System.out.println(main_string.substring(0, 7) + word + main_string.substring(6));

	}

	public static void main(String[] args) {
		Loops l = new Loops();
		// System.out.println(l.compareThreeNumbers());
		// System.out.println(l.sameRightMostCheck());
		// System.out.println(l.rangeOfTwoNumbers());
		// l.factorsofNumbers();
		// l.capFirstLetter();
		// l.penultimateAndReverse();
		// l.acceptThreeNumbers();
		// l.get2val();
		//l.common_digit();
		l.insertAString();
	}

	public void Main1() {
		Loops l = new Loops();
		/*
		 * exercise1(); l.exercise2(); l.e3(); l.perimeterOfCircle(); for (int i = 0; i
		 * < 10; i++) { System.out.println(" Loop executed" + i + "time"); int
		 * avgOfThree = l.avgOfThree(30); System.out.println(avgOfThree); }
		 * l.rectangle(); l.americanFlagonScreen(); l.swapTwoNumbers();
		 * 
		 * l.binaryNoAddition();
		 */
		// javaInstalled();
		// compareTwoNumbers();
		// sumOfDigits();
		// boolean compare = booleanReturn();
		// System.out.println("Status of numbers A & B is --- " + compare);
		// System.out.println("Comparsion"+bool2(7)+booleanReturn());
		// System.out.println(sumOfDigits());
		// reverseAString();
		// countAString();
		// countUniqueNumbers();
		// l.listOfAvailableCharSets();
		// ASCII();
		// l.readPassword();
		// l.acceptIntAndDoCal();
		// l.getFileSize();
		// l.displaySystemTime();
		// l.printOddNumbers();
		// l.stringToInteger();
		// System.out.println("Status would be " + l.sumOfTwoAndCompareWithThird());

	}
}
