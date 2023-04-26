package edificio;

/* Edificio è l'interfaccia, che pone a 0 l'altezza */
public class Palazzo implements Edificio{
	
	private int altezza;
	
	public Palazzo(int altezza) {
		this.altezza = altezza;
	}
	
	public int altezza() {
		return this.altezza;
	}
}
