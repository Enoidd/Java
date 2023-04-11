package strumento;

public class Strumento {
	/* Variabili di istanza */
	private String nome;
	
	/* Costruttore */
	public Strumento(String nome) {
		this.nome = nome;
	}
	
	public void produciSuono() {
		System.out.println("***melodia***");
	}
	
	/* Per definire nuovi tipi, è possibile utilizzare il costrutto 'interface', meccanismo attraverso il quale si possono 
	 * definire nuovi tipi. Per definire un nuovo tipo si deve specificare un insieme di metodi; cioè specifica un tipo in termini 
	 * di servizi che può offrire, ma non i dettagli implementativi.
	 */
	
}
