package com.generation;

import java.util.Random;
import java.util.Scanner;

public class ControlFlow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		// Verificacion de edad >18
		
		System.out.println("-------Age confirmation-------");
		System.out.println("Please input your age");
		int age = sc.nextInt();
		if (age < 18) {
			System.out.println("You can't buy beer");
		} else {
			System.out.println("Here's your beer");
		}
		
		/*
		 * Crear un programa donde el usuario deba adivinar un numero. El programa debe declarar
		 * un numero al azar del 1 al 10. Mientras no se haya adivinado el numero, el usuario puede seguir
		 * ingresando numeros. Avisar al usuario si el numero que ingreso es mayor o menor al declarado. 
		 * El programa debe terminar cuando el usuario adivine.
		 * 
		 */
		System.out.println("-------Random Number------");
		Random random = new Random();
		int randomNum = random.nextInt(10) + 1;
		
		while(true) {
			System.out.println("Please input a number");
			int userNum = sc.nextInt();
			if(userNum == randomNum) {
				System.out.println("You guessed the number");
				break;
			} else if (userNum < randomNum) {
				System.out.println("Your number is low");
			} else {
				System.out.println("Your number is high");
			}
		}
		
	/*
	 *Ejercicio para calcular el descuento del usuario según su nivel de Fan cinepolis
	 *Variable: Nivel Fan, Descuento.
	 *Niveles: Nivel 1:5%, Nivel 2:10%, Nivel 3: 20% Nivel 4:50%
	 *Output: "Usted es Súper Fan y tiene descuento disponible de: $descuento
	 * Ejercicio para calcular la mensualidad de usuarios y cupones de descuento
        Variables: Nivel, Mensualidad, cupón
        Niveles: Basico, Intermedio, Completo, Pro
        Output: "Suscripcion $nivel de: $mensualidad aplicando cupones"
        Mensualidad: mensualidad = monto - (monto * descuento);
	 * 
	 * */
		
	/*
	 * Exercise 1: Password Validator
Objective: Create a program that validates passwords based on specific criteria.
Criteria:
Length: At least 8 characters and no more than 16.
Must contain at least:
One uppercase letter.
One lowercase letter.
One digit.
One special character (e.g., @, #, $, %).
Input: A string (the password). Output: A boolean value indicating the password's validity.
Instructions:
Prompt the user to enter a password.
Validate the password against the given criteria using logical operators and control flow statements.
Print a message indicating the validity of the password.*/	
		
		System.out.println("---Password validator---");
		System.out.println("Please, enter your password: ");
		
		String password = sc.nextLine();
		
		boolean isValid = isValidPassword(password);
		
		if (isValid) {
			System.out.println("The password is valid");
		} else {
			System.out.println("The password is invalid");
			
		}
		
		sc.close();
		System.exit(0);
		
		boolean isValidPassword(String password) {
			// TODO Auto-generated method stub
			if (password.length() < 8 || password.length () > 16){
			return false;
		}
		
		boolean hasUppercase = false, hasLowercase= false, hasDigit = false, hasSpecialChar = false;
		for (char ch : password.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUppercase = true;
			} else if (Character.isLowerCase(ch)) {
				hasLowercase = true;
			} else if (Character.isDigit(ch)) {
				hasDigit = true;
			} else if (isSpecialChar(ch)) {
				hasSpecialChar =true;
			}
			
		}
		return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
		
		}
		
		private static boolean isSpecialChar(char ch) {
			
			String specialChars = "@#$%&";
			
			return specialChars.indexOf(ch) != -1;
		}
		
	
		
		
	}

	private static boolean isValidPassword(String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}


