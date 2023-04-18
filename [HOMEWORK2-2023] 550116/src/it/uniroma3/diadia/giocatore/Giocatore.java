package it.uniroma3.diadia.giocatore;

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
	
	/**
	 * Metodo per i cfu correnti del giocatore
	 * @return cfu del giocatore
	 */
	public int getCfu() {
		return this.cfu;
	}

	/**
	 * Metodo che imposta i cfu del giocatore
	 * @param cfu
	 */
	public void setCfu(int cfu) {
		this.cfu = cfu;		
	}
	
	/**
	 * Metodo per la borsa corrente
	 * @return borsa
	 */
	public Borsa getBorsa() {
		return this.borsa;
	}
	
	/**
	 * Metodo che imposta la borsa 
	 * @param AttrezzoBorsa
	 */
	public void setBorsa(Borsa AttrezzoBorsa) {
		this.borsa = AttrezzoBorsa;
	}
}
