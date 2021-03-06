package RepareCar;

import java.util.Arrays;

public class Monteur {
	public static void main(String[] args) {
		int totaal = 0;

		Auto auto = new Auto();
		System.out.println(Arrays.toString(auto.onderdelen));
		
		System.out.println("Overzicht van status onderdelen: ");
		if (auto.onderdelen[0] == false) {
			System.out.println("De motor is kapot.");
			auto.onderdelen[0] = true;
			totaal = totaal + 25;
		}
		else {
			System.out.println("De motor is niet kapot.");
		}
		
		if (auto.onderdelen[1] == false) {
			System.out.println("De deur is kapot.");
			auto.onderdelen[1] = true;
			totaal = totaal + 25;
		}
		else {
			System.out.println("De deur is niet kapot.");
		}
		
		if (auto.onderdelen[2] == false) {
			System.out.println("De voorruit is kapot.");
			auto.onderdelen[2] = true;
			totaal = totaal + 25;
		}
		else {
			System.out.println("De voorruit is niet kapot.");
		}
		
		if (auto.onderdelen[3] == false) {
			System.out.println("De uitlaat is kapot.");
			auto.onderdelen[3] = true;
			totaal = totaal + 25;
		}
		else {
			System.out.println("De uitlaat is niet kapot.");
		}
		
		System.out.println("----------------------------------------");
		
		System.out.println("Alles is gerepareerd door de monteur.");
		System.out.println("De prijs is: " + totaal);
		
	}
}
