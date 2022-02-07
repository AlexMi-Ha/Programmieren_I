package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class DotProduct {

	public static void main(String[] args) {
		System.out.print("Bitte Anzahl der Elemente eingeben: ");
		Scanner sc = new Scanner(System.in);
		int dim = sc.nextInt();
		double[] vectorX = new double[dim];
		double[] vectorY = new double[dim];
		
		for(int i = 0; i < vectorX.length; ++i) {
			System.out.print("Bitte x_" + i + " eingeben: ");
			vectorX[i] = sc.nextDouble();
		}
		for(int i = 0; i < vectorY.length; ++i) {
			System.out.print("Bitte y_" + i + " eingeben: ");
			vectorY[i] = sc.nextDouble();
		}
		
		double dotProduct = calcDotProduct(vectorX, vectorY);
		System.out.println("Das Skalarprodukt von x und y ist " + dotProduct);
	}
	
	public static double calcDotProduct(double[] x, double[] y) {
		double sum = 0;
		for(int i = 0; i < x.length; ++i) {
			sum += x[i] * y[i];
		}
		
		return sum;
	}

}
