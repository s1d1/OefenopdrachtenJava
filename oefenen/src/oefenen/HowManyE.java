package oefenen;

import java.util.Scanner;

public class HowManyE {
	public static void main(String[] args) {
		
	    Scanner lezen = new Scanner(System.in);  
	    System.out.println("Enter word: ");
	    String word = lezen.nextLine(); 
	    
	    int aantal = 0;
	    char e = 'e';
	    char etrema = '�';
	    char eaccent = '�';
	    char eaccent2 = '�';
	    
	    for (int i = 0; i < word.length(); i++) {
	    	if (word.charAt(i) == e | word.charAt(i) == etrema | word.charAt(i) == eaccent | word.charAt(i) == eaccent2){
	    		aantal++;
	    	}
	    }
	    System.out.println("Het woord " + "'" + word + "' bevat " + aantal + " keer een 'e'.");  
	}
}
