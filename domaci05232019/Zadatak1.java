package domaci05232019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj:");
		int unetBroj, ostatakBroja, zbirParnih, razlikaNeparnih;
		unetBroj = sc.nextInt();

		zbirParnih = 0;
		razlikaNeparnih = 0;

		while (unetBroj > 0) {
			ostatakBroja = unetBroj % 10;

			if (ostatakBroja % 2 == 0) {
				zbirParnih += ostatakBroja;
			} else {
				razlikaNeparnih -= ostatakBroja;
			}

			unetBroj /= 10;
		}
		System.out.println("Zbir parnih cifara ovog broja je " + zbirParnih);
		System.out.println("Razlika neparnih cifara ovog broja je " + razlikaNeparnih);
	}
}