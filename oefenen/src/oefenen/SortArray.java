package oefenen;

import java.util.Arrays;
import java.util.Random;

public class SortArray {
	public static void main(String[] args) {
		
		// Maak een array van lengte van 10 
		Random random = new Random();
		int[] array = new int[10];
		int upperbound = 9;
		
		
		// Voeg 10 random getallen toe aan de array
		for (int i = 0; i < array.length; i++){
			array[i] = random.nextInt(upperbound);
		}
		
		// Print ongesorteerde array
		System.out.print("The unsorted array: "); 
		System.out.println(Arrays.toString(array)); 
		
		// Sorteer de array
		Arrays.sort(array);
		System.out.println("--------------------------------------------------");
		
		// Print de gesorteerde array 
		System.out.print("The sorted array: "); 
		System.out.println(Arrays.toString(array)); 
		 
	}
}
