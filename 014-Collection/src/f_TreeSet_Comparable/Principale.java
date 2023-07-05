package f_TreeSet_Comparable;

import java.util.*;

/*
 * E' implementato utilizzando un albero rosso-nero, che mantiene gli elementi ordinati
 * in base al loro valore. Gli elementi sono inseriti nell'albero in modo tale da rispettare
 * l'ordinamento naturale degli elementi. 
 * 
 * Sfrutta:
 * 	- Comparable: compareTo
 * 	- Comparator: compare(T var, T var)
 *
 */

public class Principale {

	public static void main(String[] args) {
		
		Set<Persona> tree_set = new TreeSet<>();
		
		tree_set.add(new Persona("Giorgia", "Frassa", 21));
		tree_set.add(new Persona("Luana", "Laudani", 22));
		tree_set.add(new Persona("Carmine", "Gira", 23));
		tree_set.add(new Persona("Carmine", "Gira", 23));	// Non ammette duplicati per l'ordinamento creato
		
		System.out.println("NON ORDINATO:");
		for(Persona it : tree_set) {
			System.out.println(it);
		}
		
		System.out.println("=====\n");
		Set<String> myTree = new TreeSet<>();
		
		myTree.add(new String("Zebra"));
		myTree.add(new String("Albero"));
		myTree.add(new String("Fauna"));
		
		System.out.println(" "+myTree);	// Lo stampa già ordinato.
	}

}
