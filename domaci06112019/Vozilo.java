package domaci06112019;

public abstract class Vozilo {
	protected String registracioniBroj;
	protected String serijskiBroj;
	protected double velicinaRez;
	protected double gorivo;
	protected int potrosnjaGoriva = 7;

	public Vozilo(String serijskiBroj, double velicinaRez, double gorivo) {
		this.serijskiBroj = serijskiBroj;
		this.velicinaRez = velicinaRez;
		this.gorivo = gorivo;

	}

	public abstract int izracunajPredjeneKilometre(int kilometri);

	@Override
	public String toString() {
		return this.serijskiBroj + "{" + this.registracioniBroj + "}[" + this.gorivo + "/" + this.velicinaRez + "] - "
				+ this.potrosnjaGoriva + " L/100km";
	}

	public String getRegistracioniBroj() {
		return registracioniBroj;
	}

	public void setRegistracioniBroj(String registracioniBroj) {
		this.registracioniBroj = registracioniBroj;
	}

	public double getGorivo() {
		return gorivo;
	}

	public void dodajGorivo(double gorivo) {
		if ((this.gorivo + gorivo) <= this.velicinaRez) {
			this.gorivo += gorivo;
			System.out.println("Gorivo uspesno dodato!");
		} else {
			System.out.println("Neuspesno!");
		}
	}

	public void oduzmigorivo(double gorivo) {
		if (this.gorivo >= gorivo) {
			this.gorivo -= gorivo;
			System.out.println("Gorivo uspesno oduzeto!");
		} else {
			System.out.println("Neuspesno!");
		}
	}

	public String getSerijskiBroj() {
		return serijskiBroj;
	}

	public double getVelicinaRez() {
		return velicinaRez;
	}

}
