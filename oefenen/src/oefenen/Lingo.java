package oefenen;

import java.util.Scanner;

public class Lingo {	
	public static void main(String[] args) {
	
		System.out.println("Welcome to LINGO!");
		System.out.println("Here is your word: ");
		
		// Create a word
		String word = "fiets";
		
		// Show the amount of letters 
		System.out.println("_ _ _ _ _ "); 
		
		// Let the user guess
		System.out.println("Let's start guessing...");
	    Scanner s = new Scanner(System.in);  
		System.out.print("Your guess: ");
	    String guess = s.nextLine(); 
		System.out.println("You've chosen: " + guess);
		
		// Convert strings to arrays
		char[] guessArray = guess.toCharArray();
		char[] wordArray = word.toCharArray();
	   
		// Initialize result array
		char[] result = new char[5];
		
		// Check the result the guess and save in array
		for (int i = 0; i < word.length(); i++) {
			// in string
			if (word.indexOf(guessArray[i]) != -1) {
				// if on right spot 
				if (wordArray[i] == guessArray[i]) {
					result[i] = '2';
				}
				// if not in right spot
				else {
					result[i] = '1';
				}	
			}
			// not in string
			else {
				result[i] = '0';
			}				
		}
		System.out.println("Your result: ");
		System.out.println(result);
		
	}
	
}
