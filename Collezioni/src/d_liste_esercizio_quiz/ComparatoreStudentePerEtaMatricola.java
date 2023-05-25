package d_liste_esercizio_quiz;

import java.util.Comparator; // Comparatore esterno

/* Ordina la Collezione Studente per eta e matricola */
public class ComparatoreStudentePerEtaMatricola implements Comparator<Studente>{

	@Override
	public int compare(Studente o1, Studente o2) {
		// TODO Auto-generated method stub
		if(o1.compareTo(o2)==0)	// se l'età è uguale
			return o1.getMatricola().compareTo(o2.getMatricola());	// comparalo per matricola
		// Altrimenti hanno età diversa
		return o1.compareTo(o2);
	}
}
