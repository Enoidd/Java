package z_Esercizio_di_ordinamento_comparable_comparator;

public class Studente implements Comparable<Studente>{
	
	private String nome;
	
	public Studente(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	/*
	 * DOMANDA 1: 
	 * produrre una soluzione considerando che è possibile modificare la classe Studente
	 */
	@Override
	public boolean equals(Object o) {
		Studente s = (Studente) o;
		return this.nome.equals(s.getNome());
	}
	
	@Override
	public int hashCode() {
		
		return this.getNome().hashCode();
	}
	
	/*
	 * DOMANDA 3: 
	 *  come la domanda 1, ma l'insieme degli studenti deve essere ordinato e 
	 *  non è possibile introdurre altre classi
	 */
	@Override
	public int compareTo(Studente s) {
		
		return this.getNome().compareTo(s.getNome());
	}
}
