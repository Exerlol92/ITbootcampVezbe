package domaci05282019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, k;
		System.out.println("Unesite duzinu niza: ");
		n = sc.nextInt();
		System.out.println("Sada unesite kolicnik K:");
		k = sc.nextInt();
		System.out.println("Suma svih indexa/elemenata niza koji su deljivih sa K je: " + niz(n, k));
	}

	static int niz(int n, int k) {
		Scanner sc = new Scanner(System.in);
		int suma = 0;
		int[] niz = new int[n];
		for (int i = 0; i < niz.length; i++) {
			System.out.println("Unesite vrednost indexa " + i + ":");
			niz[i] = sc.nextInt();
			if (niz[i] % k == 0) {
				suma += niz[i];
			}
		}
		return suma;
	}
}
