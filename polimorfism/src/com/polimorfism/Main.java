package com.polimorfism;

public class Main {

	public static void main(String[] args) {
		Shape circle= new Circle(5.0);
		Shape rectangle= new Rectangle(10,5);
		
		System.out.println("Area of circle: " + circle.calculateArea());
		System.out.println("Area of rectangle: " + rectangle.calculateArea());
	}

}
