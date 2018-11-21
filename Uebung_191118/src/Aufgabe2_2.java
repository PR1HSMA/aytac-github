/*Aufgabe 2
Schreiben  Sie zwei  Methoden, die den  Buﬂgeld
-
Rechner  (s.  Folie  21 in der Vorlesung zu Fallunterscheidungen) implementieren.  Die  Erste  soll  dazu  nur  if-Abfragen  verwenden,  in  der 
zweiten soll die Funktionalit‰t mit Hilfe von ifs, Schleifen und Arrays umgesetzt werden
*/
public class Aufgabe2_2 {

	public static void main(String[] args) {
		System.out.println(strafZahlung("auﬂerorts", 53));
	}
	
	public static int strafZahlung(String art, int geschwindigkeit) {
		// dekleration der Benˆtigen Arrays 
		int[] tempoUeberschreitung = {10,11,16,21,26,31,41,51,61,70};
		int[] innerortsStrafe = {15,25,35,80,100,160,200,280,480,680};
		int[] auﬂerortsStrafe = {10,20,30,70,80,120,160,240,440,600};
		int zaehler = 2;
		// Abfrage bzw. Ausgabe Innerorts
		if(art.equalsIgnoreCase("innerorts")) {
		for (int i = 1; i < innerortsStrafe.length; i++) {
				if (geschwindigkeit == tempoUeberschreitung[0]) {
					return innerortsStrafe[0];
				}
				else if (geschwindigkeit >= tempoUeberschreitung[tempoUeberschreitung.length-1]) {
					return innerortsStrafe[innerortsStrafe.length-1];
				}
				else if (geschwindigkeit>=tempoUeberschreitung[i] && 
					geschwindigkeit < tempoUeberschreitung[zaehler]) {
					return innerortsStrafe[i];
				}
			zaehler++;
		}
		}
		// Abfrage bzw. Ausgabe Auﬂerorts
		else if(art.equalsIgnoreCase("auﬂerorts")) {
			for (int i = 1; i < innerortsStrafe.length; i++) {
				if (geschwindigkeit == tempoUeberschreitung[0]) {
					return auﬂerortsStrafe[0];
				}
				else if ( geschwindigkeit >= tempoUeberschreitung[tempoUeberschreitung.length-1]) {
					return auﬂerortsStrafe[tempoUeberschreitung.length-1];
				}
				else if (geschwindigkeit>=tempoUeberschreitung[i] && 
						geschwindigkeit< tempoUeberschreitung[zaehler]) {
					return auﬂerortsStrafe[i];
				}
			zaehler++;
			}
		}
		return 0;
	}
}
