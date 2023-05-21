package g_esercizio_studente_mappe;
import java.util.*;
public class Aula {
	
	private Set<Studente> studenti;
	
	public Aula() {
		this.studenti = new HashSet<Studente>();
	}
	
	public boolean addStudente(Studente studente) {
		return this.studenti.add(studente);
	}
	
	public Map<String, List<Studente>> meseDiNascita2Studenti(){
		
		List<Studente> listaStudenti;
		
		Map<String, List<Studente>> mappa = new HashMap<String, List<Studente>>();
		
		for(Studente studente: this.studenti) {
			listaStudenti = mappa.get(studente.getAnno());
			if(listaStudenti == null)
				listaStudenti = new ArrayList<Studente>();
			listaStudenti.add(studente);
			mappa.put(studente.getAnno(), listaStudenti);
		}
		return mappa;
	}
}
