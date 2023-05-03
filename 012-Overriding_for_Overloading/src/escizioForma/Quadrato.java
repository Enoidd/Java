package escizioForma;

public class Quadrato implements Forma{
	// Variabili di istanza
	private int lato;
	
	// Costruttore
	public Quadrato(int l) {
		this.lato = l;
	}
	
	// Metodi
	public int getLato() {
		return this.lato;
	}

	// 2)
	@Override
	public float accetta(Calcolatore c) {
		// Il tipo statico di 'this' è quello della classe corrente, qui Quadrato
		return c.calcola(this);	// Chiamata sovraccarica utilizzando un tipo statico 'Quadrato'
		// che viene fatto coincidere con il tipo dinamico
		// perché stiamo eseguendo il corpo di un metodo che è nella classe 'Quadrato'.
	}
}
