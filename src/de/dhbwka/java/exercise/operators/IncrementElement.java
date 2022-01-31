package de.dhbwka.java.exercise.operators;

public class IncrementElement {

	public static void main(String[] args) {
		int i=0;	// i: 0 j:
		int j=0;	// i: 0 j: 0
		j = ++i; // i , j = 1
		int k = j++ + ++i; // k = 3, j,i = 2
		System.out.println("k: " + k); // k = 3
		System.out.println("*: " + j++ + ++i); // j,i = 3  / Ausgabe 23
		System.out.println(j++ + ++i); // j,i = 4 / Ausgabe 7
		int m = j++ * ++i; // m = 20, i,j = 5
		System.out.println("m: " + m); // m: 20
		int n = --j * --i; // n = 16, j,i = 4
		System.out.println("n: " + n); // 16
		System.out.println("i: " + i); // 4
		System.out.println("j: " + j); // 4
	}

}
