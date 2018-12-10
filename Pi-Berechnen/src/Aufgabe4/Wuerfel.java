package Aufgabe4;

import java.util.ArrayList;

public class Wuerfel {

 public static ArrayList<Integer>wuerfelbecherErstellen (){
	 ArrayList<Integer> wuerfel = new ArrayList<Integer>();
	 for (int i = 0; i < 5; i++) {
		int zahl = (int)((Math.random()*6)+1);
		wuerfel.add(zahl);
	}
	 return wuerfel;
 }
 
 public static String prüfe(ArrayList<Integer> pListe){
	 int z1 = 0, z2 = 0, z3 = 0, z4 = 0, z5 = 0, z6 = 0;
	 
	 
	 for (int i = 0; i < pListe.size(); i++) {
		switch(pListe.get(i)) {
		case 1: z1++; break;
		case 2: z2++; break;
		case 3: z3++; break;
		case 4: z4++; break; 
		case 5: z5++; break;
		case 6: z6++; break;
		}
	}
	 String rueckgabe = "Die Zahl 1 kommt " + z1 + " mal vor \nDie Zahl 2 kommt " + z2 + " mal vor\n"
	 		+ "Die Zahl 3 kommt " + z3 + " mal vor \nDie Zahl 4 kommt " + z4 + " mal vor \nDie Zahl 5 "
	 				+ "kommt " + z5 + " mal vor \nDie Zahl 6 kommt " + z6 +" mal vor";	 
	 return rueckgabe;
 }
	
}
