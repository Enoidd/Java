package interfacce;

//import strumento.Strumento;

public class Musicista{
	/* Variabili di istanza */
	private String nome;
	
	/* Costruttore */
	public Musicista(String nome) {
		this.nome = nome;
	}
	
	/* Si da per scontato che la classe 'Strumento' contenga il metodo 'produciSuono'.
	 * 
	 * Quale è il corpo del metodo che verrà invocato?
	 * Il corpo del metodo che verrà invocato è quello del tipo dinamico (quello nel heap).
	 * (VEDI MAIN: TIPO STATICO/DINAMICO */
	public void suona(Strumento s) {
		s.produciSuono();
	}
	
}
