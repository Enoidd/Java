package c_classi_wrapper;

// N si usa per i tipi numerici con le classi wrapper
public class Coppia<N> {
	
	private N primo;
	private N secondo;
	
	public Coppia() {
	}
	
	public Coppia(N primo, N secondo) {
		this.primo = primo;
		this.secondo = secondo;
	}
	
	public N getPrimo() {
		return this.primo;
	}
	
	public N getSecondo() {
		return this.secondo;
	}
	
	// Per avere coppie mutabili
	public void setPrimo(N primo) {
		this.primo = primo;
	}
	
	public void setSecondo(N secondo) {
		this.secondo = secondo;
	}
}
