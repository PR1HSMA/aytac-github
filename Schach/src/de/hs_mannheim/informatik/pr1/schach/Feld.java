package de.hs_mannheim.informatik.pr1.schach;

public class Feld {
	private String[] zeilen = new String[3];
	private Figur figur = null;

	public Feld(boolean isBlack) {		
		if (isBlack)
			zeilen[0] = zeilen[1] = zeilen[2] = "\u25fe\u25fe\u25fe";
		else
			zeilen[0] = zeilen[1] = zeilen[2] = "   ";		
	}

	public String getZeile(int nr) {
		return zeilen[nr];
	}

	public void setzeFigur(Figur figur) {
		this.figur = figur;
		zeilen[1] = "" + zeilen[0].charAt(0) + figur.getSymbol() + zeilen[0].charAt(0);
	}

	// TODO: evtl. notwendig...
		public char getFigur() {
			char unicode = figur.getSymbol();
			return unicode;
		}

	public Figur entferneFigur() {
		zeilen[1] = zeilen[0];

		return figur;
	}
	public boolean getBoolean() {
		boolean rueckgabe = figur.isBlack();
		return rueckgabe;
	}
}