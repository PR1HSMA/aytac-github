
public class Produkt {
	private int preis;
	private String name; 
	private int anzahl;
	private int sumProdukt;
	
	
	public Produkt(int preis, String name, int anzahl) {
		super();
		this.preis = preis;
		this.name = name;
		this.anzahl = anzahl;
	}
	
	
	
	public int getPreis() {
		return preis;
	}



	public void setPreis(int preis) {
		this.preis = preis;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAnzahl() {
		return anzahl;
	}



	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}



	public int getSumProdukt() {
		return sumProdukt;
	}



	public void setSumProdukt(int sumProdukt) {
		this.sumProdukt = sumProdukt;
	}



	public void berrechnePreis() {
		this.setSumProdukt(this.getAnzahl() * this.getPreis());
	}
	
	public String quittung() {
		
		return this.getName() + " " + this.getAnzahl() + " " 
		+ this.getPreis() + " " + this.getSumProdukt();
		
		
	}
}
