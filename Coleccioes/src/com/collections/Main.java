package com.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] names = {"Coraline","Hagrid"};
		System.out.println(names);
		System.out.println(Arrays.toString(names));
		
		int[]scores= {100,100,100};
		System.out.println(scores);
		System.out.println(Arrays.toString(scores));
		
		String[] films = new String[10];
		films [0] ="Coraline";
		System.out.println(films[1]);
		
		System.out.println("-----ARRAYLIST");
		
		ArrayList<String> films2 = new ArrayList<String>();
		
		films2.add("Coraline");
		films2.add("Gremlins");
		films2.add("Poor Things");
		films2.add("Die Hard");
		films2.add("Robot Dreams");
		films2.add("Planet of the Apes");
		films2.add("The Hobbit");
		films2.add("Babadook");
		films2.add("Pretty Woman");
		
		System.out.println(films2.size());
		System.out.println(films2.get(5));
		
		/*for(int i=0; i<films2.size(); i++) {
			System.out.println(films2.get(i));
			
		}
*/
		
		System.out.println("----HASHSET");
		
		HashSet<String> hashSetFilms = new HashSet<>();
		
		hashSetFilms.add("Die Hard");
		hashSetFilms.add("Pretty Woman");
		hashSetFilms.add("DieHard");
		
		for(String film : hashSetFilms) {
		System.out.println(film);
		
	}
		System.out.println("-----HASHMAP");
		
		HashMap<String, Integer> products = new HashMap<String, Integer>();
		
		products.put("MAC",500);
		products.put("Switch", 300);
		
		System.out.println(products.toString());
		
		/* // ArrayList
        1. Write a program that shuffles an arrayList of your choice
        2. Write a program to extract elements [1-3] of an arrayList as a portion
        3. Write a program to check if an array is empty or not (return true / false) 
		 */
		
		//Array List1
		
		System.out.println("--Shuffles array");
		
		ArrayList<String> Tylersongs = new ArrayList<String>();
		Tylersongs.add("See you again");
		Tylersongs.add("Earfquake");
		Tylersongs.add("New Magic Wand");
		Tylersongs.add("Are we still friends?");
		Tylersongs.add("She");
		
		System.out.println("--Before shuffling arrayList--");
		System.out.println(Tylersongs);
		
	Collections.shuffle(Tylersongs); /*Mezcla los elementos de la lista
	se puede usar de dos formas: 1)Usando la fuente predefinida de aleatoriedad 
	2) Usando la fuente de aleatoriedad proporcionada por el usuario*/
	
	System.out.println("--After shuffling arrayList--");
	System.out.println(Tylersongs);
		
		//ArrayList2
	
	System.out.println("--Extract elements--");
	
	ArrayList<String> cars = new ArrayList<>();
	
	cars.add("Honda");
	cars.add("Audi");
	cars.add("Kia");
	cars.add("BMW");
	cars.add("Mazda");
	
	System.out.println("Original list: ");
	System.out.println(cars);
	
	List<String> subList = cars.subList(1, 4);
	
	System.out.println("Extracted sublist (elements 1 to 3)");
	System.out.println(subList);
	
	
	
	
	
	

		
	}

}
