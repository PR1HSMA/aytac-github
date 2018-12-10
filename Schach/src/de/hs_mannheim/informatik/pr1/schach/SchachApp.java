package de.hs_mannheim.informatik.pr1.schach;

import java.util.Scanner;

import de.hs_mannheim.informatik.pr1.schach.Schachbrett;

public class SchachApp {

	public static void main(String[] args) {
		Schachbrett sb = new Schachbrett();
		sb.figurenAufstellen();
		System.out.println(sb.toString());
		Scanner sc = new Scanner(System.in);
		boolean play = true;
		String spielzug;
		int spieler1 = 0;
		int spieler2 = 0;
		while (play) {
			long start = 0;
			long ende = 0;
			long dauer = 0;
			//Spieler 1
			System.out.print("Spieler mit den weißen Figuren gebe deinen Zug ein: ");
			start = System.currentTimeMillis();
			spielzug = sc.nextLine();
			boolean farbe = false;
			sb.ziehen(farbe, spielzug);
			ende = System.currentTimeMillis();
			dauer = ende - start;
			spieler1++;
			System.out.println(sb.toString());
			System.out.println("Anzahl der Züge Spieler1 : " + spieler1 + " Dauer: " + dauer + " MS");
			//Spieler 2
			farbe = true;
			System.out.print("Spieler mit den schwarzen Figuren gebe deinen Zug ein: ");
			start = System.currentTimeMillis();
			spielzug = sc.nextLine();
			sb.ziehen(true, spielzug);
			ende = System.currentTimeMillis();
			dauer = ende - start;
			spieler2++;
			System.out.println("Anzahl der Züge Spieler2 : " + spieler2 + " Dauer: " + dauer + " MS");
			System.out.println(sb.toString());
			System.out.print("Wollt ihr noch weiter spielen ? ");
			if (sc.nextLine().equals("nein")) {
				play = false;
			}
		}		
	}

}
