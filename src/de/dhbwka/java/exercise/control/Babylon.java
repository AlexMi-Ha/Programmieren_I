package de.dhbwka.java.exercise.control;

import java.util.Scanner;

public class Babylon {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Wurzel von " + num + " = " + sqrt(num));

	}
	
	public static double sqrt(int a) {
		double xn = 1.0;
		while(true) {
			double xnnew = (xn + a / xn)/2.0;
			System.out.println("xn " + xn);
			if(Math.abs(xnnew - xn) < Math.pow(10, -6)) {
				return xnnew;
			}
			xn = xnnew;
		}
	}

}
