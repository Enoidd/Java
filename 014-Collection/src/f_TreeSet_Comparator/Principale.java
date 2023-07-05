package f_TreeSet_Comparator;

import java.util.Set;
import java.util.TreeSet;

public class Principale {

	public static void main(String[] args) {
		
		ComparatorePerCognome cmp = new ComparatorePerCognome();
		Set<Persona> tree_set = new TreeSet<>(cmp);

		tree_set.add(new Persona("Giorgia", "Frassa", 23));
		tree_set.add(new Persona("Armando", "Zaudani", 22));
		tree_set.add(new Persona("Carmine", "Gira", 21));
		tree_set.add(new Persona("Carmine", "Gira", 23));	// DOPPIONI NON AMMESSI

		/* ORDINATO IN BASE AL NOME */
		
		System.out.println("========ORDINATO IN BASE AL NOME:");
		for(Persona it : tree_set) {
			System.out.println(it);
		}
		
	}

}
