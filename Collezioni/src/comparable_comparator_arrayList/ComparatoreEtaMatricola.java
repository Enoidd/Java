package comparable_comparator_arrayList;

import java.util.*;

public class ComparatoreEtaMatricola {

	class ComparatoreStudentePerEtaMatricola implements Comparator<Studente> {

	    public int compare(Studente p1, Studente p2) {
	        // scrivere il codice di questo metodo
	        if(p1.compareTo(p2)==0){
	            return p1.getMatricola().compareTo(p2.getMatricola());
	        }
	        return p1.compareTo(p2);
	    }

	}
}
