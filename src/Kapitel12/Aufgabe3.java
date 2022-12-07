package Kapitel12;

import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		Scanner eingabe = new Scanner(System.in);

		System.out.println("Anzahl der Schrauben");
		int anzahlSchrauben = eingabe.nextInt();
		
		if(anzahlSchrauben <=1)
		System.out.println(anzahlSchrauben*5);
			
		System.out.println("Anzahl der Muttern");
		int anzahlMuttern = eingabe.nextInt();
		

		
		System.out.println("Anzahl der Unterlegscheiben");
		int anzahlUnterlegscheiben = eingabe.nextInt();
		
		if (anzahlMuttern<anzahlSchrauben)
			System.out.println("Überprüfen sie ihre Bestellung");
		else System.out.println("Bestellung ist OK");
		
		
		
		System.out.println("Geasamtbetrag:"+ (anzahlSchrauben*5 +anzahlMuttern*3 +anzahlUnterlegscheiben*1));

		
	}

}
