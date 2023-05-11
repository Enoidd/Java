package prova14;
import java.util.*;

public class Immatricolazioni {
    private List<Studente> elenco;

    public Immatricolazioni() {
        this.elenco = new ArrayList<Studente>();
    }

    public void aggiungiStudente(Studente studente) {
        this.elenco.add(studente);
    }

    public List<Studente> elencoOrdinatoPerEtaMatricola() {
    	
        List<Studente> elencoOrdinato = new ArrayList<Studente>();
        // scrivere il codice di questo metodo
        elencoOrdinato.addAll(elenco);	// Prendo l'elenco che devo ordinare e lo aggiungo al nuovo 'elencoOrdinato'
        Collections.sort(elencoOrdinato);
        
        return elencoOrdinato;
    }
}