package prova14;

public class ComparatoreStudentePerEtaMatricola {

	public int compare(Studente p1, Studente p2) {
        // scrivere il codice di questo metodo
		if(p1.getEta()==p2.getEta())
			return p1.getMatricola().compareTo(p2.getMatricola());
		return p1.compareTo(p2);
    }
}
