package Aufgabe6;

public class Aufgabe6 {

	public static void main(String[] args) {
		Aufgabe6 a1 = new Aufgabe6();
		int[] zahlen = {25,5,10,8};
		System.out.println(a1.ziehVomErstenAb(zahlen));
	}
	
	public int ziehVomErstenAb(int[] pZahlen) {
		try{
		boolean test = true;
		int abziehen = 1;
		while(test == true) {		
			pZahlen[0] = pZahlen[0] - pZahlen[abziehen];
			abziehen++;
			if (abziehen==pZahlen.length) {
				test = false;
				}
		}
		return pZahlen[0];
		}
		catch(Exception x) {
			return 999;
		}
	}
	

}
