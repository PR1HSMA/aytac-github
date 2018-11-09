
public class Aufgabe1_Startklasse {

	public static void main(String[] args) {
		Produkt p01 = new Produkt(5, "Tastatur", 2);
		Produkt p02 = new Produkt(10, "Maus", 7);
		Produkt p03 = new Produkt(9, "Kopfhörer", 2);
		
		p01.berrechnePreis();
		p02.berrechnePreis();
		p03.berrechnePreis();
		System.out.println(p01.quittung());
		System.out.println(p02.quittung());
		System.out.println(p03.quittung());

	}

}
