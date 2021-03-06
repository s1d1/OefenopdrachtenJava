package oefenen;

import java.util.Scanner;

public class CountArray {
	public static void main(String[] args) {
		
		// Ask for sequence of numbers from user
	    System.out.println("Give a sequence of numbers: ");
	    Scanner s = new Scanner(System.in);  
	    String sequence = s.nextLine(); 
	    
	    // Create array with length of given sequence
	    char[] ch = new char[sequence.length()];
	   
	    // Put every character in sequence into array
	    for (int i = 0; i < sequence.length(); i++) {
	    	ch[i] = sequence.charAt(i);
	    }
	    
        // Add every element in array to sum
	    int som = 0; 
	    
        for (char c : ch) {
            int cijfer = Character.getNumericValue(c);
            som = som + cijfer;
        }
	    
        // Print sum
	    System.out.println("The total sum is: " + som);
	}
}
