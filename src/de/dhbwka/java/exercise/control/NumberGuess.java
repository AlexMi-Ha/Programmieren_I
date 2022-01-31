package de.dhbwka.java.exercise.control;

import java.util.Scanner;

public class NumberGuess {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Wie ist dein Name? ");
		String name = sc.next();
		
		while(true) {
			guessingGame(name, sc);
		
			System.out.println("Was möchtest du tun?\n0 - Das Spiel beenden\n1 - Das Spiel fortsetzen");
			int next = sc.nextInt();
			if(next == 0) {
				return;
			}
		}
	}
	
	public static void guessingGame(String name, Scanner sc) {
		int guess = 0;
		int ran = (int)(Math.random() * 100 + 1);
		for(int i = 1; ; ++i) {
			System.out.print(name + " rate eine Zahl [1-100]: ");
			guess = sc.nextInt();
			
			System.out.print("Versuch " + i + ": ");
			if(guess == ran) {
				System.out.print(guess + " ist korrekt!\n");
				break;
			}
			if(guess < ran) {
				System.out.print(guess + " ist zu niedrig!\n");
			}else {
				System.out.print(guess + " ist zu hoch!\n");
			}
		}
	}

}
