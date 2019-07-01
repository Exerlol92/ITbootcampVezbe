package domaci05212019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// unesi brojeve sve dok ne ubacis 0, kad ubacis 0 saberi mi sve prethodno
		// ubacene brojeve
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite brojeve: ");
		int unetBroj, suma;
		suma = 0;
		while ((unetBroj = sc.nextInt()) != 0) {
			suma += unetBroj;

		}
		System.out.println("Suma ovih brojeva je " + suma);
	}
}
