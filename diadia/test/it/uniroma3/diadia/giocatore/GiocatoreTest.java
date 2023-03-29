package it.uniroma3.diadia.giocatore;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNull;


import org.junit.Test;

public class GiocatoreTest {

	Giocatore testGiocatore = new Giocatore();
	
	@Test
	public void testGetCfu() {
		assertEquals(10, testGiocatore.getCfu());
	}

	@Test
	public void testSetCfu() {
		testGiocatore.setCfu(10);
		assertEquals(10, testGiocatore.getCfu());
	}
	
	@Test
	public void testGetBorsaNotNull() {
		assertNotNull(testGiocatore.getBorsa());
	}
	
} 
