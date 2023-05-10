package it.uniroma3.diadia.giocatore;
import it.uniroma3.diadia.attrezzi.Attrezzo;


public class Borsa {
	public final static int DEFAULT_PESO_MAX_BORSA = 10;
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	private int pesoMax;

	/**
	 * Crea una borsa 
	 * @param no-args
	 */
	public Borsa() {
		this(DEFAULT_PESO_MAX_BORSA);
	}

	/**
	 * Crea una borsa
	 * @param pesoMax che identifica il peso massimo che la borsa può contenere
	 */
	public Borsa(int pesoMax) {
		this.pesoMax = pesoMax;
		this.attrezzi = new Attrezzo[10]; // speriamo bastino...
		this.numeroAttrezzi = 0;
	}

	/**
	 * Metodo che aggiunge un attrezzo nella borsa, fintanto che c'è spazio in 
	 * termini di peso.
	 * @param attrezzo che viene inserito nella borsa
	 * @return true / false se l'attrezzo è stato inserito
	 */
	public boolean addAttrezzo(Attrezzo attrezzo) {
		if (this.getPeso() + attrezzo.getPeso() > this.getPesoMax())
			return false;
		if (this.numeroAttrezzi==10)
			return false;
		this.attrezzi[this.numeroAttrezzi] = attrezzo;
		this.numeroAttrezzi++;
		return true;
	}

	/**
	 * Metodo che restituisce il peso massimo della borsa
	 * @return pesoMax 
	 */
	public int getPesoMax() {
		return pesoMax;
	}

	/**
	 * Metodo che restituisce il nome dell'attrezzo cercato nella borsa
	 * se questo esiste
	 * @param nomeAttrezzo da cercare nella borsa
	 * @return a, l'attrezzo trovato nella borsa, null altrimenti
	 */
	public Attrezzo getAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if(this.attrezzi[i]!=null)
				if (this.attrezzi[i].getNome().equals(nomeAttrezzo))
					a = attrezzi[i];
		return a;
	}

	/**
	 * Metodo che restituisce il peso corrente della borsa
	 * @return peso
	 */
	public int getPeso() {
		int peso = 0;
		for (int i= 0; i<this.numeroAttrezzi; i++)
			if(this.attrezzi[i]!=null)
				peso += this.attrezzi[i].getPeso();
		return peso;
	}
	
	/**
	 * Metodo che verifica in base al peso se l'attrezzo è troppo grande per essere contenuto
	 * nella borsa
	 * @return true / false
	 */
	public boolean verificaPesoBorsa(Attrezzo attrezzo) {
		// Se l'attrezzo non è null
		if(attrezzo!=null)
			// Se il peso dell'attrezzo che si vuole inserire nella borsa
			// supera la capienza max (il peso max) della borsa
			if(attrezzo.getPeso() + this.getPeso() >= this.getPesoMax())
				return false;
		return true;
	}
	
	/**
	 * Metodo che controlla se la borsa è vuota
	 * @return true / false 
	 */
	public boolean isEmpty() {
		return this.numeroAttrezzi == 0;
	}
	
	/**
	 * Metodo che cerca se un attrezzo è nella borsa
	 * @param nomeAttrezzo attrezzo che si ricerca
	 * @return true / false se esiste in borsa
	 */
	public boolean hasAttrezzo(String nomeAttrezzo) {
		return this.getAttrezzo(nomeAttrezzo)!=null;
	}
	
	/**
	 * Metodo che rimuove l'attrezzo inserito per nome dalla borsa
	 * @param nomeAttrezzo
	 * @return a l'attrezzo rimosso,null altrimenti
	 */
	public Attrezzo removeAttrezzo(String nomeAttrezzo) {
		Attrezzo a = null;
		for(int i=0; i<numeroAttrezzi; i++) {
			if(this.attrezzi[i]!=null) {
				if(this.attrezzi[i].getNome().equals(nomeAttrezzo))
					a = attrezzi[i];
					//this.attrezzi[i]=null;
			}
		}
		return a;
	}
	
	/**
	 * Metodo che mostra la descrizione dell'attrezzo 
	 */
	public String toString() {
		StringBuilder s = new StringBuilder();
		if (!this.isEmpty()) {
			s.append("Contenuto borsa ("+this.getPeso()+"kg/"+this.getPesoMax()+"kg): ");
			for (int i= 0; i<this.numeroAttrezzi; i++)
				s.append(attrezzi[i].toString()+" ");
		}
		else
			s.append("Borsa vuota");
		return s.toString();
	}
}

