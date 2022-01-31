package de.dhbwka.java.exercise.control;

public class TemperatureTable {

	public static void main(String[] args) {
		for(int i = 0; i < 300; ++i) {
			System.out.println("Fahrenheit: " + i + "  Celcius: " + Math.round(toCelcius(i)));
		}
	}
	
	public static double toCelcius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit-32);
	}

}
