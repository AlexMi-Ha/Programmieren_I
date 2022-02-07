package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class MatrixSubtraction {

	public static void main(String[] args) {
		System.out.print("Bitte Anzahl der Zeilen n eingeben: " );
		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		System.out.print("Bitte Anzahl der Spalten m eingeben: ");
		int cols = sc.nextInt();
		
		int[][] matA = new int[rows][cols];
		int[][] matB = new int[rows][cols];

		for(int i = 0; i < rows; ++i) {
			for(int j = 0; j < cols; ++j) {
				matA[i][j] = (int)(Math.random() * 100);
				matB[i][j] = (int)(Math.random() * 100);
			}
		}
		
		System.out.println("X:");
		printMatrix(matA);
		System.out.println("Y:");
		printMatrix(matB);
		System.out.println("X-Y:");
		printMatrix(subtractMatrix(matA, matB));
	}
	
	public static int[][] subtractMatrix(int[][] a, int[][] b) {
		int[][] result = new int[a.length][a[0].length];
		for(int i = 0; i < result.length; ++i) {
			for(int j = 0; j < result[i].length; ++j) {
				result[i][j] = a[i][j] - b[i][j];
			}
		}
		return result;
	}
	
	public static void printMatrix(int[][] mat) {
		for(int i = 0; i < mat.length; ++i) {
			for(int j = 0; j < mat[i].length; ++j) {
				System.out.printf("%5d", mat[i][j]);
			}
			System.out.println();
		}
	}

}
