package Kapitel12;

import java.util.Scanner;

public class Discountpreise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner eingabe = new Scanner(System.in);

		System.out.print("Geben sie Ihren Gesamtbetrag ein");
		int Betrag = eingabe.nextInt();

		if (Betrag <= 1000)
			System.out.print("Discountpreis:" + Betrag);

		else
			System.out.print("Discountpreis:" + (Betrag - Betrag * 10 / 100));

	}

}
