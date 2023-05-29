package e_generics_con_piu_tipi_Emetodi_generici;

import d_wildcard.Persona;

//'Studente' è sotto-tipo di 'Persona'
public class Studente extends Persona{

	private String nome;

	public Studente(String nome) {
		super(nome);
		this.nome = nome;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
}