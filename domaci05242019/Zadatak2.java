package domaci05242019;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 2 broja: ");
		int unetBroj1, unetBroj2, fakt;
		unetBroj1 = sc.nextInt();
		unetBroj2 = sc.nextInt();
		fakt = faktorijel(unetBroj1, unetBroj2);
		System.out.println("n! * k! = " + fakt);
	}

	static int faktorijel(int unetBroj1, int unetBroj2) {
		int brojac, faktN, faktK, proizvod;
		for (brojac = 1, faktN = 1; brojac <= unetBroj1; brojac++) {
			faktN = faktN * brojac;
		}
		for (brojac = 1, faktK = 1; brojac <= unetBroj2; brojac++) {
			faktK = faktK * brojac;
		}
		proizvod = (faktN) * (faktK);
		return proizvod;
	}
}
