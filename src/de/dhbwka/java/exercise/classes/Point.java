package de.dhbwka.java.exercise.classes;

public class Point {

	public static void main(String[] args) {
		Point pointA = new Point(4.0, 2.0);
		System.out.println("A: " + pointA);
		Point pointB = new Point(-1.0, -1.0);
		System.out.println("B: " + pointB);
		System.out.println("Abstand A-B: "
		+ pointA.distanceToPoint(pointB));
		pointA = pointA.mirrorOrigin();
		System.out.println("A': " + pointA);
		System.out.println("Abstand A’-B: "
		+ pointA.distanceToPoint(pointB));

	}
	
	private double x, y;
	
	public Point() {
		setX(0);
		setY(0);
	}
	
	public Point(double x, double y) {
		setX(x);
		setY(y);
	}
	
	public Point(Point p) {
		this(p.getX(), p.getY());
	}
	
	
	@Override
	public String toString() {
		return "Punkt P(" + getX() + "|" + getY() + ")";
	}
	
	public double abs() {
		return Math.sqrt(getX() * getX() + getY() * getY());
	}
	
	public Point mirrorVertically() {
		return new Point(getX(), -getY());
	}
	
	public Point mirrorHorizontally() {
		return new Point(-getX(), getY());
	}
	
	public Point mirrorOrigin() {
		return new Point(-getX(), -getY());
	}
	
	public double distanceToPoint(Point p) {
		return Math.sqrt(Math.pow(getX() - p.getX(), 2) + Math.pow(getY() - p.getY(), 2));
	}
	
	
	
	// Getter / Setter

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
}
