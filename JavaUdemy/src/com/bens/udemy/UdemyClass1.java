package com.bens.udemy;

import java.util.Calendar;

public class UdemyClass1 extends Udemy2 {

	public static void main(String[] args) {
		UdemyClass1 uc = new UdemyClass1();
		// uc.eat();
		uc.StringUnderstandig();

	}

	void eat() {
		System.out.println("udemyclass1 eat");

	}

	void misc() {
		// TODO Auto-generated method stub
		JavaUdemy ju = new JavaUdemy(34, 11);
		ju.add();
		ju.sub();
		this.eat();
		super.eat();
	}

	void StringUnderstandig() {
		String s = "hello";
		s.concat("he");
		System.out.println(s);

		StringBuffer sb = new StringBuffer("hello buffer");
		System.out.println(sb);
		sb.append("appending");
		System.out.println(sb);
		StringBuffer strRev = sb.reverse();
		System.out.println(strRev);
		
		
		

	}

}

class Udemy2 {
	void eat() {
		System.out.println("udemy2 eat");
	}
}
