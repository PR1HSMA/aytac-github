package de.hs_mannheim.informatik.pr1.schach;

public class Schachbrett {
	private int breite = 8;
	private int hoehe = 8;

	private Feld[][] felder = new Feld[hoehe][breite];

	public Schachbrett() {
		for (int i = 0; i < felder.length; i++) {
			for (int j = 0; j < felder[0].length; j++) {
				if (i % 2 == 0 && j % 2 == 0)
					felder[i][j] = new Feld(false);
				else if (i % 2 == 1 && j % 2 == 0)
					felder[i][j] = new Feld(true);
				else if (i % 2 == 0 && j % 2 == 1)
					felder[i][j] = new Feld(true);
				else if (i % 2 == 1 && j % 2 == 1)
					felder[i][j] = new Feld(false);
			}
		} // for i
		
	}
	
	public String ziehen(boolean isBlack, String zug) {
		//Überprüfen und entfernen
		String[] aufteilen = zug.split(">");
		int nummer = 0;
		if (aufteilen[0].contains("A")) {nummer = 0;}
		else if(aufteilen[0].contains("B")) {nummer = 1;}
		else if(aufteilen[0].contains("C")) {nummer = 2;}
		else if(aufteilen[0].contains("D")) {nummer = 3;}
		else if(aufteilen[0].contains("E")) {nummer = 4;}
		else if(aufteilen[0].contains("F")) {nummer = 5;}
		else if(aufteilen[0].contains("G")) {nummer = 6;}
		else if(aufteilen[0].contains("H")) {nummer = 7;}
		
		int senkrecht = 0;
		if (aufteilen[0].contains("1")) {senkrecht = 7;}
		else if(aufteilen[0].contains("2")) {senkrecht = 6;}
		else if(aufteilen[0].contains("3")) {senkrecht = 5;}
		else if(aufteilen[0].contains("4")) {senkrecht = 4;}
		else if(aufteilen[0].contains("5")) {senkrecht = 3;}
		else if(aufteilen[0].contains("6")) {senkrecht = 2;}
		else if(aufteilen[0].contains("7")) {senkrecht= 1;}
		else if(aufteilen[0].contains("8")) {senkrecht= 0;}
		
		boolean abfrage = felder[senkrecht][nummer].getBoolean();
		if (abfrage !=isBlack) {
			System.err.println("FEHLER");
			return null;
		}		
		else {
		felder[senkrecht][nummer].entferneFigur();
		char a = felder[senkrecht][nummer].getFigur();
		String schachFigur = " ";
		switch(a) {
		case '\u2656': schachFigur = "Turm";break;
		case '\u2655': schachFigur="Dame" ;break;
		case '\u2654': schachFigur ="König";break;
		case '\u2658': schachFigur="Pferd";break;
		case '\u2657': schachFigur= "Läufer";break;
		case '\u2659': schachFigur ="Bauer" ;break;
		case '\u265C': schachFigur = "Turm";break;
		case '\u265B': schachFigur="Dame" ;break;
		case '\u265A': schachFigur ="König";break;
		case '\u265E': schachFigur="Pferd";break;
		case '\u265D': schachFigur= "Läufer";break;
		case '\u265F': schachFigur ="Bauer" ;break;
		}
		//Zug durchführen
		if (aufteilen[1].contains("A")) {nummer = 0;}
		else if(aufteilen[1].contains("B")) {nummer = 1;}
		else if(aufteilen[1].contains("C")) {nummer = 2;}
		else if(aufteilen[1].contains("D")) {nummer = 3;}
		else if(aufteilen[1].contains("E")) {nummer = 4;}
		else if(aufteilen[1].contains("F")) {nummer = 5;}
		else if(aufteilen[1].contains("G")) {nummer = 6;}
		else if(aufteilen[1].contains("H")) {nummer = 7;}
		
		
		if (aufteilen[1].contains("1")) {senkrecht = 7;}
		else if(aufteilen[1].contains("2")) {senkrecht = 6;}
		else if(aufteilen[1].contains("3")) {senkrecht = 5;}
		else if(aufteilen[1].contains("4")) {senkrecht = 4;}
		else if(aufteilen[1].contains("5")) {senkrecht = 3;}
		else if(aufteilen[1].contains("6")) {senkrecht = 2;}
		else if(aufteilen[1].contains("7")) {senkrecht= 1;}
		else if(aufteilen[1].contains("8")) {senkrecht= 0;}
		

		felder[senkrecht][nummer].setzeFigur(new Figur(isBlack, schachFigur));
		}
		return null;
	}
	
	public void figurenAufstellen() {
		for (int i = 0; i < felder.length; i++) {
			felder[1][i].setzeFigur(new Figur(true, "Bauer"));
			felder[6][i].setzeFigur(new Figur(false, "Bauer"));
			
		}
		felder[0][0].setzeFigur(new Figur(true, "Turm"));
		felder[0][1].setzeFigur(new Figur(true, "Pferd"));
		felder[0][2].setzeFigur(new Figur(true, "Läufer"));
		felder[0][3].setzeFigur(new Figur(true, "König"));
		felder[0][4].setzeFigur(new Figur(true, "Dame"));
		felder[0][5].setzeFigur(new Figur(true, "Läufer"));
		felder[0][6].setzeFigur(new Figur(true, "Pferd"));
		felder[0][7].setzeFigur(new Figur(true, "Turm"));
		
		felder[7][0].setzeFigur(new Figur(false, "Turm"));
		felder[7][1].setzeFigur(new Figur(false, "Pferd"));
		felder[7][2].setzeFigur(new Figur(false, "Läufer"));
		felder[7][3].setzeFigur(new Figur(false, "König"));
		felder[7][4].setzeFigur(new Figur(false, "Dame"));
		felder[7][5].setzeFigur(new Figur(false, "Läufer"));
		felder[7][6].setzeFigur(new Figur(false, "Pferd"));
		felder[7][7].setzeFigur(new Figur(false, "Turm"));
		// TODO: s. Aufgabe a)
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		// obere Linie
		sb.append(" \u250f");
		for (int i = 0; i < felder.length * 2-4; i++) 
			sb.append("\u2501\u2501");
		sb.append("\u2513\n");
		
		// Felder
		for (int i = 0; i < felder.length; i++) {
			for (int z = 0; z < 3; z++) {

				// Zeilennummer
				if (z == 1)
					sb.append(8-i);
				else
					sb.append(" ");
				
				sb.append("\u2503");
				for (int j = 0; j < felder[0].length; j++) {
					sb.append(felder[i][j].getZeile(z));
				}
				sb.append("\u2503\n");
			}
		}

		// untere Linie
		sb.append(" \u2517");
		for (int i = 0; i < felder.length * 3-1; i++) 
			sb.append("\u2501");
		sb.append("\u2501\u251b\n  ");
		
		// Buchstaben unten
		for (int i = 0; i < felder.length; i++) {
			sb.append(" " + (char)(65 + i) + " ");
		}

		return sb.toString();
	}
}
