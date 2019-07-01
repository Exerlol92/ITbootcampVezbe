package domaci05312019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Unesite koliko vas niz treba da sadrzi elemenata: ");
		n = sc.nextInt();
		int[] niz = new int[n];
		if (rastuciNiz(niz)) {
			System.out.println("Rastuci je niz!");
		} else {
			System.out.println("Niz nije rastuci!");

		}
		for (int i = 0; i < niz.length; i++) {
			System.out.print(niz[i] + " ");
		}
	}

	static boolean rastuciNiz(int[] niz) {
		Scanner sc = new Scanner(System.in);

		int cuvar = 0;
		boolean rastuciNiz = true;
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite vrednost elementa " + i);
			niz[i] = sc.nextInt();
			if (niz[i] > cuvar) {
				cuvar = niz[i];
			} else
				rastuciNiz = !rastuciNiz;
		}
		return rastuciNiz;
	}

}
