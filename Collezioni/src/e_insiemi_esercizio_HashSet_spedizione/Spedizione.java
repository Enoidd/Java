package e_insiemi_esercizio_HashSet_spedizione;


public class Spedizione {
	
	private String destinazione;
	private int codice;
	
	public Spedizione(String destinazione, int codice) {
		this.destinazione = destinazione;
		this.codice = codice;
	}
	
	public String getDestinazione() {
		return this.destinazione;
	}
	
	public int getCodice() {
		return this.codice;
	}
	
	public int hashcode() {
		return this.getDestinazione().hashCode() + this.getCodice()*31 ;
	}
	
	@Override
	public boolean equals(Object o) {
		Spedizione s = (Spedizione) o;
		return this.getDestinazione().equals(s.getDestinazione()) &&
				this.getCodice() == s.getCodice();
	}
}
