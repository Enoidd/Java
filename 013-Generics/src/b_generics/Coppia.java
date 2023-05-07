package b_generics;

/*
 * Il tipo 'T' viene valutato in base al parametro (attuale) che gli viene passato.
 * 
 * 
 * Quale è l'idea?
 * 
 * L'idea è che se io voglio creare più coppie di oggetti, quali ad esempio una coppia di 'Persone' o una coppia di 'Attrezzi'
 * o una coppia di 'Animali' etc. posso farlo sfruttando il concetto dei generics.
 * 
 * In sostanza il generics crea una coppia di oggetti di qualsiasi tipo.
 */
public class Coppia<T> {
	
	private T primo;
	private T secondo;
	
	public Coppia() {
	}
	
	public Coppia(T primo, T secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	public T getPrimo() {
		return this.primo;
	}
	
	public T getSecondo() {
		return this.secondo;
	}
	
	// Per avere coppie mutabili
	public void setPrimo(T primo) {
		this.primo = primo;
	}
	
	public void setSecondo(T secondo) {
		this.secondo = secondo;
	}
}
