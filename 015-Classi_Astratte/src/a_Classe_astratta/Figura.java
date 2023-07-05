package a_Classe_astratta;

/*
 * Classe Astratta che rappresenta una figura geometrica. Questa classe ha il campo 'colore'
 * e dichiara due metodi: 'calcolaArea' e 'descrivi'.
 *
 */

public abstract class Figura {
	
	protected String colore;
	
	public Figura(String colore) {
		this.colore = colore;
	}
	
	// Indica che la classe 'derivata' da 'Figura' dovrà fornire l'implementazione concreta
	// di questo metodo.
	public abstract double calcolaArea();
	
	public void descrivi() {
		System.out.println("Sono una figura di colore "+colore);
	}
	
	/* 
	 * Una classe astratta è una classe che non può essere istanziata direttamente, ma può essere
	 * utilizzata come superclasse per altre classi derivate. Una classe astratta fornisce un 
	 * implementazione parziale o completa di alcuni metodi, ma non definisce completamente 
	 * l'implementazione di tutti i suoi metodi. 
	 * 
	 */
}
