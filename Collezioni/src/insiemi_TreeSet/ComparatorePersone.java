package insiemi_TreeSet;

import java.util.Comparator;

public class ComparatorePersone implements Comparator<Persona> {

	@Override
	public int compare(Persona o1, Persona o2) {
		// TODO Auto-generated method stub
		return o1.getNome().compareTo(o2.getNome());
	}
}
