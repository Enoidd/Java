package forme;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;


public class RettangoloTest {

	private Punto origine;
	private Rettangolo rettangolo;
	
	@Before 
	public void setUP() {
		this.origine = new Punto(0, 0);
		this.rettangolo = new Rettangolo(origine, 1, 0);
	}
	
	@Test
	public void testSposta_asseX() {
		rettangolo.trasla(+1, 0);
		assertEquals(1, rettangolo.getVertice().getX());
		assertEquals(0, rettangolo.getVertice().getY());
	}
	
	@Test
	public void testSposta_asseY() {
		rettangolo.trasla(0, 1);
		assertEquals(0, rettangolo.getVertice().getX());
		assertEquals(1, rettangolo.getVertice().getY());
	}
}
