package de.dhbwka.java.exercise.classes;

public class Complex {

	public static void main(String[] args) {
		
		Complex c1 = new Complex(1, 2);
		Complex c2 = new Complex(2,1);
		System.out.println("C1: " + c1);
		System.out.println("C2: " + c2);
		System.out.println("C1 + C2: " + c1.add(c2));
		System.out.println("C1 - C2: " + c1.sub(c2));
		System.out.println("C1 * C2: " + c1.mult(c2));
		System.out.println("C1 / C2: " + c1.div(c2));
		System.out.println("C1 < C2? " + c1.isLess(c2));
		
		Complex[] cArr = new Complex[10];
		System.out.println("Unsortiert: ");
		for(int i = 0; i < cArr.length; ++i) {
			cArr[i] = new Complex(Math.random() * 10, Math.random() * 10);
			System.out.printf("%.4f %.4f i  Betrag: %.4f", cArr[i].getReal(), cArr[i].getImag(), cArr[i].getMagnitude());
			System.out.println();
		}
		
		sortComplex(cArr);
		System.out.println("Sortiert:");
		for(int i = 0; i < cArr.length; ++i) {
			System.out.printf("%.4f %.4f i  Betrag: %.4f", cArr[i].getReal(), cArr[i].getImag(), cArr[i].getMagnitude());
			System.out.println();
		}
	}
	
	public static void sortComplex(Complex[] arr) {
		for(int i = 0; i < arr.length; ++i) {
			for(int j = 0; j < arr.length - 1 - i; ++j) {
				if(arr[j+1].isLess(arr[j]))
					swap(arr, j, j+1);
			}
		}
	}
	
	public static void swap(Complex[] arr, int i, int j) {
		Complex temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	private double a, b;
	
	public Complex(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public double getReal() {
		return a;
	}
	
	public double getImag() {
		return b;
	}
	
	public Complex add(Complex comp) {
		return new Complex(a + comp.getReal(), b + comp.getImag());
	}
	
	public Complex sub(Complex comp) {
		return new Complex(a - comp.getReal(), b - comp.getImag());
	}
	
	public Complex mult(Complex comp) {
		return new Complex(a*comp.getReal() - b*comp.getImag(),
				a*comp.getImag() + b*comp.getReal());
	}
	
	public Complex div(Complex comp) {
		double real = (a * comp.getReal() + b*comp.getImag()) / (Math.pow(comp.getReal(),2) + Math.pow(comp.getImag(), 2));
		double imag = (b * comp.getReal() - a*comp.getImag()) / (Math.pow(comp.getReal(),2) + Math.pow(comp.getImag(), 2));
		return new Complex(real, imag);
	}
	
	@Override
	public String toString() {
		return a + " " + b + "i";
	}
	
	public double getMagnitude() {
		return Math.sqrt(a*a + b*b);
	}
	
	public boolean isLess(Complex comp) {
		return getMagnitude() < comp.getMagnitude();
	}
}
