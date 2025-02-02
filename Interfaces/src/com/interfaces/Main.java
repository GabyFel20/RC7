package com.interfaces;

public class Main {

	public static void main(String[] args) {
		Shape circle = new Circle(4.0);
		Sphere sphere= new Sphere(4.0);
		
		System.out.println("Data from circle: ");
		System.out.println("Area: "+ circle.calculateArea());
		System.out.println("Perimeter: " + circle.calculatePerimeter());
		
		System.out.println("Data from sphere: ");
		System.out.println("Area: "+ sphere.calculateArea());
		System.out.println("Perimeter: " + sphere.calculatePerimeter());
		System.out.println("Volume: " + sphere.calculateVolumen());

	}

}
