package domanda_2;

/*
 * Completare il costruttore della classe Soldato -> COMPLETATO
 */

public class Soldato extends Persona{

	private String grado;

	public Soldato(String nome, String cognome, String grado) {
		//completare
		super(nome, cognome);
		this.grado = grado;
	}

	public String getGrado() {
		return this.grado;
	}
}