package d_wildcard;



// 'Studente' è sotto-tipo di 'Persona'
public class Studente extends Persona{

	private String nome;

	public Studente(String nome) {
		super(nome);
	}

	public String getNome() {
		return this.nome;
	}
}
