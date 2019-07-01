package domaci06062019;

public class Zadatak1 {

	public static void main(String[] args) {
		Pravougaonik p1 = new Pravougaonik(10, 5);
		p1.setAB(5, 3);
		System.out.println("Stranica a= " + p1.getA() + " Stranica b= " + p1.getB());
		System.out.println("Obim pravougaonika je: " + p1.obim() + " Povrsina je: " + p1.povrsina());

	}

}
