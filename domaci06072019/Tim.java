package domaci06072019;

public class Tim {
	private String naziv;
	private int brojVozaca;
	private Vozac vozac1;
	private Vozac vozac2;

	private Tim(String naziv) {
		this.naziv = naziv;
	}

	public static Tim ucitajTim(String imeTima) {
		Tim tim = new Tim(imeTima);
		return tim;
	}

	public String getNaziv() {
		return this.naziv;
	}

	public int getBrojVozaca() {
		return this.brojVozaca;
	}

	public void dodajVozaca1(Vozac vozac) {
		if (brojVozaca < 2 && vozac1 == null) {
			this.vozac1 = vozac;
			brojVozaca++;
		}
	}

	public void dodajVozaca2(Vozac vozac) {
		if (brojVozaca < 2 && vozac2 == null) {
			this.vozac2 = vozac;
			brojVozaca++;
		}
	}

	public String ispis() {
		
		if (brojVozaca == 0) 
			return "Tim " + this.naziv + " mora da ima barem jednog vozaca";
		
		if (vozac1 != null && vozac2 == null)
			return this.naziv + "\n" + vozac1.ispis();
		else if (vozac1 == null && vozac2 != null)
			return this.naziv + "\n" + vozac2.ispis();
		else 
			 return this.naziv + "\n" + vozac1.ispis() + "\n" + vozac2.ispis();

	}
}
