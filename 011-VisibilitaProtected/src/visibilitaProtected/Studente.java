package visibilitaProtected;

// Studente è classe estesa (sottoclasse) di Persona - conosce Persona
public class Studente extends Persona {
	
	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente(String nome, String cognome, String matricola) {
		super(nome, cognome);
		this.matricola = matricola;
	}
	
	// Metodi
	public String getNome() {
		return this.nome;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	
}
