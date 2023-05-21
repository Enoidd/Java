package c_liste_arrayList;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_numeri {

	public static void main(String[] args) {

		List<Integer> numeri = new ArrayList<Integer>();

		numeri.add(1);
		numeri.add(2);
		numeri.add(3);
		numeri.add(4);
		numeri.add(5);

		// CICLO FOR
		System.out.println("\nCICLO FOR");
		for(int i=0; i<numeri.size(); i++) {
			System.out.println(numeri.get(i));
		}

		// FOR EACH
		System.out.println("\nFOR EACH");
		for(int intero : numeri) {
			System.out.println(intero);
		}

		// ITERATOR
		System.out.println("\nITERATOR");
		Iterator<Integer> iteratore = numeri.iterator();
		while(iteratore.hasNext()) {
			System.out.println(iteratore.next());
		}

	}
}
