package e_generics_con_un_tipo_Emetodi_generici;

import d_wildcard.Persona;

//'Studente' è sotto-tipo di 'Persona'
public class Studente extends Persona{

	private String nome;

	public Studente(String nome) {
		super(nome);
	}

	public String getNome() {
		return this.nome;
	}
}
