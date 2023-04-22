package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.giocatore.Giocatore;


/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	//static final private int CFU_INIZIALI = 20;
	private Labirinto NuovoLabirinto;
	private Giocatore NuovoGiocatore;
	//private Stanza stanzaCorrente;
	//private Stanza stanzaVincente;
	private boolean finita;
	//private int cfu;
	
	public Partita(){
		this.NuovoLabirinto = new Labirinto();
		this.NuovoGiocatore = new Giocatore();
		NuovoLabirinto.creaStanze();
		this.finita = false;
		//this.cfu = CFU_INIZIALI;
	}

    /**
     * Crea tutte le stanze e le porte di collegamento
     */
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.NuovoLabirinto.getStanzaCorrente() == this.NuovoLabirinto.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		return finita || vinta() || (this.NuovoGiocatore.getCfu() == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}
	
	/**
	 * Il giocatore della partita
	 * @return NuovoGiocatore, è il giocatore della partita
	 */
	public Giocatore getGiocatore() {
		return this.NuovoGiocatore;
	}
	
	/**
	 * Setta il giocatore della partita
	 * @param NuovoGiocatore, imposta il giocatore
	 */
	public void setGiocatore(Giocatore NuovoGiocatore) {
		this.NuovoGiocatore = NuovoGiocatore;
	}

	/**
	 * La partita
	 * @return NuovoLabirinto
	 */
	public Labirinto getLabirinto() {
		return this.NuovoLabirinto;
	}
	
	/**
	 * Setta il labirinto 
	 * @param NuovoLabirinto, imposta il labirinto
	 */
	public void setLabirinto(Labirinto NuovoLabirinto) {
		this.NuovoLabirinto = NuovoLabirinto;
	}
	
	/**
	 * La partita conosce giocatore,
	 * DiaDia chiede alla partita di far sapere se il giocatore è vivo o meno, 
	 * la partita chiede questa informazione al giocatore che in base ai CFU scopre se è vivo o meno
	 * @return
	 */
	public boolean giocatoreIsVivo() {
		// TODO Auto-generated method stub
		return this.getGiocatore().isVivo();
	}
	
	
}
