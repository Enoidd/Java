package comparable_comparator_arrayList;

import java.util.*;

public class immatricolazioni {

	private List<Studente> elenco;
	
	// Costruttore
	public immatricolazioni() {
		this.elenco = new ArrayList<>();	// Crea un elenco
		
		/* L'elenco:
		 * 
		 * | elenco[] elenco: |
		 * | 				  |
		 * | disegna elenco   |
		 */
	}
	
	public void aggiungiStudente(Studente s) {
		this.elenco.add(s);
	}
	
	public List<Studente> elencoOrdinatoStudenti(){
		
		List<Studente> elencoOrdinato = new ArrayList<Studente>();
		
		elencoOrdinato.addAll(elenco);
		ComparatoreEtaMatricola cmp = new ComparatoreEtaMatricola();
		Collections.sort(elencoOrdinato, cmp);
	    return elencoOrdinato;
	}
}
