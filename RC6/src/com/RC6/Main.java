package com.RC6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Crear e inicializar un array de enteros
        int[] numeros = new int[20];
        
        // Llenar el array con números aleatorios entre 20 y 400
        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 381) + 20;
            System.out.print(numeros[i] + " ");
        }
        
     // Solicitar al usuario la opción de múltiplos a resaltar
        Scanner sc = new Scanner(System.in);
        System.out.println("\n¿Qué números quiere resaltar?");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        int opcion = Integer.parseInt(sc.nextLine());
        
        // Determinar el múltiplo basado en la elección del usuario
        int multiplo = (opcion == 1) ? 5 : 7;
        
        // Resaltar los múltiplos del número seleccionado
        System.out.println("Números resaltados:");
        for (int numero : numeros) {
            if (numero % multiplo == 0) {
                System.out.print("[" + numero + "] ");
            } else {
                System.out.print(numero + " ");
            }
        }
        sc.close();

	}

}
