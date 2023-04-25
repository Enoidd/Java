package it.roma3.diadia.comandi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.IOConsole;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Labirinto;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;
import it.uniroma3.diadia.giocatore.Giocatore;

public class ComandoPosaTest {

	private Partita partita;
	private Labirinto labirinto;
	private Stanza stanza;
	private Attrezzo a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11;
	private IO io;
	private Comando comando;
	private Borsa borsa;
	private Giocatore giocatore;
	
	@Before
	public void setUp() {
		partita = new Partita();
		labirinto = new Labirinto();
		giocatore = new Giocatore();
		stanza = new Stanza("Atrio");
		borsa = new Borsa();
		partita.setGiocatore(giocatore);	// imposta nella partita il giocatore
		partita.setLabirinto(labirinto);	// imposta il labirinto
		partita.getLabirinto().creaStanze();	// crea le stanze del labirinto
		
		// Per la funzione di test 
		partita.getLabirinto().setStanzaCorrente(stanza); // imposta la stanza corrente che è l'Atrio
		partita.getGiocatore().setBorsa(borsa);	// imposta la borsa
		// Crea gli attrezzi
		a1 = new Attrezzo("a1", 1);
		a2 = new Attrezzo("a2", 1);
		a3 = new Attrezzo("a3", 1);
		a4 = new Attrezzo("a4", 1);
		a5 = new Attrezzo("a5", 1);
		a6 = new Attrezzo("a6", 1);
		a7 = new Attrezzo("a7", 1);
		a8 = new Attrezzo("a8", 1);
		a9 = new Attrezzo("a9", 1);
		a10 = new Attrezzo("a10", 1);
		a11 = new Attrezzo("a11", 1);
		
		// Per tutte le funzioni di test
		comando = new ComandoPosa();	// Comando è una sotto classe del comando che posa
		io = new IOConsole();	// per eseguire i comandi
		comando.setIO(io);
	}
	
	@Test
	public void testAddAttrezzoInStanza() {
		// Aggiungi attrezzo in borsa
		partita.getGiocatore().getBorsa().addAttrezzo(a1);
		comando.setParametro("a1");
		comando.esegui(partita);
		assertTrue(partita.getLabirinto().getStanzaCorrente().hasAttrezzo("a1"));
	}
	
	@Test
	public void testAddAttrezzoStanzaPiena() {
		partita.getGiocatore().getBorsa().addAttrezzo(a1);
		partita.getGiocatore().getBorsa().addAttrezzo(a2);
		partita.getGiocatore().getBorsa().addAttrezzo(a3);
		partita.getGiocatore().getBorsa().addAttrezzo(a4);
		partita.getGiocatore().getBorsa().addAttrezzo(a5);
		partita.getGiocatore().getBorsa().addAttrezzo(a6);
		partita.getGiocatore().getBorsa().addAttrezzo(a7);
		partita.getGiocatore().getBorsa().addAttrezzo(a8);
		partita.getGiocatore().getBorsa().addAttrezzo(a9);
		partita.getGiocatore().getBorsa().addAttrezzo(a10);
		comando.setParametro("a11");
		comando.esegui(partita);
		assertFalse(partita.getLabirinto().getStanzaCorrente().hasAttrezzo("a11"));	// l'attrezzo non è stato aggiunto
	}

}
