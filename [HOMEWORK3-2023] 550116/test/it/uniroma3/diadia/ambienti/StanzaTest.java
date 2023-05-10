package it.uniroma3.diadia.ambienti;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

public class StanzaTest {
	/* Stato iniziale pronto */
	Labirinto labirinto;
	Stanza stanza_1;
	Stanza stanza_2;
	
	@Before
	public void setUp() {
		labirinto = new Labirinto();
		stanza_1 = new Stanza("stanza1");
		stanza_2 = new Stanza("Biblioteca");
		labirinto.creaStanze();
	}

	@Test
	public void testGetStanzaVincente() {
		assertEquals("Biblioteca", labirinto.getStanzaVincente().getNome());
	}
	
	@Test
	public void testGetStanzaCorrente() {
		labirinto.setStanzaCorrente(stanza_1);	// imposta la stanza corrente
		assertEquals(stanza_1.getNome(), labirinto.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testGetStanzaAdiacente() {
		stanza_1.impostaStanzaAdiacente("est", stanza_2);	// imposta la stanza adiacente
		assertEquals(stanza_2, stanza_1.getStanzaAdiacente("est"));
	}
	

}
