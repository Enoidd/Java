package z_Esercizio_mappa_meseNascita2Studenti;

public class Studente {
	
	private String matricola;
	private String meseDiNascita;
	
	public Studente(String matricola, String meseDiNascita) {
		this.matricola = matricola;
		this.meseDiNascita = meseDiNascita;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	public String getMeseDiNascita() {
		return this.meseDiNascita;
	}
	
	@Override
	public int hashCode() {
		return this.matricola.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		Studente s = (Studente) o;
		return this.getMatricola().equals(s.getMatricola());
	}
	
	@Override
	public String toString() {
		return "Studente [Matricola:"+matricola+", "+meseDiNascita+"]"+" ";
	}
}
