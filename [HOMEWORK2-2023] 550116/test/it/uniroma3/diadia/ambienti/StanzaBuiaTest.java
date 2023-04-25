package it.uniroma3.diadia.ambienti;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaBuiaTest {

	private StanzaBuia stanzaBuia;
	private Attrezzo torcia;
	
	@Before
	public void setUp() {
		stanzaBuia = new StanzaBuia("stanzaBuia", "torcia");
		torcia = new Attrezzo("torcia", 8);
	}
	
	@Test
	public void testStanzaBuiaVuota() {
		assertEquals("Qui c'e' un buio pesto!!", stanzaBuia.getDescrizione());
	}
	
	@Test
	public void testStanzaBuiaAttrezzo() {
		stanzaBuia.addAttrezzo(torcia);
		assertEquals(stanzaBuia.toString(), stanzaBuia.getDescrizione());
	}

}
