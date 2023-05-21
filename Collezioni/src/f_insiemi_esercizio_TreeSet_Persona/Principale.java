package f_insiemi_esercizio_TreeSet_Persona;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

import d_comparable_liste.Persona;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Sandro", 33);
		Persona p2 = new Persona("Alfio", 23);
		Persona p3 = new Persona("Sandro", 43);
		
		Set<Persona> persone = new TreeSet<>();
		
		/*
		 * Se aggiungi due persone con stesso nome e età uguale o diversa non le aggiunge.
		 * Se aggiungi due persone con nome diverso ed età uguale le aggiunge.
		 */
		persone.add(p1);
		persone.add(p2);
		persone.add(p3);
		
		System.out.println("Size: "+persone.size());
		
		for(Persona p : persone) {
			System.out.println(""+p.getNome()+", "+p.getEta());
		}
		
		
		
	}

}
