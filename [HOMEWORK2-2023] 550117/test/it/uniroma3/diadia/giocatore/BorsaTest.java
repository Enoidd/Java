package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class BorsaTest {
	/* Stato iniziale */
	Borsa borsa;
	Attrezzo attrezzo;
	Attrezzo attrezzo1;
	
	@Before
	public void setUp() {
		borsa = new Borsa();
		attrezzo = new Attrezzo("ascia", 10);
		attrezzo1 = null;
	}
	
	@Test
	public void setAttrezzoInBorsa() {
		this.borsa.addAttrezzo(attrezzo);
	}
	
	@Test
	public void testAddAttrezzoNotNull() {
		assertNotNull(this.borsa.addAttrezzo(attrezzo));
	}
	
	@Test
	public void testIsEmpty() {
		borsa.addAttrezzo(attrezzo);
		assertFalse(this.borsa.isEmpty());
	}

	
}
