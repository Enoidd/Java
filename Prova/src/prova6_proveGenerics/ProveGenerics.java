package prova6_proveGenerics;
import java.util.*;
public class ProveGenerics {

	public static void main(String[] argv) {
		  List<Libro> biblioteca = new LinkedList<Libro>();
		  
	 	  Libro l1  = new Libro("Anna Karenina");
	 	  Libro l2 = new Libro("I demoni");
		  Libro l3 = new Libro("Madame Bovary");
		  biblioteca.add(l1);
	  	  biblioteca.add(l2);
	  	  biblioteca.add(l3);

		  Iterator<Libro> it = biblioteca.iterator();
		  while (it.hasNext())
			System.out.println(it.next().getTitolo());
	   }

}
