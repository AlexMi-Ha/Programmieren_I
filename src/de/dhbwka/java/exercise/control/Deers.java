package de.dhbwka.java.exercise.control;

public class Deers {

	public static void main(String[] args) {
	
		int hirsche = 200;
		for(int i = 1; hirsche <= 300; ++i) {
			hirsche += (int)(hirsche * 0.1);
			hirsche -= 15;
			System.out.println("[" + i + "] " + hirsche + " Hirsche");
		}

	}

}
