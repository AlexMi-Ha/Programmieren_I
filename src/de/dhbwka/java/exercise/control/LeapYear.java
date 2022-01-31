package de.dhbwka.java.exercise.control;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		System.out.println(year + " ist Schaltjahr: " + isLeapYear(year));
	}
	
	public static boolean isLeapYear(int year) {
		boolean fourYear = year % 4 == 0;
		boolean hundred = year % 100 == 0;
		boolean fourHundred = year % 400 == 0;
		return fourYear && (!hundred || fourHundred);
	}

}
