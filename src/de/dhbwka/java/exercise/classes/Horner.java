package de.dhbwka.java.exercise.classes;

public class Horner {

	public static void main(String[] args) {
		double[] co = {1,-2,3,4.5,8,-10,3,4,2,-3,0.5};
		Horner h = new Horner(co);
		System.out.println(h);
		System.out.println("Bei x = 5: ");
		System.out.println(h.getValue(1.5));
	}
	
	private double[] coefficients;
	
	public Horner(double[] coefficients) {
		this.coefficients = coefficients;
	}
	
	public double getValue(double x) {
		return getValue(x, 0);
	}
	
	private double getValue(double x, int index) {
		if(index >= coefficients.length - 1) {
			return coefficients[index];
		}
		return coefficients[index] + x * getValue(x, index + 1);
	}

	@Override
	public String toString() {
		String polynom = coefficients[0] + "";
		for(int i = 1; i < coefficients.length; ++i) {
			polynom += (coefficients[i] > 0 ? "+" : "") + coefficients[i] + "*x^" + i;
		}
		return polynom;
	}
}
