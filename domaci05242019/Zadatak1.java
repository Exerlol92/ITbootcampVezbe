package domaci05242019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite koliko brojeva zelite da saberete: ");
		int unetBroj, suma;
		unetBroj = sc.nextInt();

		suma = sumaTriBroja(unetBroj);
		System.out.println("Zbir brojeva je " + suma);

	}

	static int sumaTriBroja(int unetBroj) {
		Scanner sc = new Scanner(System.in);

		int suma = 0, brojac, broj;
		System.out.print("Unesite brojeve:");
		for (brojac = 1; brojac <= unetBroj; brojac++) {
			broj = sc.nextInt();
			suma += broj;
		}
		return suma;
	}
}
