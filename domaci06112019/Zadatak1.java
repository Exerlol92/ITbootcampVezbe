package domaci06112019;

public class Zadatak1 {

	public static void main(String[] args) {
		Automobil a1=new Automobil("1234", 30, 10);
		//a1.dodajGorivo(20);
		//System.out.println(a1.gorivo);
		//a1.oduzmigorivo(30);
		//System.out.println(a1.gorivo);
		a1.setRegistracioniBroj("BG 123 MT");
		Teretno t1=new Teretno("4321", 50, 10);
		t1.setRegistracioniBroj("KG 456 TM");
		System.out.println("Uspeli ste da predjete: "+a1.izracunajPredjeneKilometre(1000)+"KM"+"\nU rezervoaru vam je ostalo: "+a1.getGorivo()); 
		System.out.println("Uspeli ste da predjete: "+t1.izracunajPredjeneKilometre(1000)+"KM"+"\nU rezervoaru vam je ostalo: "+t1.getGorivo());
		System.out.println(a1);
		System.out.println(t1);
	}

}
