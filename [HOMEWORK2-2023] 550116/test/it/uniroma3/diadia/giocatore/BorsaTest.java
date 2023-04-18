package it.uniroma3.diadia.giocatore;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BorsaTest {
	/* Stato iniziale */
	Borsa borsaTest = new Borsa();
	Attrezzo attrezzoTest = new Attrezzo("ascia", 10);
	
	@Before
	public void setAttrezzoInBorsa() {
		this.borsaTest.addAttrezzo(attrezzoTest);
	}
	
	@Test
	public void testAddAttrezzoNotNull() {
		assertNotNull(this.borsaTest.addAttrezzo(attrezzoTest));
	}
	
	@Test
	public void testIsEmpty() {
		assertFalse(this.borsaTest.isEmpty());
	}
	
	@Test
	public void testHasAttrezzo() {
		assertFalse(this.borsaTest.hasAttrezzo("bastone"));
	}
	
}
