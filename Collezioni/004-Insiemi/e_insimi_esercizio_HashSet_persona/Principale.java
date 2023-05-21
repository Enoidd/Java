package e_insimi_esercizio_HashSet_persona;

import java.util.Set;
import java.util.HashSet;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p1 = new Persona("Giacomo", 20);
		Persona p2 = new Persona("Luca", 22);
		Persona p3 = new Persona("Giacomo", 33);
		
		Set<Persona> persone = new HashSet<>();
		
		persone.add(p1);
		persone.add(p2);
		persone.add(p3);	// Lo aggiunge perché hanno eta' diversa
		
		System.out.println(""+persone.size());
	}

}
