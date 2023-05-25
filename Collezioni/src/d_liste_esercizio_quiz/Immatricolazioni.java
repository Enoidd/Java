package d_liste_esercizio_quiz;

import java.util.List;
import java.util.ArrayList;
import java.util.*;

public class Immatricolazioni {

	private List<Studente> lista_studenti;
	
	public Immatricolazioni() {
		this.lista_studenti = new ArrayList<Studente>();
	}
	
	public void aggiungiStudente(Studente studente) {
		this.lista_studenti.add(studente);
	}
	
	public List<Studente> elencoOrdinatoPerEtaMatricola(){
		
		// Collezione che ritorna
		List<Studente> elencoOrdinato = new ArrayList<Studente>();
		
		elencoOrdinato.addAll(lista_studenti);
		ComparatoreStudentePerEtaMatricola comparatore = new ComparatoreStudentePerEtaMatricola();
		elencoOrdinato.sort(comparatore);
		
		/* Equivalente:
		 * 
		 * elencoOrdinato.addAll(elenco);
		 * Collections.sort(elencoOrdinato, new ComparatoreStudentePerEtaMatricola());
         * return elencoOrdinato;
         * 
		 */
		return elencoOrdinato;
	}
	
	@Override
	public String toString() {
		
		String s = "Immatricolazioni:";
		System.out.println(s);
		s="\n--------------------------";
		Iterator<Studente> it = this.lista_studenti.iterator();
		while(it.hasNext()) {	// Fintanto che ci sono elementi nella lista
			Studente stud = it.next();
			System.out.println(stud.toString());
		}
		return s;
	}
}
