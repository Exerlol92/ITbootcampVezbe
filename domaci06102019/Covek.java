package domaci06102019;

public class Covek {
	protected String ime;
	protected int tezina;
	protected int id;
	protected static int idGlobalno = 0;

	public Covek(String ime, int tezina) {
		this.ime = ime;
		this.tezina = tezina;
		this.id = idGlobalno++;
	}

	public String getIme() {
		return ime;
	}

	public int getTezina() {
		return tezina;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "[" + this.id + "]" + this.ime + ":{" + this.tezina + "}";
	}
}
