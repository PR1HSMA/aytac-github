package uebung4;
import javax.swing.JOptionPane;

public class produkt {

	private double preisProdukt;
	private int anzahl;
	private String name;
	private boolean warenkorb; 
	
	public boolean isWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(boolean warenkorb) {
		this.warenkorb = warenkorb;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPreisProdukt() {
		return preisProdukt;
	}

	public void setPreisProdukt(double preisProdukt) {
		this.preisProdukt = preisProdukt;
	}

	public static double berechnePreisProdukt(produkt pProdukt) {
		double preis = pProdukt.getPreisProdukt() * pProdukt.getAnzahl();
		return preis;
	}
	
	public static double berechneSumme(produkt pProdukt1, produkt pProdukt2, produkt pProdukt3, produkt pProdukt4, produkt pProdukt5 ) {
		double summe = (pProdukt1.getAnzahl() * pProdukt1.getPreisProdukt()) + (pProdukt2.getAnzahl() * pProdukt2.getPreisProdukt()) 
						+ (pProdukt3.getAnzahl() * pProdukt3.getPreisProdukt()) + (pProdukt4.getAnzahl() * pProdukt4.getPreisProdukt()) 
						+ (pProdukt5.getAnzahl() * pProdukt5.getPreisProdukt());
		return summe;
	}

	public static void main(String[] args) {
		
		try {
		
			//Objekte anlegen
			produkt A01 = new produkt();
			produkt A02 = new produkt();
			produkt A03 = new produkt();
			produkt A04 = new produkt();
			produkt A05 = new produkt();
			
			//Objekte initialisieren
			A01.setName("Tastatur");
			A01.setPreisProdukt(20);
			
			A02.setName("Maus");
			A02.setPreisProdukt(10);
			
			A03.setName("Monitor");
			A03.setPreisProdukt(219);
			
			A04.setName("Laptop");
			A04.setPreisProdukt(499);
			
			A05.setName("WLAN-Router");
			A05.setPreisProdukt(39);
			
			JOptionPane.showMessageDialog(null, "Wilkommen in unserem Online-Shop");
			
			boolean einkauf = true;
			
			while (einkauf = true) {
				
				JOptionPane.showMessageDialog(null, "Wir haben folgende Artikel im Angebot: \n" + A01.getName() + " | " + A02.getName() + " | " + A03.getName() + " | " 
						+ A04.getName() + " | " + A05.getName());
				
				for ( int i = 0; i <= 5; i++) {
					
					String abfrage = JOptionPane.showInputDialog("Was wollen Sie Kaufen?" + " \n " + "Fertig um Einkauf zu beenden");
					
					if (abfrage.equals(A01.getName())) {
						A01.setAnzahl(Integer.parseInt(JOptionPane.showInputDialog("Wie viele Tastaturen möchten Sie erwerben?")));
						A01.setWarenkorb(true);
						
					} else {
						A01.setAnzahl(0);
						A01.setWarenkorb(false);
					}
					
					if (abfrage.equals(A02.getName())) {
						A02.setAnzahl(Integer.parseInt(JOptionPane.showInputDialog("wie viele Mäuse möchten Sie erwerben?")));
						A02.setWarenkorb(true);
						
					} else {
						A02.setAnzahl(0);
						A02.setWarenkorb(false);
					}
					
					if (abfrage.equals(A03.getName())) {
						A03.setAnzahl(Integer.parseInt(JOptionPane.showInputDialog("wie viele Monitore möchten Sie erwerben?")));
						A03.setWarenkorb(true);
				
					} else {
						A03.setAnzahl(0);
						A03.setWarenkorb(false);
					}
					
					if (abfrage.equals(A04.getName())) {
						A04.setAnzahl(Integer.parseInt(JOptionPane.showInputDialog("wie viele Laptops möchten Sie erwerben?")));
						A04.setWarenkorb(true);
				
					} else {
						A04.setAnzahl(0);
						A04.setWarenkorb(false);
					}
					
					if (abfrage.equals(A05.getName())) {
						A05.setAnzahl(Integer.parseInt(JOptionPane.showInputDialog("wie viele WLAN-Router möchten Sie erwerben?")));
						A05.setWarenkorb(true);
				
					} else {
						A05.setAnzahl(0);
						A05.setWarenkorb(false);
					}
					
					if (abfrage.equals("Fertig") || (abfrage.equals("fertig"))) {
						break;
						
					}
						
					
				}
				
				String abfrageFertig = JOptionPane.showInputDialog("Sind Sie fertig oder möchten Sie noch etwas ändern?"); 
					
					if (abfrageFertig.equals("Ja") || (abfrageFertig.equals("ja"))) {
						JOptionPane.showMessageDialog(null, "Sie haben ihren Einkauf abgeschlossen, Ihre Rechnung wird nun gedruckt");
						einkauf = false;
						break;
						
					} else if (abfrageFertig.equals("Nein") || (abfrageFertig.equals("nein"))) {
						einkauf = true;
						
					} else {
						JOptionPane.showMessageDialog(null, "Falsche Eingabe", "Error", JOptionPane.ERROR_MESSAGE);
					}
			}
			
			//Ausgabe
			System.out.println("--------------------------------------------");
			System.out.println("Quittung Ihres Einkaufes");
			System.out.println("--------------------------------------------");
			System.out.println("Anzahl " + " | " + " Produkt " + " | " + " Stückpreis " + "| " + " Preis ");
			System.out.println("--------------------------------------------");
			System.out.println(A01.getAnzahl() +  " | " + A01.getName() + " | " + A01.getPreisProdukt() + " € " + " | " + berechnePreisProdukt(A01) + " €"); 
			System.out.println(A02.getAnzahl() +  " | " + A02.getName() + " | " + A02.getPreisProdukt() + " € " + " | " + berechnePreisProdukt(A02) + " €");
			System.out.println(A03.getAnzahl() +  " | " + A03.getName() + " | " + A03.getPreisProdukt() + " € " + " | " + berechnePreisProdukt(A03) + " €");
			System.out.println(A04.getAnzahl() +  " | " + A04.getName() + " | " + A04.getPreisProdukt() + " € " + " | " + berechnePreisProdukt(A04) + " €");
			System.out.println(A05.getAnzahl() +  " | " + A05.getName() + " | " + A05.getPreisProdukt() + " € " + " | " + berechnePreisProdukt(A05) + " €");
			System.out.println("--------------------------------------------");
			System.out.println("Gesamtsumme: " + berechneSumme(A01, A02, A03, A04, A05) + " €");
			System.out.println("--------------------------------------------");
		
		} catch(Exception X) {
			System.out.println("Fehler!");
		}
	}

}
