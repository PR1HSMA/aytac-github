package Aufgabe3;

public class Aufgabe3 {

	public static void main(String[] args) {
		//Aufgabe 3c)
		Aufgabe3 a1 = new Aufgabe3();
		int[] leeresArray = new int[10];
		a1.befuellen(leeresArray);
		int[] leeresArray02 = new int[10];
		a1.befuellen(leeresArray02);
		int[] ausgabeArray = a1.zusammenfuegen(leeresArray, leeresArray02);
		for (int i = 0; i < ausgabeArray.length; i++) {
			System.out.println(ausgabeArray[i]);
		}

	}
	//Aufgabe 3a)
	public int[] befuellen(int[] pIntArray) {
		
		for (int i = 0; i < pIntArray.length; i++) {
			int randomZahl = (int) ((Math.random()*10000)+1);
			pIntArray[i] = randomZahl;
		}
		return pIntArray;
	}
	//Aufgabe 3b)
	public int[] zusammenfuegen(int[] pIntArray, int[] zweitesArray ) {
		boolean ueberpruefung = false; 
		int zaehler = 0;
		int stelle = 0;
		int [] zusammenArray = new int[(pIntArray.length+zweitesArray.length)];
		while(ueberpruefung==false){
			if(stelle < pIntArray.length) {
			zusammenArray[zaehler] = pIntArray[stelle];
			zaehler++;
			zusammenArray[zaehler] = zweitesArray[stelle];
			zaehler++;
			stelle++;
			}
		else {
			ueberpruefung = true;
		}
		}
		return zusammenArray;
	}
	
	
	

}
