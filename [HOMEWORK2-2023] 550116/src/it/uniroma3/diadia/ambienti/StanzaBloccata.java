package it.uniroma3.diadia.ambienti;

public class StanzaBloccata extends Stanza {
	// Variabili di istanza
	private String nomeDirezioneBloccata;
	private String nomeAttrezzoSbloccaDirezione;
	
	// Costruttore
	public StanzaBloccata(String nome, String nomeDirezioneBloccata, String nomeAttrezzoSbloccoDirezione) {
		super(nome);
		this.nomeDirezioneBloccata = nomeDirezioneBloccata;
		this.nomeAttrezzoSbloccaDirezione = nomeAttrezzoSbloccoDirezione;
	}
	
	@Override
	public Stanza getStanzaAdiacente(String dir) {
		// Se la direzione della stanza adiacente è una direzione bloccata
		if(nomeDirezioneBloccata.equals(dir))
			// Se nella stanza corrente non c'è l'attrezzo per sbloccare la stanza
			if(!this.hasAttrezzo(nomeAttrezzoSbloccaDirezione))
				return this;	// ritorna il riferimento alla stanza corrente (in cui ti trovi)
		return super.getStanzaAdiacente(dir);	// ritorna la stanza corrispondente all'uscita specificata
	}
	
	@Override
	public String getDescrizione() {
		
		String stanzaCorrente;
		stanzaCorrente = "Direzione bloccata: " + nomeDirezioneBloccata + ". Attrezzo per sbloccare stanza: " + nomeAttrezzoSbloccaDirezione;
		
		//Se l'attrezzo non esiste nella stanza
		if(!this.hasAttrezzo(nomeAttrezzoSbloccaDirezione))
			return stanzaCorrente;	// Ritorna la stanza corrente
		// Altrimenti
		return super.getDescrizione();	// Altrimenti ritorna la descrizione della stanza sbloccata
	}
}
