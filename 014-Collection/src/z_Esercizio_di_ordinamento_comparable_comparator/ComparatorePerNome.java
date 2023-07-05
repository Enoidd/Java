package z_Esercizio_di_ordinamento_comparable_comparator;

import java.util.Comparator;

public class ComparatorePerNome implements Comparator<Studente>{

	@Override
	public int compare(Studente o1, Studente o2) {

		return o1.getNome().compareTo(o2.getNome());
	}

}
