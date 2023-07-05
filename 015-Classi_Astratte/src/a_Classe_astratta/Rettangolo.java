package a_Classe_astratta;

/*
 * Classe DERIVATA che estende la classe astratta 'Figura' nella quale fornisce un implementazione
 * concreta del metodo 'calcolaArea'.
 */
public class Rettangolo extends Figura{

	private double lunghezza;
	private double larghezza;
	
	public Rettangolo(String colore, double lunghezza, double larghezza) {
		super(colore);
		this.lunghezza = lunghezza;
		this.larghezza = larghezza;
	}

	@Override
	public double calcolaArea() {
		return lunghezza * larghezza;
	}

}
