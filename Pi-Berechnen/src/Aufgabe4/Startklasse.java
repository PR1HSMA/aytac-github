package Aufgabe4;

import java.util.ArrayList;
import java.util.Scanner;

public class Startklasse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println(Wuerfel.prüfe(Wuerfel.wuerfelbecherErstellen()));
		System.out.println("Willst du noch einmal würfeln ?\n> ");
		}
		while(sc.nextLine().equalsIgnoreCase("ja"));
		System.out.println("PROGRAMM GESCHLOSSEN");
	}

}
