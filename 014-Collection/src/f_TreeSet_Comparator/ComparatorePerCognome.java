package f_TreeSet_Comparator;

import java.util.Comparator;

public class ComparatorePerCognome implements Comparator<Persona>{
	
	@Override
	public int compare(Persona o1, Persona o2) {
		
		return o1.getCognome().compareTo(o2.getCognome());
	}

}
