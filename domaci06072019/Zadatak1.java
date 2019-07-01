package domaci06072019;

public class Zadatak1 {

	public static void main(String[] args) {

		Tim tim1 = Tim.ucitajTim("Fiat");
		Tim tim2 = Tim.ucitajTim("BMW");
		Vozac vozac1 = new Vozac("Pera");
		Vozac vozac2 = new Vozac("Mika");
		Vozac vozac3 = new Vozac("Zika");

		tim1.dodajVozaca1(vozac1);
		tim1.dodajVozaca2(vozac2);
		tim1.dodajVozaca2(vozac3); //dodat cisto radi testa da bih bio siguran da ne dodaje preko dva vozaca
		// takodje sam testirao i kada nama vozaca scenario

		tim2.dodajVozaca1(vozac3);

		System.out.println(tim1.ispis());
		System.out.println(tim2.ispis());

		

	}

}
