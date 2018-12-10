package Aufgabe3;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Mensch {
	private String fachgebiet;
	private String buero;

	public String getFachgebiet() {
		return fachgebiet;
	}

	public void setFachgebiet(String fachgebiet) {
		this.fachgebiet = fachgebiet;
	}

	public String getBuero() {
		return buero;
	}

	public void setBuero(String buero) {
		this.buero = buero;
	}

	public static String suche(ArrayList<Professor> profListe) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Gebe den Nachnamen ein");  String nachname = sc.nextLine();
		for (int i = 0; i < profListe.size(); i++) {
			if (profListe.get(i).getNachname().equalsIgnoreCase(nachname)) {
				String rueckgabe = "Vorname : " + profListe.get(i).getVorname() + "\nNachname: "
						+ profListe.get(i).getNachname() + "\nFachgebiet: " + profListe.get(i).getFachgebiet()
						+ "\nBüro: " + profListe.get(i).getBuero();
				return rueckgabe;
			}
		}
		sc.close();
		return "Kein Eintrag";
	}
}
