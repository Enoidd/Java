package z_Esercizio_di_ordinamento_comparable_comparator;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Aula {
	
	private Set<Studente> studenti;
	
	public Aula() {
		/*
		 * DOMANDA 1: 
		 * produrre una soluzione considerando che è possibile modificare la classe Studente
		 */
		this.studenti = new HashSet<>();
		/*
		 * DOMANDA 2:
		 * produrre una soluzione considerando che NON è possibile modificare la classe Studente, 
		 * ma è possibile definire altre classi.
		 */
		this.studenti = new TreeSet<>(new ComparatorePerNome());
	}
	
	/*
	 * DOMANDA 1: 
	 * produrre una soluzione considerando che è possibile modificare la classe Studente
	 */
	public boolean addStudente(Studente studente) {
		
		return this.studenti.add(studente);	
	}
	
	
	
	
}
