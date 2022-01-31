package de.dhbwka.java.exercise.control;

import java.util.Scanner;

public class AddUp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			System.out.print("Zahl eingeben (<0 für Abbruch): ");
			int in = sc.nextInt();
			if(in < 0)
				break;
			sum += in;
		}
		System.out.println("Summe: " + sum);
	}

}
