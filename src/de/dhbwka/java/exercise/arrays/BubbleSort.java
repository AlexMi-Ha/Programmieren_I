package de.dhbwka.java.exercise.arrays;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.print("Bitte die Anzahl der Elemente n eingeben: ");
		Scanner sc = new Scanner(System.in);
		int numElements = sc.nextInt();
		int[] arr = new int[numElements];
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.print("Zahl " + i + " eingeben: ");
			arr[i] = sc.nextInt();
		}
		
		bubbleSort(arr);
		
		for(int i = 0; i < arr.length; ++i) {
			System.out.println(arr[i]);
		}

	}
	
	public static void bubbleSort(int[] arr) {
		
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr.length - 1 - i; ++j) {
				if(arr[j] > arr[j+1])
					swap(arr, j, j+1);
			}
		}
	}
	
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
