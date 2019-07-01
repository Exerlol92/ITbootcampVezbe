package vezbe1;

import java.util.Scanner;

public class TajniBroj {

	public static void main(String[] args) {
		// tajni broj je 15, navedi lice koje pogodja na taj broj
		Scanner sc = new Scanner(System.in);

		int tajniBroj =15;
		int unos;
		System.out.println("Pogadjajte broj: ");
		unos = sc.nextInt();
		
		while(unos != tajniBroj) {
			if ((unos) <= 5 || (unos) >= 25) 
				System.out.println("Hladno - niste pogodili i daleko ste!");
			 else
				System.out.println("Toplo - niste pogodili ali ste blizu");
		
			System.out.println("Unesi ponovo broj");
			unos = sc.nextInt();
		}
		
		System.out.println("Cestitamo pogodili ste tajni broj je " + tajniBroj);
	}
}
