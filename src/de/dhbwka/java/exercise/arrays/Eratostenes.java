package de.dhbwka.java.exercise.arrays;

public class Eratostenes {
	
	public static void main(String[] args) {
		int n = 100;
		// Fill sieve
		int[] sieve = new int[n - 1];
		for(int i = 0; i < sieve.length; ++i) {
			sieve[i] = i+2;
		}
		// Fill sieb
		boolean[] sieb = new boolean[sieve.length];
		for(int i = 0; i < sieb.length; ++i) {
			sieb[i] = true;
		}
		int[] primes = new int[sieve.length];
		
		for(int i = 0; i < primes.length && !isAllFalse(sieb); ++i) {
			// Find min in sieve
			int minIndex = FindFirstTrueIndex(sieb);
			if(minIndex < 0) 
				return;
			int min = sieve[minIndex];
			
			// add min to primes
			primes[i] = min;
			
			// filter min & multiples from sieve (-> sieb[j] = false)
			for(int j = 0; j < sieve.length; ++j) {
				if(sieve[j] % min == 0) {
					sieb[j] = false;
				}
			}
		}
		
		// print primes
		for(int i = 0; i < primes.length; ++i) {
			if(primes[i] == 0)
				break;
			System.out.println(primes[i]);
		}
	}
	
	public static int FindFirstTrueIndex(boolean[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i])
				return i;
		}
		return -1;
	}
	
	public static boolean isAllFalse(boolean[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			if(arr[i])
				return false;
		}
		return true;
	}
}
