package it.uniroma3.diadia;
import it.roma3.diadia.comandi.Comando;
import it.roma3.diadia.comandi.FabbricaDiComandi;
import it.roma3.diadia.comandi.FabbricaDiComandiFisarmonica;

/**
 * Classe principale di diadia, un semplice gioco di ruolo ambientato al dia.
 * Per giocare crea un'istanza di questa classe e invoca il metodo gioca
 *
 * Questa e' la classe principale crea e istanzia tutte le altre
 *
 * @author  docente di POO 
 *         (da un'idea di Michael Kolling and David J. Barnes) 
 *          
 * @version base
 */

public class DiaDia {
	
	static final private String MESSAGGIO_BENVENUTO = ""+
			"Ti trovi nell'Universita', ma oggi e' diversa dal solito...\n" +
			"Meglio andare al piu' presto in biblioteca a studiare. Ma dov'e'?\n"+
			"I locali sono popolati da strani personaggi, " +
			"alcuni amici, altri... chissa!\n"+
			"Ci sono attrezzi che potrebbero servirti nell'impresa:\n"+
			"puoi raccoglierli, usarli, posarli quando ti sembrano inutili\n" +
			"o regalarli se pensi che possano ringraziarti qualcuno.\n\n"+
			"Per conoscere le istruzioni usa il comando 'aiuto'.";
	
//	static final private String[] elencoComandi = {"vai", "aiuto", "fine", "prendi", "posa"};

	private Partita partita;
	private IOConsole console; // Senza down casting: private IO console;
	
	/* Costruttore */
	public DiaDia(IO io) {
		this.partita = new Partita(); // Creo una nuova partita
		this.console = (IOConsole) io; // <<<---- CHIEDI AL PROF 
	}

	/**
	 * Processa il comando: I/O
	 */
	public void gioca() {
		String istruzione; 
		//Scanner scannerDiLinee;

		//System.out.println(MESSAGGIO_BENVENUTO);
		console.mostraMessaggio(MESSAGGIO_BENVENUTO);
		//scannerDiLinee = new Scanner(System.in);	// da warning perché il metodo scanner andrebbe chiuso, si chiude in automatico quando il metodo finisce	
		do		
			/*istruzione = scannerDiLinee.nextLine();*/
			istruzione = console.leggiRiga();
		while (!processaIstruzione(istruzione));
	}   


	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire;
		FabbricaDiComandi factory = new FabbricaDiComandiFisarmonica();
		
		comandoDaEseguire = factory.costruisciComando(istruzione, this.console);
		comandoDaEseguire.esegui(this.partita);
		
		if(this.partita.vinta())
			System.out.println("Hai vinto!");
		if(!this.partita.giocatoreIsVivo())
			System.out.println("Hai esaurito i CFU...");
		return this.partita.isFinita();
	}

	// implementazioni dei comandi dell'utente:

	/**
	 * Stampa informazioni di aiuto.
	 */
//	private void aiuto() {
//		for(int i=0; i< elencoComandi.length; i++) 
//			//System.out.println(elencoComandi[i]+" ");
//			console.mostraMessaggio(elencoComandi[i] + " ");
//		/*System.out.println();*/
//		console.mostraMessaggio("");
//	}
	
	/**
	 * Comando "Prendi".
	 */
//	private void prendi(String nomeAttrezzo) {
//		Attrezzo attrezzoInStanza = this.partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo);
//		this.partita.getGiocatore().getBorsa().addAttrezzo(attrezzoInStanza);
//		console.mostraMessaggio(this.partita.getGiocatore().getBorsa().toString());
//		this.partita.getLabirinto().getStanzaCorrente().removeAttrezzo(attrezzoInStanza);
//		//System.out.println("Rimosso da stanza");
//	}
	
	/**
	 * Comando "Posa".
	 */
//	private void posa(String nomeAttrezzo) {
//		Attrezzo attrezzoInBorsa = this.partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
//		this.partita.getLabirinto().getStanzaCorrente().addAttrezzo(attrezzoInBorsa);
//		this.partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
//	}
	
	/**
	 * Comando "Fine".
	 */
//	private void fine() {
//		/*System.out.println("Grazie di aver giocato!");  // si desidera smettere */
//		console.mostraMessaggio("Grazie per aver giocato!");
//	}

	public static void main(String[] argc) {
		IO io = new IOConsole();
		DiaDia gioco = new DiaDia(io);
		gioco.gioca();
	}
}