package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class Norm {

	public static void main(String[] args) {
		System.out.print("Wie viele Dimensionen soll der Vektor haben? : ");
		Scanner sc = new Scanner(System.in);
		int dim = sc.nextInt();
		
		double[] vector = new double[dim];
		
		for(int i = 0; i < vector.length; ++i) {
			System.out.print("Bitte x_" + i + " eingeben: ");
			vector[i] = sc.nextDouble();
		}
		
		double length = calcVectorLength(vector);
		System.out.println("Der Betrag des Vektors ist: " + length);

	}
	
	public static double calcVectorLength(double[] vector) {
		double sum = 0;
		for(int i = 0; i < vector.length; ++i) {
			sum += Math.pow(vector[i], 2);
		}
		
		return Math.sqrt(sum);
	}

}
