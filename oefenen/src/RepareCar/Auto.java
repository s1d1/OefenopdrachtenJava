package RepareCar;

import java.util.Arrays;

public class Auto {	
	boolean motor;
	boolean deur;
	boolean voorruit;
	boolean uitlaat;
	boolean onderdelen[];
    
    public Auto() {
    	onderdelen = new boolean[]{motor = true, deur = false, voorruit = false, uitlaat = true};
    }
}
