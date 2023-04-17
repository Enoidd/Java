package forme;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class GruppoDiFormeTest {

	private GruppoDiForme vuoto;

	private GruppoDiForme gruppoCerchioUnitario;

	private GruppoDiForme gruppoEsterno;
	private Punto origine;
	private Cerchio unitario;

	@Before
	public void setUP() {
		this.origine = new Punto(0, 0);
		this.unitario = new Cerchio(origine, 1);
		this.vuoto = new GruppoDiForme();
		this.gruppoEsterno = new GruppoDiForme();
		this.gruppoCerchioUnitario = new GruppoDiForme();
		this.gruppoCerchioUnitario.aggiungiForma(this.unitario);
	}
	@Test
	public void testGruppoDiForme() {
		final GruppoDiForme nidificato = new GruppoDiForme();
		assertEquals(0, this.vuoto.getNumeroDiForme());
		this.vuoto.aggiungiForma(nidificato);
		assertEquals(1, this.vuoto.getNumeroDiForme()); // il mio gruppo vuoto ha un numero di forme pari a 1
	}

	@Test
	public void testTraslaDiUnGruppoDiGruppoConSoloCerchioUnitario() {
		// Creo un gruppo, inserisco un solo cerchio unitario
		// Creo un gruppo con dentro solo il gruppo di cui sopra
		assertTrue(this.gruppoEsterno.aggiungiForma(this.gruppoCerchioUnitario));

		// asserisco la posizione del centro del cerchio (è sull'origine)
		assertEquals(0, this.unitario.getCentro().getX());
		assertEquals(0, this.unitario.getCentro().getY());

		// traslo il gruppo esterno (che contiene il gruppo con il solo cerchio unitario)
		this.gruppoEsterno.trasla(+1, +1);

		// asserisco che il cerchio risulta spostato
		assertEquals(1, this.unitario.getCentro().getX());
		assertEquals(1, this.unitario.getCentro().getY());

	}

}
