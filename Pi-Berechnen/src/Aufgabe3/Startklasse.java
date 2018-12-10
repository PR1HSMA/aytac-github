package Aufgabe3;

import java.util.ArrayList;
import java.util.Scanner;

public class Startklasse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> studentenListe= new ArrayList<>();
		ArrayList<Professor> professorListe= new ArrayList<>();	
		do {
			System.out.print("Willst du einen Student oder einen Professor anlegen");
			String eingabe = sc.nextLine();
			if (eingabe.equalsIgnoreCase("Studenten")) {
				Student s01 = new Student();
				s01.setVorname("Thomas");
				s01.setNachname("Bauer");
				s01.setMatrikelnummer("1825960");
				s01.setStudiengang("UIB");
				studentenListe.add(s01);
			}
			else if(eingabe.equalsIgnoreCase("Professor")) {
				Professor p1 = new Professor();
				p1.setVorname("Thorsten");
				p1.setNachname("Stahl");
				p1.setBuero("A105");
				p1.setFachgebiet("Programmieren");
				professorListe.add(p1);
			}
			System.out.print("Willst du noch einen weiteren Prof/Studi anlegen? ");
		}
		while(sc.nextLine().equalsIgnoreCase("ja"));
		
		System.out.println("Willst du suchen ? ");
		if (sc.nextLine().equalsIgnoreCase("ja")) {
			System.out.print("Nach was willst du suchem: ");
			String eingabe = sc.nextLine();
			if (eingabe.equalsIgnoreCase("studenten")) {
				System.out.println(Student.suche(studentenListe));
			}
			else if(eingabe.equalsIgnoreCase("professor")) {
				System.out.println(Professor.suche(professorListe));
			}
		}
		
		
		
	sc.close();
	}
}
