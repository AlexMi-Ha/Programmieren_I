package de.dhbwka.java.exercise.arrays;

public class Fibonacci {

	public static void main(String[] args) {
		long[] fib = new long[50];
		if(fib.length < 2) {
			return;
		}
		fib[0] = 1;
		fib[1] = 1;
		for(int i = 2; i < fib.length; ++i) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		
		for(int i = 0; i < fib.length; ++i) {
			System.out.println("[" + i + "] " + fib[i]);
		}
	}

}
