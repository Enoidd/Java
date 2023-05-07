package c_classi_wrapper;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCoppia {

	@Test
	public void testCheCompila() {
		
		Coppia<Integer> coppiaInteri;	// Creo una coppia di 'Interi'
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(200);
		
		coppiaInteri = new Coppia<Integer>(i1, i2);	
		
		assertSame(i1, coppiaInteri.getPrimo());
		assertSame(i2, coppiaInteri.getSecondo());
		
		/*
		 * Classi WRAPPER
		 */
		int i3 = 18;
		int i4 = 20;
		
		Coppia<Integer> coppiaInteri34;	// Creo una coppia di 'Interi' per le variabili 'int' 3 e 4
		
//		coppiaInteri34 = new Coppia<Integer>(i3, i4);	// Questo lavoro non posso farlo
		
		// Il valore della variabile 'int' è avvolto in un oggetto 'Integer'
		Integer iwrap3 = new Integer(i3);
		Integer iwrap4 = new Integer(i4); 
		
		coppiaInteri34 = new Coppia<Integer>(iwrap3, iwrap4);	
		
		assertSame(i3, coppiaInteri34.getPrimo());
		assertSame(i4, coppiaInteri34.getSecondo());
		
		// Coppie mutabili
		Coppia<Integer> c;
		
		c = new Coppia<Integer>();
		
		int i = 4;
		
		c.setPrimo(new Integer(i));
		c.setSecondo(new Integer(5));
		
	}

}
