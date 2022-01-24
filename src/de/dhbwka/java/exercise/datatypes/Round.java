package de.dhbwka.java.exercise.datatypes;

public class Round {
	
	public static void main(String[] args) {
		double pi = 3.1415926;
		double e  = 2.7182818;
		
		Round r = new Round();
		
		System.out.println("Round(" + pi + ") = " + r.round(pi));
		System.out.println("Round(" + e + ") = " + r.round(e));
		for(float i = 0; i < 4; i+=.1) {
			System.out.println("Round(" + i + ") -> " + r.round(i));
		}	
	}
	
	public int round(double val) {
		int wholeNum = (int)val;
		double rest = val - wholeNum;
		int rounded = wholeNum + (int)(rest * 2);
		return rounded;
	}
	
}
