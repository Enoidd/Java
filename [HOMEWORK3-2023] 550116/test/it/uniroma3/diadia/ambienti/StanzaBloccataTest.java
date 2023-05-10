package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBloccataTest {

	private Stanza stanza;
	private StanzaBloccata stanzaBloccata;
	private Attrezzo attrezzoSbloccaStanza;
	
	@Before
	public void setUp() {
		stanza = new Stanza("stanza1");
		stanzaBloccata = new StanzaBloccata("stanzaBloccata", "sud", "chiave");
		attrezzoSbloccaStanza = new Attrezzo("chiave", 8);
		stanzaBloccata.impostaStanzaAdiacente("sud", stanza);
	}
	
	@Test
	public void testGetStanzaAdiacenteDirBloccata() {
		assertEquals(stanzaBloccata, stanzaBloccata.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testGetStanzaAdiacenteDirSbloccata() {
		stanzaBloccata.addAttrezzo(attrezzoSbloccaStanza);	// per sbloccare la stanza 
		assertEquals(stanza, stanzaBloccata.getStanzaAdiacente("sud"));
	}
	
	@Test
	public void testGetDescrizioneDirBloccata() {
		assertEquals("Direzione bloccata: sud. Attrezzo per sbloccare stanza: chiave", stanzaBloccata.getDescrizione());
	}
	
	@Test
	public void testGetDescrizioneDirSbloccata() {
		stanzaBloccata.addAttrezzo(attrezzoSbloccaStanza);
		assertEquals(stanzaBloccata.toString(), stanzaBloccata.getDescrizione());
	}
}
