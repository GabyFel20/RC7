package com.generation;

import java.util.Scanner;

public class Data_Types{
	public static void main (String[]args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Data types");
		double temperature = sc.nextDouble();
		float temperatureFahrenheit = (float)(temperature * 1.8f + 32);
		
		System.out.println(temperature + "C:"+ temperatureFahrenheit + 'F');
		
		
		//Scanner
		
		System.out.println("Data from a Circle-----");
		System.out.println("Please input the radius");
		double radius = sc.nextDouble();
		float diameter = (float)(radius *2);
		float circumference = (float)(Math.PI*diameter);
		float circumference2 = (float)(3.1416 * diameter);
		float area =(float)(Math.PI*radius*radius);
		
		System.out.println("Diameter:" + diameter);
		System.out.println("Circumference:" + circumference + " " + circumference2);
		System.out.println("Area:" + area);
	}
	
}