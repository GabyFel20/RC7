package com.interfaces;

public class Sphere implements Shape, Shape3D {
	private double radius;

	public Sphere(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	public double calculateVolumen() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius * radius;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}
	
	
	

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Sphere [radius=" + radius + "]";
	}

	
	

}
