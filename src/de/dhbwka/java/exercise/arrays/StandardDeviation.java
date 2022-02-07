package de.dhbwka.java.exercise.arrays;

public class StandardDeviation {

	public static void main(String[] args) {
		int[] dataset = new int[100];
		for(int i = 0; i < dataset.length; ++i) {
			dataset[i] = (int)(Math.random() * 11); // random value -> [0;10]
		}
		
		double median = calcAverage(dataset);
		System.out.println("Mittelwert: " + median);
		double standardDeviation = calcStandardDeviation(dataset, median);
		System.out.println("Standardabweichung: " + standardDeviation);
		
	}
	
	public static double calcAverage(int[] array) {
		int sum = 0;
		for(int i = 0; i < array.length; ++i) {
			sum += array[i];
		}
		return sum / (double)array.length;
	}
	
	public static double calcStandardDeviation(int[] array, double median) {
		double sum = 0;
		for(int i = 0; i < array.length; ++i) {
			sum += Math.pow((array[i] - median), 2);
		}
		sum /= (array.length - 1);
		
		return Math.sqrt(sum);
	}

}
