package interfacce;

//import strumento.Strumento;

public class Musicista {
	/* Variabili di istanza */
	private String nome;
	
	/* Costruttore */
	public Musicista(String nome) {
		this.nome = nome;
	}
	
	/* Si da per scontato che la classe 'Strumento' contenga il metodo 'produciSuono' */
	public void suona(Strumento s) {
		s.produciSuono();
	}
	
	/* Per definire nuovi tipi, è possibile utilizzare il costrutto 'interface', meccanismo attraverso il quale si possono 
	 * definire nuovi tipi. Per definire un nuovo tipo si deve specificare un insieme di metodi; cioè specifica un tipo in termini 
	 * di servizi che può offrire, ma non i dettagli implementativi.
	 */
	public interface Strumento {
		public void produciSuono();
	}
}
