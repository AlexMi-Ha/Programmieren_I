package de.dhbwka.java.exercise.classes;

public class Radio {
	
	public static void main(String[] args) {
		Radio radio = new Radio(false, 7, 93.5);
		System.out.println(radio);
		radio.turnOn();
		System.out.println(radio);
		radio.incVolume(); radio.incVolume();
		System.out.println(radio);
		radio.incVolume();
		radio.incVolume();
		System.out.println(radio);
		radio.decVolume();
		System.out.println(radio);
		radio.setFrequency(97.8);
		System.out.println(radio);
		radio.setFrequency(112.7);
		System.out.println(radio);
		radio.turnOff();
		System.out.println(radio);
	}
	
	private boolean on;
	private int volume;
	private double frequency;
	
	public Radio() {
		setOn(false);
		setVolume(5);
		setFrequency(85.0f);
	}
	
	public Radio(boolean on, int volume, double frequency) {
		setOn(on);
		setVolume(volume);
		setFrequency(frequency);
	}
	
	public void incVolume() {
		if(!isOn())
			return;
		setVolume(getVolume() + 1);
	}
	
	public void decVolume() {
		if(!isOn())
			return;
		setVolume(getVolume() - 1);
	}
	
	public void turnOn() {
		setOn(true);
	}
	
	public void turnOff() {
		setOn(false);
	}
	
	@Override
	public String toString() {
		return "Radio " + (isOn() ? "an" : "aus") +": Freq=" + getFrequency() + ", Laut=" + getVolume();
	}
	
	
	// Getter / Setter

	public boolean isOn() {
		return on;
	}

	private void setOn(boolean on) {
		this.on = on;
	}

	public int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		if(volume < 0 || volume > 10) {
			this.volume = 10;
			return;
		}
		this.volume = volume;
	}

	public double getFrequency() {
		return frequency;
	}

	public void setFrequency(double frequency) {
		if(frequency < 85.0 || frequency > 110.0) {
			this.frequency = 99.9;
			return;
		}
		this.frequency = frequency;
	}

}
