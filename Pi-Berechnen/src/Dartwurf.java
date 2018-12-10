import java.text.DecimalFormat;

public class Dartwurf {
	static DecimalFormat d01 = new DecimalFormat("0.00");

	public static double xKoordinate() {
		double rueckgabeXwert = 0.0;
		double zufallKoordinate = 0.0;
		zufallKoordinate = ((Math.random() * 1));
		//rueckgabeXwert = Math.round(zufallKoordinate * 100.0) / 100.0;
		return zufallKoordinate;
	}
	
	public static double yKoordinate() {
		double rueckgabeYwert = 0.0;
		double zufallKoordinate = 0.0;
		zufallKoordinate = ((Math.random()*1));
		//rueckgabeYwert = Math.round(zufallKoordinate*100.0)/100.0;
		return zufallKoordinate;
	}
	
	
	public static boolean prüfe(double x, double y) {
		if (x*x + y*y <=1) {
			return true;
		}
		
		return false;
		
    }
	public static void piRechnen(double anzahl, double treffer) {
		double PI = 0.0;
		PI = (treffer/anzahl)*4;
		System.out.println(PI);
		
	}

		
		
		
		
	}
	

