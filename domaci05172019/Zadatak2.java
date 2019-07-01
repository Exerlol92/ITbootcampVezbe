package domaci05172019;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Prikazi obrnuti niz od unetog broja
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite startni broj");
		int startniBroj;
		startniBroj = sc.nextInt();
		// Odbrana od unosa nevalidnih brojeva
		if (startniBroj <= 1) {
			System.out.println("Molimo vas da unesete broj veci od 1");
			System.exit(0);
		}
		do {
			System.out.println(startniBroj);
			startniBroj--;
		} while (startniBroj >= 1);
	}

}
