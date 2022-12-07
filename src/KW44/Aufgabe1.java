package KW44;

public class Aufgabe1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		boolean primzahl;

		for (i = 1; i < 101; i++) {
			primzahl = true;
			if (i % 3 == 0)
				System.out.println(i + " ist durch 3 teilbar");
			if (i % 4 == 0)
				System.out.println(i + "ist durch 4 teilbar");

			int j;
			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					primzahl = false;
				}
			}
			if (primzahl == true) {
				System.out.println("Primzahl:" + i);
			}

		}
	}

}
