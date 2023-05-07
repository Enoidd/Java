package d_wildcard;

// 'Persona' è super-tipo di 'Studente' (ma non conosce 'Studente')
public class Persona {
	
	private String nome;
	
	public Persona(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
}
