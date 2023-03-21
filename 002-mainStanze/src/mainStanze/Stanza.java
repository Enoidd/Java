package mainStanze;

public class Stanza {
	
	/* Variabili di istanza */
	private String nomeStanza;
	private Stanza stanzaAdiacente;
	//private Attrezzo attrezzoContenuto;
	private Attrezzo[] attrezzi;
	private int numeroAttrezzi;
	
	/* Costruttore */
	public Stanza() {
		this.nomeStanza = nomeStanza;
		this.stanzaAdiacente = stanzaAdiacente;
		attrezzi = new Attrezzo[10];
		this.numeroAttrezzi = 0;
	}
	
	/* Metodi */
	public void setNomeStanza(String nome) {
		this.nomeStanza = nome;
	}
	
	public void setStanzaAdiacente(Stanza adiacente) {
		stanzaAdiacente = adiacente;
	}
	
	public void setAttrezzoContenuto(Attrezzo nomeAttrezzo) {
		
		if(numeroAttrezzi < 10) {
			this.attrezzi[this.numeroAttrezzi] = nomeAttrezzo;
			numeroAttrezzi++;
		}
	}
	
	public String getNomeStanza() {
		return nomeStanza;
	}
	
	public Stanza getStanzaAdiacente() {
		return stanzaAdiacente;
	}
	
	public Attrezzo getAttrezzoContenuto(String nomeAttrezzo) {
		
		for(int i=0; i<numeroAttrezzi; i++) {
			if(attrezzi[i].getNome().equals(nomeAttrezzo)) {
				return attrezzi[i];
			}
		}
		return null;
	}
	
	/* Metodo che aggiunge un attrezzo */
	public boolean addAttrezzo(Attrezzo nomeAttrezzo) {
		if(numeroAttrezzi < 10) {
			this.attrezzi[numeroAttrezzi] = nomeAttrezzo;
			this.numeroAttrezzi++;
			return true;
		}
		else
			return false;
	}
	
	/* Metodo che controlla che nella stanza ci sia un attrezzo di nome 'nomeAttrezzo' */
	public boolean hasAttrezzo(String nomeAttrezzo) {
		boolean trovato = false;	// attrezzo non trovato
		for(int i=0; i<numeroAttrezzi; i++) {
			if(attrezzi[i].getNome().equals(nomeAttrezzo)) {
				trovato = true;
			}
		}
		return trovato;
	}
	
	public String listaAttrezzi() {
		String stringa = null;
		for(int i=0; i<numeroAttrezzi; i++) {
			if(attrezzi[i]!=null) {
				stringa = attrezzi[i].toString();
			}
		}
		return stringa;
	}

	public String toString() {
		return "Stanza " + this.getNomeStanza() + ". " + this.listaAttrezzi();
	}
}
