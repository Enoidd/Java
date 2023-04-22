package it.uniroma3.diadia.ambienti;

public class StanzaBuia extends Stanza {
	// Variabili di istanza
	private String lanternaAttrezzo;
	
	public StanzaBuia(String nomeAttrezzo, String lanternaAttrezzo) {
		super(nomeAttrezzo);
		this.lanternaAttrezzo = lanternaAttrezzo;
	}
	
	@Override
	public String getDescrizione() {
		
		String ambiente = new String("Qui c'e' un buio pesto!!");
		// Se l'attrezzo non è un attrezzo che emette luce
		if(!this.hasAttrezzo(lanternaAttrezzo))
			return ambiente;	// ritorna la stringa che c'è buio
		// Altrimenti c'è l'attrezzo e quindi ritorna la descrizione della stanza con stanzeAdiacenti e attrezzi contenuti
		return super.getDescrizione();
	}
}
