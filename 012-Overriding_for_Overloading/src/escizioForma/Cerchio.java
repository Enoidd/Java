package escizioForma;

public class Cerchio implements Forma {
	// Variabili di istanza
	private int raggio;
	
	// Costruttore
	public Cerchio(int r) {
		this.raggio = r;
	}
	
	// Metodi
	public int getRaggio() {
		return this.raggio;
	}

	
	// 2)
	@Override
	public float accetta(Calcolatore c) {
		// Il tipo statico di 'this' è quello della classe corrente, qui Cerchio
		return c.calcola(this);
	}
}
