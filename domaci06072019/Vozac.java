package domaci06072019;

public class Vozac {
	private int id;
	private String ime;
	public static int idGlobalno = 1;

	public Vozac(String ime) {
		this.ime = ime;
		this.id = this.idGlobalno++;
	}

	public String getIme() {
		return this.ime;
	}

	public String ispis() {
		return "[" + this.id + "]" + " " + this.ime;
	}
}
