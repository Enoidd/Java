package z_Esercizio_mappa_meseNascita2Studenti;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Studente> studenti = new ArrayList<>();
		
		studenti.add(new Studente("8984990", "Settembre"));
		studenti.add(new Studente("8884440", "Ottobre"));
		studenti.add(new Studente("8984550", "Novembre"));
		studenti.add(new Studente("898423550", "Novembre"));
		studenti.add(new Studente("8982324550", "Novembre"));
		
		Aula aula = new Aula();
		
		for(Studente iteratore : studenti) {
			aula.addStudente(iteratore);
		}
		
		Map<String, List<Studente>> mappa = aula.meseDiNascita2studenti();
		
		// Stampa dei risultati
		// Map.Entry restituisce un insieme di oggetti che rappresentano le coppie
		// chiave-valore all'interno di una mappa. Contiene sia la chiave che il valore.
        for(Map.Entry<String, List<Studente>> entry : mappa.entrySet()) {
            // Per ogni voce vengono estratte le chiavi 
        	String meseDiNascita = entry.getKey(); 
        	// e il loro valore
            List<Studente> studentiPerMese = entry.getValue();

            System.out.println("Mese di nascita: " + meseDiNascita);
            for (Studente studente : studentiPerMese) {
                System.out.println("  - Matricola: " + studente.getMatricola());
            }
            System.out.println();
        }
	}

}
