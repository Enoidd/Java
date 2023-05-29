package c_ArrayList_di_ArrayList;

import java.util.ArrayList;
import java.util.List;


/* ARRAYLIST DI ARRAYLIST */
public class Principale {

	public static void main(String[] args) {
		
		final List<String> mammiferi = new ArrayList<>();
		
		mammiferi.add("Gatto");
		mammiferi.add("Daino");
		mammiferi.add("Gnù");
		
		final List<String> pesci= new ArrayList<>();
		
		pesci.add("Nemo");
		pesci.add("Dory");
		pesci.add("Marlin");
		
		/* SI VUOLE CREARE UN UNICO ARRAY LIST CONTENENTE L'ARRAYLIST 'mammiferi' & 'pesci' */
		
		// Questo ArrayList prende a sua volta altri ArrayList di stringhe
		final List<List<String>> animali = new ArrayList<>();
		
		animali.add(mammiferi);
		animali.add(pesci);
		
		// Per ogni lista all'interno di questa altra lista
		for(List<String> iteratore: animali) {
			// Per ogni String iterator all'interno di iteratore
			for(String iterator: iteratore) {
				System.out.println(iterator);	// vado a stampare quell'animale iterator
			}
		}
	}

}
