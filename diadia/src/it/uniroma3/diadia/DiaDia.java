package it.uniroma3.diadia;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.IOConsole.IOConsole;

import java.util.Scanner;

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
	
	static final private String[] elencoComandi = {"vai", "aiuto", "fine", "prendi", "posa"};

	private Partita partita;
	private IOConsole IoConsole;
	
	public DiaDia() {
		this.partita = new Partita(); // Creo una nuova partita
		this.IoConsole = new IOConsole();
	}

	public void gioca() {
		String istruzione; 
		Scanner scannerDiLinee;

		System.out.println(MESSAGGIO_BENVENUTO);
		scannerDiLinee = new Scanner(System.in);	// da warning perché il metodo scanner andrebbe chiuso, si chiude in automatico quando il metodo finisce	
		do		
			istruzione = scannerDiLinee.nextLine();
		while (!processaIstruzione(istruzione));
	}   


	/**
	 * Processa una istruzione 
	 *
	 * @return true se l'istruzione e' eseguita e il gioco continua, false altrimenti
	 */
	private boolean processaIstruzione(String istruzione) {
		Comando comandoDaEseguire = new Comando(istruzione);

		if (comandoDaEseguire.getNome().equals("fine")) {	// Se il comando da eseguire è "fine"
			this.fine(); 
			return true;
		} else if (comandoDaEseguire.getNome().equals("vai"))	// Se il comando è "vai"
			this.vai(comandoDaEseguire.getParametro());
		else if (comandoDaEseguire.getNome().equals("aiuto"))	// Se il comando è "aiuto"
			this.aiuto();
		else if (comandoDaEseguire.getNome().equals("prendi"))
			this.prendi(comandoDaEseguire.getParametro());
		else if (comandoDaEseguire.getNome().equals("posa"))
			this.posa(comandoDaEseguire.getParametro());
		
		else
			System.out.println("Comando sconosciuto");
		if (this.partita.vinta()) {
			System.out.println("Hai vinto!");
			return true;
		} else
			return false;
	}   

	// implementazioni dei comandi dell'utente:

	/**
	 * Stampa informazioni di aiuto.
	 */
	private void aiuto() {
		for(int i=0; i< elencoComandi.length; i++) 
			System.out.print(elencoComandi[i]+" ");
		System.out.println();
	}

	/**
	 * Cerca di andare in una direzione. Se c'e' una stanza ci entra 
	 * e ne stampa il nome, altrimenti stampa un messaggio di errore
	 */
	private void vai(String direzione) {
		if(direzione==null)
			/*System.out.println("Dove vuoi andare ?");*/
			IoConsole.mostraMessaggio("Dove vuoi andare?");
		Stanza prossimaStanza = null;
		//prossimaStanza = this.partita.getStanzaCorrente().getStanzaAdiacente(direzione);
		prossimaStanza = this.partita.getLabirinto().getStanzaCorrente().getStanzaAdiacente(direzione);
		if (prossimaStanza == null)
			/*System.out.println("Direzione inesistente");*/
			IoConsole.mostraMessaggio("Direzione inesistente");
		else {
			//this.partita.setStanzaCorrente(prossimaStanza);
			this.partita.getLabirinto().setStanzaCorrente(prossimaStanza);
			//int cfu = this.partita.getCfu();
			int cfu = this.partita.getGiocatore().getCfu();
			//this.partita.setCfu(cfu--);
			this.partita.getGiocatore().setCfu(cfu--);
		}
		//System.out.println(partita.getStanzaCorrente().getDescrizione());
		//System.out.println(partita.getLabirinto().getStanzaCorrente().getDescrizione());
		IoConsole.
	}
	
	/**
	 * Comando "Prendi".
	 */
	private void prendi(String nomeAttrezzo) {
		Attrezzo attrezzoInStanza = this.partita.getLabirinto().getStanzaCorrente().getAttrezzo(nomeAttrezzo);
		this.partita.getGiocatore().getBorsa().addAttrezzo(attrezzoInStanza);
		this.partita.getLabirinto().getStanzaCorrente().removeAttrezzo(attrezzoInStanza);
	}
	
	/**
	 * Comando "Posa".
	 */
	private void posa(String nomeAttrezzo) {
		Attrezzo attrezzoInBorsa = this.partita.getGiocatore().getBorsa().getAttrezzo(nomeAttrezzo);
		this.partita.getLabirinto().getStanzaCorrente().addAttrezzo(attrezzoInBorsa);
		this.partita.getGiocatore().getBorsa().removeAttrezzo(nomeAttrezzo);
	}
	
	/**
	 * Comando "Fine".
	 */
	private void fine() {
		System.out.println("Grazie di aver giocato!");  // si desidera smettere
	}

	public static void main(String[] argc) {
		DiaDia gioco = new DiaDia();
		gioco.gioca();
	}
}