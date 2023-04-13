package edificio;

public class Palazzo implements Edificio{
	
	private int altezza;
	
	public Palazzo(int altezza) {
		this.altezza = altezza;
	}
	
	public int altezza() {
		return this.altezza;
	}
}
