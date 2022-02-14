package de.dhbwka.java.exercise.classes;

public class Account {

	public static void main(String[] args) {
		Account account = new Account(4711, "Donald Duck", 500, 1000);
		System.out.println(account);
		account.processDeposit(200);
		System.out.println(account);
		account.processPayment(400);
		System.out.println(account);
		account.processPayment(2000);
		System.out.println(account);
	}
	
	private int kontonummer;
	private String inhaber;
	private int kontoStand;
	private int limit;
	
	public Account(int kontonummer, String inhaber, int kontoStand, int limit) {
		setKontonummer(kontonummer);
		setInhaber(inhaber);
		setKontoStand(kontoStand);
		setLimit(limit);
	}
	
	@Override
	public String toString() {
		return "Konto Nr. " + getKontonummer() +
				" (" + getInhaber() + "), Stand: " +
				getKontoStand() + " ct, Limit " +
				getLimit() + " ct";
	}
	
	public void processDeposit(int value) {
		if(value < 0) {
			System.err.println("Keine Einzahlung von negativen Werten möglich");
			return;
		}
		setKontoStand(getKontoStand() + value);
	}
	
	public void processPayment(int value) {
		if(value < 0) {
			System.err.println("Keine Zahlung mit negativen Werten möglich");
			return;
		}
		setKontoStand(getKontoStand() - value);
	}
	
	
	public int getKontonummer() {
		return kontonummer;
	}
	private void setKontonummer(int kontonummer) {
		this.kontonummer = kontonummer;
	}
	public String getInhaber() {
		return inhaber;
	}
	private void setInhaber(String inhaber) {
		this.inhaber = inhaber;
	}
	public int getKontoStand() {
		return kontoStand;
	}
	private void setKontoStand(int kontoStand) {
		if(kontoStand < -getLimit()) {
			System.err.println("Deckung nicht ausreichend!");
			return;
		}
		this.kontoStand = kontoStand;
	}
	public int getLimit() {
		return limit;
	}
	private void setLimit(int limit) {
		this.limit = limit;
	}
	
	

}
