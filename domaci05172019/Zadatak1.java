package domaci05172019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Prikazi brojeve koji su deljivi sa tri i pet a da su veci od 1
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj");
		int startniBroj, unetBroj;
		startniBroj = 1;
		unetBroj = sc.nextInt();

		while (unetBroj >= startniBroj) {
			if (startniBroj % 3 == 0 && startniBroj % 5 == 0)
				System.out.println(startniBroj);
			startniBroj++;
		}
	}

}
