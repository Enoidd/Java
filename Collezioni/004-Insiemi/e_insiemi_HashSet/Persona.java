package e_insiemi_HashSet;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta){
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	/*
	 * L'interface 'Set<E>' che estende 'Collection<E>' offre tutti e soli i metodi della interface 'Collection<E>'
	 * con il fatto che non ammette DUPLICATI.
	 * 
	 * Il Criterio di equivalenza per non ammettere duplicati è dato da:
	 * 
	 * HashSet<E>:
	 * 
	 * Richiede due metodi: public boolean equals(Object o) & public int hashCode();
	 * 
	 */
	
	@Override
	public int hashCode() {
//		return this.getEta() + this.getNome().hashCode() + this.getCognome().hashCode();
		return this.eta + this.getNome().hashCode() + this.getCognome().hashCode();	// equivalente a quello sopra
	}
	
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		// Su tipi primitivi si utilizza '=='
		return this.getEta() == p.getEta() && 
				this.getNome().equals(p.getNome()) &&
				this.getCognome().equals(p.getCognome());	
	}
}
