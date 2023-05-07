package d_wildcard;

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
	
	/*
	 * Metodo che copia nella coppia corrente gli elementi di un'altra coppia che viene passata come parametro.
	 * 
	 * Es. Posso copiare dentro una coppia di 'Persona' una coppia di 'Studente' perché 'Studente' è sotto-tipo di 'Persona'
	 */
	public void copyAll(Coppia<? extends T> coppia) {
		// Il parametro formale va istanziato su una coppia il cui tipo attuale deve essere T o un suo sotto-tipo
		// Definita anche come upper-Bounded -> l'upper bound è T
		this.setPrimo(coppia.getPrimo());
		this.setSecondo(coppia.getSecondo());
	}
}
