package domaci06062019;

public class Pravougaonik {
	private int a;
	private int b;

	public Pravougaonik(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public void setAB(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int obim() {
		int c;
		c = 2 * this.a + 2 * this.b;
		return c;
	}

	public int povrsina() {
		int c;
		c = this.a * this.b;
		return c;
	}
}
