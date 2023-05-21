package e_insimi_esercizio_HashSet_persona;

public class Persona{

	private String nome;
	private int eta;
	
	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode() + this.eta;
	}
	
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		return this.getNome().equals(p.getNome()) && this.getEta()==p.getEta();
	}
	
}
