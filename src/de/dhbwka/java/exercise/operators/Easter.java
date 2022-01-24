package de.dhbwka.java.exercise.operators;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Easter {

	public static void main(String[] args) {
		System.out.print("Gib eine Jahreszahl ein: ");
		int year = 0;
		
		try(Scanner sc = new Scanner(System.in)) {
			 year = sc.nextInt();
		}catch(InputMismatchException ex) {
			ex.printStackTrace();
			System.out.println("Das war keine Jahreszahl!");
			return;
		}
		
		int a = year % 19;
		int b = year % 4;
		int c = year % 7;
		int k = year / 100;
		int p = (8*k + 13) / 25;
		int q = k / 4;
		int m = (15 + k - p - q) % 30;
		int n = (4 + k - q) % 7;
		int d = (19*a + m) % 30;
		int e = (2*b + 4*c + 6*d + n) % 7;
		
		int ostern = (22 + d + e);
		
		System.out.println("Ostern ist am: ");
		if (ostern > 31) {
			System.out.println((ostern - 31) + ". April");
		} else {
			System.out.println(ostern + ". März");
		}
		
		

	}

}
