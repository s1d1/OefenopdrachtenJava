package oefenen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Vakantie {
	public static void main(String[] args) {
		
		// Start the game
		System.out.println("Welkom bij het spel.");
		System.out.println("Typ 'STOP' wanneer je het programma wil stoppen.");
		
		// Initialize strings
		String eerste = "";
		String tweede = "";
		
		// User enters first item
		System.out.println("Ik ga op vakantie en neem mee...");
	    Scanner first = new Scanner(System.in);  
		System.out.print("Typ een item: ");
	    eerste = first.nextLine(); 
	    
	    // Initialize list of items and counter
	    List<String> item_list = new ArrayList<String>(); 
	    item_list.add(eerste);
	    int counter = 1;
	    
		// Ask for new item until user types "STOP"	
		while (!eerste.equals("STOP") && !tweede.equals("STOP")) {
		    char laatste_letter = eerste.charAt(eerste.length() - 1);
		    
			// User enters next item
			System.out.println("Voer nog een item in... ");
		    Scanner second = new Scanner(System.in);  
			System.out.print("Typ een item: ");
		    tweede = second.nextLine(); 
		    
		    // Save first letter
		    char eerste_letter = tweede.charAt(0);
		    
			// If last and first letter correspond 
		    if (laatste_letter == eerste_letter ) {
		    	
		    	// Add word to item list
		    	item_list.add(tweede);
		    	
		    	// Show item list
		    	System.out.print("Your list: "); 	
		    	
		    	// Print each item from the list
		        for (int i = 0; i < item_list.size() - 1;i++) 
		        { 		      
		        	System.out.print(item_list.get(i) + ", "); 		
		        }   
		        System.out.print(item_list.get(item_list.size() - 1));
		        
		        // Reset for next item
		        System.out.println("");
		    	eerste = tweede;
		    	counter++;
		    }
		    // If last and first letter differ show error message
		    else {
		    	System.out.println("Dit is een incorrect antwoord!");
		    	System.out.println("Try again.");
		    }
		}
		
		// End game when player wants to stop
		System.out.println("Thanks for playing. ");
		System.exit(0);
	}
}
