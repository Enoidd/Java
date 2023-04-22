package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

public class LabirintoTest {
	
	Labirinto labirintoTest;
	Stanza stanzaVincente;
	Stanza stanzaAtrio;

	@Before
	public void setUp() {
		labirintoTest = new Labirinto();
		stanzaVincente = new Stanza("Biblioteca");
		stanzaAtrio = new Stanza("Atrio");
		labirintoTest.creaStanze();
		labirintoTest.setStanzaCorrente(stanzaAtrio);
		
	}
	
	@Test
	public void testSetStanzaCorrente() {
		labirintoTest.setStanzaCorrente(stanzaAtrio);
		assertEquals(stanzaAtrio.getNome(), labirintoTest.getStanzaCorrente().getNome());
	}
	
	@Test
	public void testGetStanzaCorrente() {
		assertEquals(stanzaAtrio, labirintoTest.getStanzaCorrente());
	}
	
	@Test
	public void testGetStanzaVincente() {
		assertEquals(stanzaVincente.getNome(), labirintoTest.getStanzaVincente().getNome());
	}

}
