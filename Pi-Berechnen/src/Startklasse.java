import java.util.ArrayList;

public class Startklasse {

	public static void main(String[] args) {
		ArrayList<Double> wuerfeX = new ArrayList<Double>();
		ArrayList<Double> wuerfeY = new ArrayList<Double>();
		Dartwurf d01 = new Dartwurf();
		int zaehlen = 0;
		for (int i = 0; i < 100; i++) {
			wuerfeX.add(Dartwurf.xKoordinate());
			wuerfeY.add(Dartwurf.yKoordinate());
		}
//		for (int i = 0; i < wuerfeX.size(); i++) {
//			System.out.println("Wurf " + (i+1) + " :");
//			System.out.println("X-Koordinate: " + wuerfeX.get(i) + " Y-Koordinate: " + wuerfeY.get(i)) ;
//			System.out.println("------------------------------------");
//		}
		
		for (int i = 0; i < wuerfeX.size() ; i++) {
			if (Dartwurf.prüfe(wuerfeX.get(i), wuerfeY.get(i)) == true) {
				zaehlen++;
			}
		}
		System.out.println(zaehlen);
		Dartwurf.piRechnen(wuerfeX.size(), zaehlen);
		
	}

}
