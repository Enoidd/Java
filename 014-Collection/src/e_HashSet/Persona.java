package e_HashSet;

public class Persona {
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
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
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + ", " + this.eta; 
	}
	
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		
		return this.getNome().equals(p.getNome()) && 
				this.getCognome().equals(p.getCognome()) &&
				this.getEta()==p.getEta();
	}
	
	@Override
	public int hashCode() {
		
		return this.getNome().hashCode() +
				this.getCognome().hashCode() +
				this.getEta();
	}
}
