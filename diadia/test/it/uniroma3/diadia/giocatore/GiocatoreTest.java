package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;

import org.junit.Test;

public class GiocatoreTest {

	Giocatore testGiocatore = new Giocatore();
	
	@Test
	public void testGetCfu() {
		assertEquals(10, testGiocatore.getCfu());
	}

	public void testSetCfu() {
		testGiocatore.setCfu(10);
		assertEquals(10, testGiocatore.getCfu());
	}
	
	public void testGetBorsa() {
		assertNotNull(testGiocatore.getBorsa());
	}
}
