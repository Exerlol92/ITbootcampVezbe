package domaci05272019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h1, v1, h2, v2;
		System.out.println("Unesite poziciju bele figure:");
		v1 = sc.nextInt();
		h1 = sc.nextInt();
		System.out.println("Sada unesite poziciju crne kraljice:");
		v2 = sc.nextInt();
		h2 = sc.nextInt();
		if (sah(v1, h1, v2, h2)) {
			System.out.println("NOMNOM");
		} else {
			System.out.println("NE");
		}
	}

	static boolean sah(int v1, int h1, int v2, int h2) {
		if ((v1 + h1) == (v2 + h2) || (v1 - h1) == (v2 - h2) || v1 == v2 || h1 == h2) {
			return true;
		} else {
			return false;
		}
	}

}
