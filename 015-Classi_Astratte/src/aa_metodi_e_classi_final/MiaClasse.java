package aa_metodi_e_classi_final;

/*
 * Una classe 'final' è una classe che non può essere estesa.
 * 
 */

public final class MiaClasse {

	private String nome;
	
	public MiaClasse(String nome) {
		this.nome = nome;
	}
	
	/* Un metodo final è un metodo che non può essere sovrascitto dalle classi derivate.
	 * 
	 */
	public final String getNome() {
		return this.nome;
	}
}
