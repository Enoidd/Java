
public class Giocatore {
	static final private int CFU_INIZIALI = 20;	// il giocatore ha dei CFU
	/* Variabili di istanza */
	private int cfu;
	private Borsa borsa;
	
	/* Costruttore */
	public Giocatore() {
		this.cfu = CFU_INIZIALI;
		this.borsa = new Borsa();	// il giocatore ha una borsa
	}
	
	public int getCfu() {
		return this.cfu;
	}

	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}
	
	public Borsa getBorsa() {
		return this.borsa;
	}
	
	public void setBorsa(Borsa AttrezzoBorsa) {
		this.borsa = AttrezzoBorsa;
	}
}
