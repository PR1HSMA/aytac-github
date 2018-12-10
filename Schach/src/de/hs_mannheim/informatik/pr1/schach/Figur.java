package de.hs_mannheim.informatik.pr1.schach;

public class Figur {
	private char symbol;
	private boolean black;

	public Figur(boolean isBlack, String typ) {
		black = isBlack;
		
		switch (typ) {
		case "Turm": symbol = '\u2656';break;
		case "Dame": symbol = '\u2655';break;
		case "König": symbol ='\u2654';break;
		case "Pferd": symbol ='\u2658';break;
		case "Läufer": symbol = '\u2657';break;
		case "Bauer": symbol = '\u2659';break;
		default: 
			symbol = ' ';break;
		}

		if (isBlack)
			symbol += 6;
	}
	
	public char  getSymbol() {
		return symbol;
	}

	public boolean isBlack() {
		return black;
	}
}
