package comparable_comparator_arrayList;

import java.util.*;

public class Studente implements Comparable<Studente>{
	
	private String matricola;
	private int eta;
	
	public Studente(String matricola, int eta) {
		this.matricola = matricola;
		this.eta = eta;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	public String getMatricola() {
		return this.matricola;
	}
	
	@Override
	public int compareTo(Studente studente) {
		return this.getEta() - studente.getEta();
	}
	
	
}
