package Aufgabe4;

public class Aufgabe4 {

	public static void main(String[] args) {
		int zaehler = 1;
		boolean test = false;
		while(test == false) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(zaehler + " * " + i  + " = " + (zaehler*i));
		}
		System.out.println("----------------------------------------------------------------------");
		zaehler++;
		if (zaehler>10) {
			test = true;
		}
		}
	}

}
