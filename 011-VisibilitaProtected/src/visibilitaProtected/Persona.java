package visibilitaProtected;

// Persona è classe base (Superclasse) di Studente - Non conosce studente
public class Persona {
	// Variabili di istanza
	private String nome;
	private String cognome;
	// Costruttore
	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Persona(String nome) {
		this.nome = nome;
	}
	
	// Metodi
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
}
