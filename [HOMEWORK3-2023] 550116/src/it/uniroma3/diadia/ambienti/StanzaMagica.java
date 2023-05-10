package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagica extends Stanza {
	// Variabili di istanza
	final static private int SOGLIA_MAGICA_DEFAULT = 3;
	private int contatoreAttrezziPosati;
	private int sogliaMagica;
	
	// Costruttori
	public StanzaMagica(String nome) {	// prende solo il nome
		this(nome, SOGLIA_MAGICA_DEFAULT);
	}
	
	public StanzaMagica(String nome, int soglia) {
		super(nome);	// Richiama il costruttore di Stanza
		this.contatoreAttrezziPosati = 0;
		this.sogliaMagica = soglia;
	}
	
	/**
	 * Metodo che aggiunge un attrezzo nella StanzaMagica
	 */
	@Override
	public boolean addAttrezzo(Attrezzo attrezzo) {
		
		this.contatoreAttrezziPosati++;
		if(this.contatoreAttrezziPosati > this.sogliaMagica)
			attrezzo = this.modificaAttrezzo(attrezzo);
		
		return super.addAttrezzo(attrezzo);
	}
	
	/**
	 * Metodo che modifica il nome dell'attrezzo.
	 * @param attrezzo
	 * @return nome dell'attrezzo invertito
	 */
	private Attrezzo modificaAttrezzo(Attrezzo attrezzo) {
		
		StringBuilder nomeInvertito;
		int pesoX2 = attrezzo.getPeso()*2;
		nomeInvertito = new StringBuilder(attrezzo.getNome());
		nomeInvertito = nomeInvertito.reverse();	// metodo 'reverse' che inverte il nome dell'attrezzo
		attrezzo = new Attrezzo(nomeInvertito.toString(), pesoX2);
		
		return attrezzo;
	}
}
