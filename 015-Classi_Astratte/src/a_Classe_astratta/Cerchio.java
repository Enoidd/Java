package a_Classe_astratta;


/*
 * Classe DERIVATA che estende la classe astratta 'Figura' nella quale fornisce un implementazione
 * concreta del metodo 'calcolaArea'.
 */
public class Cerchio extends Figura{

	private double raggio;
	
	public Cerchio(String colore, double raggio) {
		super(colore);
		this.raggio = raggio;
	}

	@Override
	public double calcolaArea() {
		return Math.PI*raggio*raggio;
	}

}
