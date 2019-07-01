package domaci06102019;

import java.util.Scanner;

public class Autobus {
	private Scanner sc = new Scanner(System.in);
	private String naziv;
	private Vozac vozac;
	private double cena;
	private int brojPutnika;

	private Putnik[] nizPutnika;

	public Autobus(String naziv, double cena, int brojPutnika) {
		this.naziv = naziv;
		this.cena = cena;
		this.brojPutnika = brojPutnika;
		nizPutnika = new Putnik[brojPutnika];

	}

	public void dodajPutnika(Putnik putnik, int mesto) {
		if (nizPutnika[mesto] == null) {
			nizPutnika[mesto] = putnik;
			System.out.println("Uspesno dodat putnik na mesto "+mesto);
		}
		else System.out.println("Neuspesno dodavanje putnika, neko se vec nalazi na tom mestu!");
	}
		

	public void ukloniPutnika(Putnik putnik, int mesto) {
		if (nizPutnika[mesto] == putnik) {
			nizPutnika[mesto] = null;
			System.out.println("Uspesno uklonjen putnik "+putnik+" sa mesta "+mesto);
		}	
	}
	public void dodajVozaca (Vozac vozac) {
		if(this.vozac==null) {
			this.vozac=vozac;
			System.out.println("Uspesno dodavanje vozaca");
		}
	}
	public void ukloniVozaca (Vozac vozac) {
		if(this.vozac!=null) {
			this.vozac=null;
			System.out.println("Uspesno uklonjen vozac");
		}
	}
	public void naplataKarata() {
		if(this.vozac!=null) {
			for(int i=0;i<nizPutnika.length;i++) {
				nizPutnika[i].setOduzmiNovac(this.cena);
			}
		}
		else System.out.println("Nema vozaca u autobusu, ne mogu se naplatiti karte!");
	}

	@Override
	public String toString() {
		String s="["+this.naziv+"]{"+this.cena+"}"+"\n";
		s+=this.vozac+"\n";
		for(int i=0;i<nizPutnika.length;i++) {
			if(nizPutnika[i]!=null) s+=nizPutnika[i]+"\n";
		}
		return s;
	}
}

