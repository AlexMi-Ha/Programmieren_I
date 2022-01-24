package de.dhbwka.java.exercise.datatypes;

public class ShortValue {
	
	public static void main(String[] args) {
		short s = 32767;
		System.out.println(s);
		++s; // Hier passiert ein overflow
		// 0111 1111 1111 1111  + 1   (32767+1) =
		// 1000 0000 0000 0000   -> (-32768)
		System.out.println(s);		
	}
}
