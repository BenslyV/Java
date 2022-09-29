package com.bens.exercise.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExerciseArrayList {

	@SuppressWarnings("unchecked")
	private static void createArrayList() {
		ArrayList<String> clours = new ArrayList<String>();
		clours.add("red");
		clours.add("Orange");
		clours.add("yellow");
		clours.add(0, "Blue");
		clours.remove(0);
		System.out.println(clours);
		clours.remove(1);
		String first_ele = clours.get(0);
		System.out.println("First Element would be -----" + first_ele);
		clours.add(0, "Blue Replaced");
		clours.set(0, "Green");
		if (clours.contains("Blue")) {
			System.out.println("Element Blue there");
		} else {
			System.out.println("Element Blue not present");
		}
		
		System.out.println(clours);
		for (String clours_print : clours) {
			System.out.println(clours_print);
		}

		Collections.sort(clours);
		System.out.println("Sorted list --- " + clours);

		ArrayList<String> clours_copy = new ArrayList<String>();
		clours_copy = (ArrayList<String>) clours.clone();

		Object al_copy1 = new ArrayList<String>();
		al_copy1 = clours.clone();

		System.out.println("Copied Array list1");
		System.out.println(clours_copy);
		System.out.println("Copied Array list2" + al_copy1);

		ArrayList<String> bike = new ArrayList<String>();
		bike.add("Yamaha");
		bike.add("Hero");
		bike.add("Tvs");
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("swift");
		cars.add("polo");
		cars.add("");
		System.out.println("Before Copy array list" + bike + cars);
		Collections.copy(cars, bike);
		System.out.println("Before Copy array list" + bike + cars);
		Collections.shuffle(bike);
		System.out.println("After shuffle"+bike);
		
		Collections.reverse(bike);
		System.out.println("After reverse"+bike);
		
		String greet ="Welcome to the world";
		String sub1=greet.substring(2);
		System.out.println(sub1);
		List<String> car_sub=cars.subList(0, 2);
		System.out.println(car_sub);
		
		boolean clours_bike = clours.equals(bike);
		System.out.println(clours_bike);
		System.out.println("Bikes would be --"+bike);
		System.out.println("Cars would be --"+cars);
		boolean bike_cars = bike.equals(cars);
		System.out.println("Is Bike cars equal"+bike_cars);
	}

	public static void main(String[] args) {
		createArrayList();

	}

}
