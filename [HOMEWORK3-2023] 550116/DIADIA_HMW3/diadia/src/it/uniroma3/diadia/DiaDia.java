package it.uniroma3.diadia;



import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.LabirintoBuilder;
import it.uniroma3.diadia.comandi.Comando;
import it.uniroma3.diadia.comandi.FabbricaDiComandiFisarmonica;

/**
 * Classe principale di diadia, un semplice gioco di ruolo ambientato al dia.
 * Per giocare crea un'istanza di questa classe e invoca il letodo gioca
 *
 * Questa e' la classe principale crea e istanzia tutte le altre
 *
 * @author  docente di POO & 548019 & 547388
 *         (da un'idea di Michael Kolling and David J. Barnes) 
 *          
 * @version base
 */

public class DiaDia {

	static final public String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ingraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";

	private Partita partita;
	private IO io;

	public DiaDia(IO console, Labirinto labirinto) {
		this.io = console;
		this.partita = new Partita(labirinto);
	}

	public void gioca() {
		String istruzione; 
		//		Scanner scannerDiLinee;
		io.mostraMessaggio(MESSAGGIO_BENVENUTO);
		do {
			istruzione = io.leggiRiga();

		}while (!processaIstruzione(istruzione) );

	}   

	/**System.in
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire;
		FabbricaDiComandiFisarmonica factory = new FabbricaDiComandiFisarmonica(this.io);
		comandoDaEseguire = factory.costruisciComando(istruzione);
		comandoDaEseguire.esegui(this.partita);
		if (this.partita.vinta())
			io.mostraMessaggio("Hai vinto!");
		if (!this.partita.giocatoreIsVivo())
			io.mostraMessaggio("Hai esaurito i CFU...");
		return this.partita.isFinita();
	}
	//	private boolean processaIstruzione(String istruzione) {
	//		Comando comandoDaEseguire = new Comando(istruzione);
	//		if(comandoDaEseguire.getNome()==null) {
	//			io.mostraMessaggio("Non hai inserito alcun comando!");
	//			return false;
	//		}
	//		else if (comandoDaEseguire.getNome().equals("fine")) {
	//			this.fine(); 
	//			return true;
	//		} 
	//		else if (comandoDaEseguire.getNome().equals("prendi"))
	//			this.prendi(comandoDaEseguire.getParametro());
	//		else if (comandoDaEseguire.getNome().equals("posa"))
	//			this.posa(comandoDaEseguire.getParametro());
	//		else if (comandoDaEseguire.getNome().equals("vai"))
	//			this.vai(comandoDaEseguire.getParametro());
	//		else if (comandoDaEseguire.getNome().equals("aiuto"))
	//			this.aiuto();
	//		else
	//			io.mostraMessaggio("Comando sconosciuto");
	//		if (this.partita.vinta()) {
	//			io.mostraMessaggio("Hai vinto!");
	//			return true;
	//		} else
	//			return false;
	//	}   

	// implementazioni dei comandi dell'utente:

	/**
	 * Stampa informazioni di aiuto.
	 */
	//	private void aiuto() {
	//		for(int i=0; i< elencoComandi.length; i++) 
	//			io.mostraMessaggio(elencoComandi[i]+" ");
	//		io.mostraMessaggio("");
	//	}

	/**
	 * Cerca di andare in una direzione. Se c'e' una stanza ci entra 
	 * e ne stampa il nome, altrimenti stampa un messaggio di errore
	 */
	//	private void vai(String direzione) {
	//		if(direzione==null)
	//			io.mostraMessaggio("Dove vuoi andare ?");
	//		Stanza prossimaStanza = null;
	//		prossimaStanza = this.partita.getLabirinto().getStanzaCorrente().getStanzaAdiacente(direzione);
	//		if (prossimaStanza == null)
	//			io.mostraMessaggio("Direzione inesistente");
	//		else {
	//			this.partita.getLabirinto().setStanzaCorrente(prossimaStanza);
	//			int cfu = this.partita.getGiocatore().getCfu();
	//			this.partita.getGiocatore().setCfu(cfu--);
	//		}
	//		io.mostraMessaggio("Stanza corrente:");
	//		io.mostraMessaggio(partita.getLabirinto().getStanzaCorrente().getDescrizione());
	//		io.mostraMessaggio("Borsa:");
	//		io.mostraMessaggio(partita.getGiocatore().getBorsa().toString());
	//
	//	}

	//	private void prendi(String nomeAttrezzo) {
	//		Attrezzo a = this.partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo);
	//		this.partita.getGiocatore().getBorsa().addAttrezzo(a);
	//		this.partita.getLabirinto().getStanzaCorrente().removeAttrezzo(a);
	//	}

	//	private void posa(String nomeAttrezzo) {
	//		Attrezzo a = this.partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
	//		
	//		this.partita.getLabirinto().getStanzaCorrente().addAttrezzo(a);
	//		this.partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
	//	}
	/**
	 * Comando "Fine".
	 */
	//	private void fine() {
	//		io.mostraMessaggio("Grazie di aver giocato!");  // si desidera smettere
	//	}

	public static void main(String[] argc) {
		IO console = new IOConsole();
		Labirinto labirinto = new LabirintoBuilder()
										.addStanzaIniziale("Atrio")
										.addAttrezzo("martello", 3)
										.addStanzaVincente("Biblioteca")
										.addAdiacenza("Atrio", "Biblioteca", "nord")
										.getLabirinto();
		DiaDia gioco = new DiaDia(console, labirinto);
		gioco.gioca();
	}

}