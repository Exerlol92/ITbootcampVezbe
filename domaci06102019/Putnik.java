package domaci06102019;

public class Putnik extends Covek {
	private double novac;
	private String titula = "Putnik";

	public Putnik(String ime, int tezina, double novac) {
		super(ime, tezina);
		this.novac = novac;
	}

	public double getNovac() {
		return novac;
	}

	public void setDodajNovac(double unos) {
		if (unos <= 0)
			System.out.println("Neuspesno dodavanje novca!");
		else {
			this.novac += unos;
			System.out.println("Uspesno dodavanje novca, trenutno stanje je: "+this.novac);
		}
	}

	public void setOduzmiNovac(double unos) {
		if (unos <= 0 || unos > this.novac)
			System.out.println("Neuspesna naplata!");
		else {
			this.novac -= unos;
			System.out.println("Uspesna naplata!");
		}
	}

	@Override
	public String toString() {
		return this.titula+"[" +this.novac+ "]-"+super.toString();
	}
}
