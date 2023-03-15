package mainStanze;

public class Stanza {
	/* Variabili di istanza */
	private String nomeStanza;
	private Stanza stanzaAdiacente;
	private Attrezzo attrezzoContenuto;
	
	/* Metodi */
	public void setNomeStanza(String nome) {
		nomeStanza = nome;
	}
	
	public void setStanzaAdiacente(Stanza adiacente) {
		stanzaAdiacente = adiacente;
	}
	
	public void setAttrezzoContenuto(Attrezzo nomeAttrezzo) {
		attrezzoContenuto = nomeAttrezzo;
	}
	
	public String getNomeStanza() {
		return nomeStanza;
	}
	
	public Stanza getStanzaAdiacente() {
		return stanzaAdiacente;
	}
	
	public Attrezzo getAttrezzoContenuto() {
		return attrezzoContenuto;
	}
	
}
