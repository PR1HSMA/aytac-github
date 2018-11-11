import java.util.Scanner;

public class Bußgeldkatalog {

	public static void main(String[] args) {
		
		int bußgeld = 0 ;
		int punkte = 0;
		int fahrverbot = 0;
		boolean again = true;
		
		try {
			
			System.out.println("-----------------------------------------------");
			System.out.println("Bußgeldrechner");
			System.out.println("-----------------------------------------------");
		
			while (again) {
	
				//Daten Abfragen
				Scanner sc = new Scanner(System.in);
				System.out.println("Wurde die Geschwindigkeit innerorts oder außerorts überschritten? ");
				String ort = sc.nextLine();
				System.out.println("Um wie viel km/h wurde die Geschwindigkeit überschritten? ");
				double geschwindigkeit = sc.nextDouble();
				System.out.println(rechner());
				System.out.println("Haben Sie die Geschwindigkeit nochmals überschritten?");
				String check = sc.nextLine();
					
					//Prüfung ob nochmal rechnen
					if (check.equals("Nein") || (check.equals("nein"))){
						again = false;
						break;
						
					} else if (check.equals("Ja") || (check.equals("ja"))){
						again = true;
						
					} else {
						System.out.print("Überprüfen Sie Ihre Eingaben !");
						again = true;
					}
				
				sc.close();

			}
			
			System.out.println("Auf Wiedersehen");
			
		} catch (Exception X) {
			System.out.println("Überprüfen Sie bitte Ihre Eingabe !");
		}
	}
	
	public void rechner() {	
			
			try {
			
				if (ort.equals("innerorts") || (ort.equals("Innerorts"))) {
					
					if ((geschwindigkeit > 0 ) && (geschwindigkeit <= 10)) {
						bußgeld = 15;
						
					} else if ((geschwindigkeit >= 11) && (geschwindigkeit <= 15)) {
						bußgeld = 25;
						 
					} else if ((geschwindigkeit >= 16) && (geschwindigkeit <= 20)) {
						bußgeld = 35;
						
					} else if ((geschwindigkeit >= 21) && (geschwindigkeit <= 25)) {
						bußgeld = 80;
						punkte = 1;
						
					} else if ((geschwindigkeit >= 26) && (geschwindigkeit <= 30)) {
						bußgeld = 100;
						punkte = 1;
						fahrverbot = 1; 
						
					} else if ((geschwindigkeit >= 31) && (geschwindigkeit <= 40)) {
						bußgeld = 160;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 41) && (geschwindigkeit <= 50)) {
						bußgeld = 200;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 51) && (geschwindigkeit <= 60)) {					
						punkte = 2; 
						fahrverbot = 2;
						
					} else if ((geschwindigkeit >= 60) && (geschwindigkeit <= 70)) {
						bußgeld = 480;
						punkte = 2;
						fahrverbot = 3;
						
						
					} else if (geschwindigkeit > 70) {
						bußgeld = 680;
						punkte = 2;
						fahrverbot = 3;
						
					}
					
				}
				
				if (ort.equals("Außerorts") || (ort.equals("außerorts") || (ort.equals("Auserorts") || (ort.equals("Auserorts"))))) {
					
					if ((geschwindigkeit > 0 ) && (geschwindigkeit <= 10)) {
						bußgeld = 10;
						
						
					} else if ((geschwindigkeit >= 11) && (geschwindigkeit <= 15)) {
						bußgeld = 20;
						 
					} else if ((geschwindigkeit >= 16) && (geschwindigkeit <= 20)) {
						bußgeld = 30;
						
					} else if ((geschwindigkeit >= 21) && (geschwindigkeit <= 25)) {
						bußgeld = 70;
						punkte = 1;
						
					} else if ((geschwindigkeit >= 26) && (geschwindigkeit <= 30)) {
						bußgeld = 80;
						punkte = 1;
						fahrverbot = 1; 
						
					} else if ((geschwindigkeit >= 31) && (geschwindigkeit <= 40)) {
						bußgeld = 120;
						punkte = 1;
						fahrverbot = 1; 
						
					} else if ((geschwindigkeit >= 41) && (geschwindigkeit <= 50)) {
						bußgeld = 160;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 51) && (geschwindigkeit <= 60)) {
						bußgeld = 240;
						punkte = 2;
						fahrverbot = 1;
						
					} else if ((geschwindigkeit >= 60) && (geschwindigkeit <= 70)) {
						bußgeld = 440;
						punkte = 2;
						fahrverbot = 2;
						
					} else if (geschwindigkeit > 70) {
						bußgeld = 600;
						punkte = 2;
						fahrverbot = 3;
						
					}
				}
				
				//Ausgaben
				if (punkte == 8) {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h überschritten. \n "
							+ "Sie müssen ein Bußgeld von: " + bußgeld + " € bezahlen, da Sie 8 Punkte haben wird Ihnen die Fahrerlaubnis entzogen");	
				} 
				
				if ((geschwindigkeit >= 21) && (geschwindigkeit <= 25)) {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h überschritten. \n "
							+ "Sie müssen ein Bußgeld von: " + bußgeld + " € bezahlen, zusätzlich erhalten Sie " + punkte + "Punkt");
				
				} 
				
				else if (geschwindigkeit >=26 ) {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h überschritten. \n "
							+ "Sie müssen ein Bußgeld von: " + bußgeld + " € bezahlen, zusätzlich erhalten Sie " + punkte + " Punkt und ein Fahrverbot von " 
							+ fahrverbot + " Monaten");
					
				} else {
					System.out.println("Sie haben, " + ort + " die Geschwindigkeit um, " + geschwindigkeit + " km/h überschritten. \n "
							+ "Sie müssen ein Bußgeld von: " + bußgeld + " € bezahlen");	
				}
				
			} catch (Exception X) {
				System.out.println("Fehler");
			}
	}
}
		
	

