package forme;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Before;

public class CerchioTest {
	
	private Punto origine;
	private Cerchio unitario;


	@Before
	public void setUP() {
		this.origine = new Punto(0, 0);
		this.unitario = new Cerchio(origine, 1);
	}

	@Test
	public void testTrasla_asseX() { 
		unitario.trasla(+1, 0);
		assertEquals(1, unitario.getCentro().getX());
		assertEquals(0, unitario.getCentro().getY());
	}
	
	@Test
	public void testTrasla_asseY() { 
		unitario.trasla(0, 1);
		assertEquals(0, unitario.getCentro().getX());
		assertEquals(1, unitario.getCentro().getY());
	}
	

}
