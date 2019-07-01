package domaci05302019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj:");
		int unetBroj;
		unetBroj = sc.nextInt();
		System.out.println("Suma svih brojeva koji su delioci broja " + unetBroj + " je " + kolicnik(unetBroj));
	}

	static int kolicnik(int unetBroj) {
		int suma = 0;
		for (int i = 1; i <= unetBroj; i++) {
			if (unetBroj % i == 0) {
				suma += i;
			}
		}
		return suma;
	}
}