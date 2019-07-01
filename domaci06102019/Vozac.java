package domaci06102019;

public class Vozac extends Covek {

	private String titula = "Sofer";

	public Vozac(String ime, int tezina) {
		super(ime, tezina);

	}

	@Override
	public String toString() {
		return this.titula + "-" + super.toString();
	}

	public String getTitula() {
		return titula;
	}

}
