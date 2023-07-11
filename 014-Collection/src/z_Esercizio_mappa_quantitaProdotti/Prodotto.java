package z_Esercizio_mappa_quantitaProdotti;


public class Prodotto {

	private String codice;
	private int peso;
	
	public Prodotto(String codice, int peso) {
		this.codice = codice;
		this.peso = peso;
	}
	
	public String getCodice() {
		return codice;
	}
	
	public int getPeso() {
		return peso;
	}
	
	@Override
	public int hashCode() {
		return this.codice.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		Prodotto that = (Prodotto) o;
		return this.getCodice().equals(that.getCodice());
	}
}