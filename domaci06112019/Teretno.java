package domaci06112019;

public class Teretno extends Vozilo {

	public Teretno(String serijskiBroj, double velicinaRez, double gorivo) {
		super(serijskiBroj, velicinaRez, gorivo);
	}

	@Override
	public int izracunajPredjeneKilometre(int kilometri) {
		int j = 1;
		for (; gorivo >= 0.2 && j < kilometri; j++) {
			this.gorivo -= 3 * (this.potrosnjaGoriva * 0.01);
		}
		return j;
	}

	@Override
	public String toString() {
		return "Teretno - " + super.toString();
	}

}
