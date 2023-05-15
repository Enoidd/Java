package d_liste_esercizio_quiz;


class Studente implements Comparable<Studente> {
	

	private String matricola;
	private int eta;

	public Studente(String matricola, int eta) {
		this.matricola = matricola;
		this.eta = eta;
	}

	public String getMatricola() {
		return this.matricola;
	}

	public int getEta() {
		return this.eta;
	}
	
	// Il comparable ha sempre il compareTo
	public int compareTo(Studente studente) {
		return this.getEta() - studente.getEta();
	}
}

