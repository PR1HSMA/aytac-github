package Aufgabe3;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Mensch{
	private String studiengang;
	private String matrikelnummer;
	public String getStudiengang() {
		return studiengang;
	}
	public void setStudiengang(String studiengang) {
		this.studiengang = studiengang;
	}
	public String getMatrikelnummer() {
		return matrikelnummer;
	}
	public void setMatrikelnummer(String matrikelnummer) {
		this.matrikelnummer = matrikelnummer;
	}
	public static String suche(ArrayList<Student> studiListe) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Gebe die Matrikelnummer ein:");
		String pMatrikel = sc.nextLine();
		for (int i = 0; i < studiListe.size(); i++) {
			if (studiListe.get(i).getMatrikelnummer().equals(pMatrikel)) {
				String rueckgabe = "Vorname : " + studiListe.get(i).getVorname() + "\nNachname: "
						+ studiListe.get(i).getNachname() + "\nStudiengang: " + studiListe.get(i).getStudiengang()
						+ "\nMatrikelnummer: " + studiListe.get(i).getMatrikelnummer();
				return rueckgabe;
			}
		}
		sc.close();
		return "Kein Eintrag";
	}
	
}

