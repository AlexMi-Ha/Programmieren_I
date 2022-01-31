package de.dhbwka.java.exercise.control;

public class ShoeSize {

	public static void main(String[] args) {
		System.out.println("Zentimeter    | Größe");
		System.out.println("--------------------------");
		for(float i = 19.33f; i < 32.6; i += 2.0/3) {
			System.out.printf("%2.2f - %2.2f | %2d\n", i, (i + 2.0/3),toSize((float) (i+ 2.0/3)));
		}

	}
	
	public static int toSize(float i) {
		return (int) Math.round(i * 1.5);
	}

}
