package com.generation;
import java.util.Scanner;

public class diamont_excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter the size of the diamond pattern (less than 50): ");
int size = sc.nextInt();

if(size >=50 || size <=0) {
	System.out.println("The size must be less than 50 and greater than 0");
	
}

int n= size *2-1;

for(int i=0; i< size; i++) {
	for(int j=0; j<n; j++) {
		if (j >= size -i -1 && j <=size + i-1) {
			
			System.out.println("*");
			
		}else {
			
			System.out.println(" ");
		}
	}
	
	System.out.println();
}

for (int i= size - 2; i>=0; i--) {
	for (int j=0; j<n; j++) {
		if (j>= size -i -1 && j<=size + i -1) {
			
			System.out.println("*");
		}else {
			System.out.println();
		}
		sc.close();
	}
}
	}

}
