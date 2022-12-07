package Kapitel12;

import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);

		System.out.println("Tankkapazität");
		int tankkapazität = eingabe.nextInt();
		
		
			
		System.out.println("Benzinanzeige");
		int benzinanzeige = eingabe.nextInt();
		

		
		System.out.println("Meilen pro Gallone");
		int meilenProGallone = eingabe.nextInt();
		
		if (meilenProGallone<=200)
			System.out.println("Tanken!");
		else System.out.println("Weiterfahren");
		
		
		
		

		
	}

}
