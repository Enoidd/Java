package e_HashSet;

import java.util.*;

/*
 * Gli HashSet è implementato utilizzando una tabella hash, che non garantisce un ordine
 * specifico degli elementi. Gli elementi sono organizzati internamente utilizzando una
 * funzione hash, il che significa che l'ordine può variare.
 * 
 * NON AMMETTONO DOPPIONI --> Sfrutta HashCode e Equals(Object o)
 */

public class Principale {

	public static void main(String[] args) {
		
		Set<Persona> hash_set = new HashSet<>();
		
		hash_set.add(new Persona("Giorgia", "Frassa", 21));
		hash_set.add(new Persona("Luana", "Laudani", 22));
		hash_set.add(new Persona("Carmine", "Gira", 23));
		hash_set.add(new Persona("Carmine", "Gira", 23));	// Non ammette doppioni
		
		for(Persona it : hash_set) {
			System.out.println(it.toString() + " ");
		}
	}

}
