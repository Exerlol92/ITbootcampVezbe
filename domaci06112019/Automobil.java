package domaci06112019;

public class Automobil extends Vozilo {

	public Automobil(String serijskiBroj, double velicinaRez, double gorivo) {
		super(serijskiBroj, velicinaRez, gorivo);
	}

	@Override
	public int izracunajPredjeneKilometre(int kilometri) {
		int j = 1;
		for (; gorivo >= 0.1 && j < kilometri; j++) {	
			this.gorivo -= (this.potrosnjaGoriva * 0.01);
		}
		return j;
	}

	@Override
	public String toString() {
		return "Auto - " + super.toString();
	}

}
