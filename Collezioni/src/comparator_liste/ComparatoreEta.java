package comparator_liste;

import java.util.*;

public class ComparatoreEta implements Comparator<Persona>{
	
	@Override
	public int compare(Persona p1, Persona p2) {
		return p1.getEta() - p2.getEta();
	}
	
}
