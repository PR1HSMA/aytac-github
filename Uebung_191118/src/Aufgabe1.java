
public class Aufgabe1 {

	public static void main(String[] args) {
		int[] ausgabe = quadrieren(5, 10);
		for (int i = 0; i < ausgabe.length; i++) {
			System.out.println(ausgabe[i]);
		}
	}
	
	public static int[] quadrieren(int pStart, int pEnde) {
		int[] ergebnisse = new int[(pEnde-pStart)];
		int zaehler = 0;
		for (int i = pStart; i < pEnde; i++) {
			ergebnisse[zaehler] = i*i;
			zaehler++;
		}
		return ergebnisse;
	}

}
