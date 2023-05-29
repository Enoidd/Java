package e_generics_con_piu_tipi_Emetodi_generici;

//'Persona' è super-tipo di 'Studente' (ma non conosce 'Studente')
public class Persona {

	private String nome;

	public Persona(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
}
