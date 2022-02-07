package de.dhbwka.java.exercise.arrays;

public class Pascal {

	public static void main(String[] args) {
		int[][] pascal = new int[9][];
		
		for(int i = 0; i < pascal.length; ++i) {
			pascal[i] = new int[i+1];
		}
		// per definition:
		pascal[0][0] = 1;

		fillPascal(pascal);
		printMatrix(pascal);
	}
	
	public static void fillPascal(int[][] arr) {
		for(int i = 1; i < arr.length; ++i) {
			for(int j = 0; j < arr[i].length; ++j) {
				
				if(j == 0 || j == arr[i].length-1) {
					arr[i][j] = 1;
					continue;
				}

				arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
			}
		}
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
