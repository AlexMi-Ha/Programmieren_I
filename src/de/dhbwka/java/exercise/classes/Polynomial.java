package de.dhbwka.java.exercise.classes;

public class Polynomial {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial(2, 0, 0);
		Polynomial p2 = new Polynomial(0, -4, 1);
		Polynomial p3 = p1.addPolynom(p2);
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2);
		System.out.println("P3: P1 + P2: " + p3);
		p3 = p3.multiplyWithScalar(2);
		System.out.println("P3 = 2.0 * P3: " + p3);
		System.out.println("Nullstelle von P3 (" + p3 + "):");
		double[] nst = p3.getNst();
		if(nst != null) {
			System.out.println("x1=" + nst[0]);
			if(nst.length > 1) {
				System.out.println("x2=" + nst[1]);
			}
		}
	}
	
	private double a, b, c;
	
	public Polynomial(double a, double b, double c) {
		this.a = 1;
		setA(a);
		setB(b);
		setC(c);
	}

	@Override
	public String toString() {
		String polynom =  "";
		if(a != 0)
			polynom += a + "x^2";
		if(b != 0) {
			polynom += (b > 0 ? "+" + b : b) + "x";
		}
		if(c != 0) {
			polynom += (c > 0 ? "+" + c : b);
		}
		return polynom;
	}
	
	public double f(double x) {
		return a * x * x + b * x + c;
	}
	
	public Polynomial addPolynom(Polynomial p) {
		return new Polynomial(a + p.getA(), b + p.getB(), c + p.getC());
	}
	
	public Polynomial subtractPolynom(Polynomial p) {
		return new Polynomial(a - p.getA(), b - p.getB(), c - p.getC());
	}
	
	public Polynomial multiplyWithScalar(double scalar) {
		return new Polynomial(a * scalar, b * scalar, c * scalar);
	}
	
	public double[] getNst() {		
		double d = b*b-4*a*c;
		if(d < 0)
			return null;
		
		double[] nst = d == 0 ? new double[1] : new double[2];
		nst[0] = (-b + Math.sqrt(d)) / (2*a);
		if(d != 0) {
			nst[1] = (-b - Math.sqrt(d)) / (2*a);
		}
		
		return nst;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	

}
