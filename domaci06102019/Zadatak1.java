package domaci06102019;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		Vozac v1=new Vozac("Mile", 120);
		Autobus a1=new Autobus("Banbus", 50, 3);
		Putnik p1=new Putnik("Peca", 70, 100);
		Putnik p2=new Putnik("Ceca", 40, 50);
		Putnik p3=new Putnik("Zika", 90, 300);
		
		a1.dodajVozaca(v1);
		
		a1.dodajPutnika(p1,	0);
		a1.dodajPutnika(p2,	1);
		a1.dodajPutnika(p3,	2);
		
		a1.naplataKarata();
		System.out.println(a1);
	}

}
