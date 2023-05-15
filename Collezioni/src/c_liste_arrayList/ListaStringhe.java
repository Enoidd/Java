package c_liste_arrayList;

import java.util.LinkedList;
import java.util.List;
import java.util.Iterator;

public class ListaStringhe {

	public static void main(String[] args) {
		List<String> lista_stringhe = new LinkedList<String>();

		lista_stringhe.add("Prima stringa");
		lista_stringhe.add("Seconda stringa");
		lista_stringhe.add("Terza stringa");
		lista_stringhe.add("Quarta stringa");

		// CICLO FOR
		System.out.println("\nCICLO FOR");
		for(int i=0; i<lista_stringhe.size(); i++) {
			System.out.println(lista_stringhe.get(i));
		}

		// FOR EACH
		System.out.println("\nFOR EACH");
		for(String stringhe: lista_stringhe) {
			System.out.println(stringhe);
		}
		
		// ITERATOR
		System.out.println("\nITERATOR");
		Iterator<String> iteratore_di_stringhe = lista_stringhe.iterator();
		while(iteratore_di_stringhe.hasNext()) {
			System.out.println(iteratore_di_stringhe.next());
		}
	}
}
