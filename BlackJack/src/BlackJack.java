import javax.swing.JOptionPane;

public class BlackJack {

	public static void main(String[] args) {
		weiterSpielen();
	}
	public static int karteZiehen() {
		int rueckgabePunkt = 0;
		int karteZahl = (int) (Math.random()*13)+1;
		for (int i = 1; i <= 13; i++) {
			switch(karteZahl) {
			case 1: rueckgabePunkt=11;break;
			case 10: rueckgabePunkt=10;break;
			case 10|11|12: rueckgabePunkt=10;break;
			default:rueckgabePunkt = i;break;
			}
			if (karteZahl == i) {
				return rueckgabePunkt;
			}
			}
		return 999;
	}
	
	public static void weiterSpielen() {
		
		JOptionPane.showMessageDialog(null, "Willkommen im BlackJack Simulator");
		JOptionPane.showMessageDialog(null, "Zieh nun deine Erste Karte");
		boolean weiter = false;
		int punktestand = 0;
		String entscheidung = "";
		while(weiter == false){
			int kartenwert = karteZiehen();
			punktestand = punktestand + kartenwert;
			System.out.println("Du hast eine Karte mit dem Wert von " + kartenwert + " gezogen " +
			"und hast nun " + punktestand + " Punkte");
			entscheidung = JOptionPane.showInputDialog("Willst du weiter spielen? ");
			if (entscheidung.equalsIgnoreCase("nein")) {
				weiter = true;
			}
		}
		System.out.println("Du Hast " + punktestand + " Punkte erreicht" );
	}
}
