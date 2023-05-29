package e_generics_con_piu_tipi_Emetodi_generici;

/*
 * Abbiamo una coppia di 'Studenti' / 'Persone'
 * 
 */

/*
 * La classe generica in questo caso prende due tipi diversi: P (persona) e S (studente)
 */
public class Coppia<P, S> {
	
	private P primo;
	private S secondo;
	
	public Coppia() {
	}
	
	public Coppia(P primo, S secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	public P getPrimo() {
		return this.primo;
	}
	
	public S getSecondo() {
		return this.secondo;
	}
	
	// Per avere coppie mutabili
	public void setPrimo(P primo) {
		this.primo = primo;
	}
	
	public void setSecondo(S secondo) {
		this.secondo = secondo;
	}
	
	/*
	 * Metodo che copia nella coppia corrente gli elementi di un'altra coppia che viene passata come parametro.
	 * 
	 * Es. Posso copiare dentro una coppia di 'Persona' una coppia di 'Studente' perché 'Studente' è sotto-tipo di 'Persona'
	 */
	public void copyAll(Coppia<? extends P,S> coppia) {
		// Il parametro formale va istanziato su una coppia il cui tipo attuale deve essere T o un suo sotto-tipo
		// Definita anche come upper-Bounded -> l'upper bound è T
		this.setPrimo(coppia.getPrimo());
		this.setSecondo(coppia.getSecondo());
	}
}