import java.util.Scanner;

public class Bu�geldkatalog {

	public static void main(String[] args) {
		
		int bu�geld = 0 ;
		int punkte = 0;
		int fahrverbot = 0;
		boolean again = true;
		
		try {
			
			System.out.println("-----------------------------------------------");
			System.out.println("Bu�geldrechner");
			System.out.println("-----------------------------------------------");
		
			while (again) {
	
				//Daten Abfragen
				Scanner sc = new Scanner(System.in);
				System.out.println("Wurde die Geschwindigkeit innerorts oder au�erorts �berschritten? ");
				String ort = sc.nextLine();
				System.out.println("Um wie viel km/h wurde die Geschwindigkeit �berschritten? ");
				double geschwindigkeit = sc.nextDouble();
				System.out.println(rechner());
				System.out.println("Haben Sie die Geschwindigkeit nochmals �berschritten?");
				String check = sc.nextLine();
					
					//Pr�fung ob nochmal rechnen
					if (check.equals("Nein") || (check.equals("nein"))){
						again = false;
						break;
						
					} else if (check.equals("Ja") || (check.equals("ja"))){
						again = true;
						
					} else {
						System.out.print("�berpr�fen Sie Ihre Eingaben !");
						again = true;
					}
				
				sc.close();

			}
			
			System.out.println("Auf Wiedersehen");
			
		} catch (Exception X) {
			System.out.println("�berpr�fen Sie bitte Ihre Eingabe !");
		}
	}
	
	public void rechner() {	
			
			try {
			
				if (ort.equals("innerorts") || (ort.equals("Innerorts"))) {
					
					if ((geschwindigkeit > 0 ) && (geschwindigkeit <= 10)) {
						bu�geld = 15;
						
					} else if ((geschwindigkeit >= 11) && (geschwindigkeit <= 15)) {
						bu�geld = 25;
						 
					} else if ((geschwindigkeit >= 16) && (geschwindigkeit <= 20)) {
						bu�geld = 35;
						
					} else if ((geschwindigkeit >= 21) && (geschwindigkeit <= 25)) {
						bu�geld = 80;
						punkte = 1;
						
					} else if ((geschwindigkeit >= 26) && (geschwindigkeit <= 30)) {
						bu�geld = 100;
						punkte = 1;
						fahrverbot = 1; 
						
					} else if ((geschwindigkeit >= 31) && (geschwindigkeit <= 40)) {
						bu�geld = 160;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 41) && (geschwindigkeit <= 50)) {
						bu�geld = 200;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 51) && (geschwindigkeit <= 60)) {					
						punkte = 2; 
						fahrverbot = 2;
						
					} else if ((geschwindigkeit >= 60) && (geschwindigkeit <= 70)) {
						bu�geld = 480;
						punkte = 2;
						fahrverbot = 3;
						
						
					} else if (geschwindigkeit > 70) {
						bu�geld = 680;
						punkte = 2;
						fahrverbot = 3;
						
					}
					
				}
				
				if (ort.equals("Au�erorts") || (ort.equals("au�erorts") || (ort.equals("Auserorts") || (ort.equals("Auserorts"))))) {
					
					if ((geschwindigkeit > 0 ) && (geschwindigkeit <= 10)) {
						bu�geld = 10;
						
						
					} else if ((geschwindigkeit >= 11) && (geschwindigkeit <= 15)) {
						bu�geld = 20;
						 
					} else if ((geschwindigkeit >= 16) && (geschwindigkeit <= 20)) {
						bu�geld = 30;
						
					} else if ((geschwindigkeit >= 21) && (geschwindigkeit <= 25)) {
						bu�geld = 70;
						punkte = 1;
						
					} else if ((geschwindigkeit >= 26) && (geschwindigkeit <= 30)) {
						bu�geld = 80;
						punkte = 1;
						fahrverbot = 1; 
						
					} else if ((geschwindigkeit >= 31) && (geschwindigkeit <= 40)) {
						bu�geld = 120;
						punkte = 1;
						fahrverbot = 1; 
						
					} else if ((geschwindigkeit >= 41) && (geschwindigkeit <= 50)) {
						bu�geld = 160;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 51) && (geschwindigkeit <= 60)) {
						bu�geld = 240;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 60) && (geschwindigkeit <= 70)) {
						bu�geld = 440;
						punkte = 2;
						fahrverbot = 2;
						
					} else if (geschwindigkeit > 70) {
						bu�geld = 600;
						punkte = 2;
						fahrverbot = 3;
						
					}
				}
				
				//Ausgaben
				if (punkte == 8) {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h �berschritten. \n "
							+ "Sie m�ssen ein Bu�geld von: " + bu�geld + " � bezahlen, da Sie 8 Punkte haben wird Ihnen die Fahrerlaubnis entzogen");	
				} 
				
				if ((geschwindigkeit >= 21) && (geschwindigkeit <= 25)) {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h �berschritten. \n "
							+ "Sie m�ssen ein Bu�geld von: " + bu�geld + " � bezahlen, zus�tzlich erhalten Sie " + punkte + "Punkt");
				
				} 
				
				else if (geschwindigkeit >=26 ) {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h �berschritten. \n "
							+ "Sie m�ssen ein Bu�geld von: " + bu�geld + " � bezahlen, zus�tzlich erhalten Sie " + punkte + " Punkt und ein Fahrverbot von " 
							+ fahrverbot + " Monaten");
					
				} else {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h �berschritten. \n "
							+ "Sie m�ssen ein Bu�geld von: " + bu�geld + " � bezahlen");	
				}
				
			} catch (Exception X) {
				System.out.println("Fehler");
			}
	}
}
		
	

