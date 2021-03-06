package oefenen;

import java.util.Arrays;
import java.util.Scanner;

public class SortLetters {
	public static void main(String[] args) {
		// Ask for word from user
	    System.out.println("Type a word in lowercase: ");
	    Scanner s = new Scanner(System.in);  
	    String word = s.nextLine(); 
	    
	    // Print word
	    System.out.println("You've typed: " + word); 
	    
	    // Set and print word in alphabetical order
	    char sortedWord[] = word.toCharArray();
	    Arrays.sort(sortedWord);
	    System.out.println(new String(sortedWord));
	}
}
