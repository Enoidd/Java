package g_esercizio_studente_mappe;

public class Studente {
	
	public String matricola;
	public String annoDiNascita;
	
	public Studente(String matricola, int annoDiNascita) {
		this.matricola = matricola;
		this.annoDiNascita = this.annoDiNascita;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	public String getAnno() {
		return this.annoDiNascita;
	}
	
	@Override
	public int hashCode() {
		return this.matricola.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		Studente questo = (Studente) o;
		return this.getMatricola().equals(questo.getMatricola());
	}
}
