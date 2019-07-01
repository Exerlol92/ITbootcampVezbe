package domaci05162019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// Novac koji je potrebno vratiti
		Scanner sc = new Scanner(System.in);
		double kolicinaNovca, kamatnaStopa, povratniNovac;
		System.out.println("Unesite kolicinu novca");
		kolicinaNovca = sc.nextDouble();
		kamatnaStopa = 10;
		povratniNovac = kolicinaNovca * (1 + 0.01 * kamatnaStopa);
		System.out.println("Iznos novca koji je potrebno vratiti je " + povratniNovac + " din");
	}

}
