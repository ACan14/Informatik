package Kapitel12;

import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String[] args) {
		
		DateTime birth = DateTime.parse("12.05.1981", DateTimeFormat.forPattern("dd.MM.yyyy"));
		int age = new DateTime().year().get() - birth.year().get();
	}

}
