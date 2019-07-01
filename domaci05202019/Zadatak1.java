package domaci05202019;

public class Zadatak1 {

	public static void main(String[] args) {
		// Ispisivanje brojeva od X do Y koji su deljivi sa Z
		int x, y, z, suma;
		for (x = 1, y = 20, z = 3, suma = 0; x <= y; x++) {
			if (x % z == 0) {
				System.out.println(x);
				suma += x;
			}			
		}
		System.out.println("Suma brojeva u ovom opsegu je " + suma);
		}

	}


