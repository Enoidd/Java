package g_HashMap_hashCode_Equals;

public class Persona {

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
	public String toString() {
		return "Persona [nome_"+nome+", "+eta+"]"+"\n";
	}
	
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		return this.getNome().equals(p.getNome()) && 
				this.getEta()==p.getEta();
	}
	
	@Override
	public int hashCode() {
		return this.getNome().hashCode() +  this.getEta()*31;
	}
}
