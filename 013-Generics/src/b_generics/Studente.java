package b_generics;

/*
 * Caso in cui la classe 'Studente' è classe estesa della classe 'Persona'.
 * 
 * 'Studente' è sotto-tipo di 'Persona'.
 * 
 */
public class Studente extends Persona{

	private String nome;

	public Studente(String nome) {
		super(nome);
	}

	public String getNome() {
		return this.nome;
	}
}
