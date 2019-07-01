package domaci05162019;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
		// Izracunavanje formule
		Scanner sc = new Scanner(System.in);
		double rezultat, x;
		System.out.println("Unesite vrednost X");
		x = sc.nextDouble();
		rezultat = 34 * x + x / 59;
		System.out.println("Vrednost Y je " + rezultat);
	}

}
