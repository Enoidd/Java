package z_Esercizio_mappa_meseNascita2Studenti;

import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class Aula {
	
	private Set<Studente> studenti;
	
	public Aula() {
		this.studenti = new HashSet<Studente>();
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
	
	/*
	 * Scrivere il metodo 'meseDiNascita2studenti' che ritorna una mappa che associa a ciascun
	 * mese una lista con tutti e soli gli studenti nati in quel mese.
	 */
	public Map<String, List<Studente>> meseDiNascita2studenti(){
		
		List<Studente> temp;
		
		Map<String, List<Studente>> mappa;
		mappa = new HashMap<String, List<Studente>>();
		
		// Scorri tutti gli elementi della lista 'studenti'
		for(Studente iteratore : this.studenti) {
			/*
			 * viene invocato il metodo get sulla mappa utilizzando il meseDiNascita come chiave.
			 * Questo restituisce la lista di studenti associata a quella chiave se presente o null.
			 */
			temp = mappa.get(iteratore.getMeseDiNascita());
			// se la lista temporanea 'temp' è null
			if(temp == null)
				//inizializzala come nuova istanza di ArrayList<Studente>
				temp = new ArrayList<Studente>();
			// Altrimenti lo studente viene aggiungo alla lista 'temp'
			temp.add(iteratore);
			// per associare il mese di nascita alla lista 'temp'
			mappa.put(iteratore.getMeseDiNascita(), temp);
		}
		return mappa;
	}
}
