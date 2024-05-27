/* Character HistogramObjective
Write a program that takes a string input from the user and prints a histogram of the characters occurring in the string.
Description
A histogram is a graphical representation showing a visual impression of the distribution of data. In this case, use asterisks (*) to represent the occurrence count of each character.
Instructions
Prompt the user to input a string.
Analyze the string to count the occurrence of each character.
Print a histogram showing how many times each character appears in the string.
Ensure the histogram is readable and clearly represents the character distribution.*/

package com.histogram;




import java.util.HashMap;
import java.util.Scanner;

public class Histogram_program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your phrase ");
		String phrase = sc.nextLine();
		
		HashMap<Character, Integer> histogram = new HashMap<>();
		
		for(char c : phrase.toCharArray()) {
			histogram.put(c,histogram.getOrDefault(c,0) + 1);
		}
		
		System.out.println("HISTOGRAM: \n" + histogram);
	}

}
