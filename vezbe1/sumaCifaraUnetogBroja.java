package vezbe1;

import java.util.Scanner;

public class sumaCifaraUnetogBroja {

	public static void main(String[] args) {
		// suma cifara odredjenog broja
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int ostatak, unos, suma, t;
		unos = sc.nextInt();
		t = unos;
		suma = 0;
		while (unos > 0) {
			ostatak = unos % 10;
			unos /= 10;
			suma += ostatak;
		}
		System.out.println("Suma cifara broja " + t + " je " + suma);
	}
}