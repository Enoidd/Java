package f_TreeSet_Comparable;

import java.util.*;

public class Persona implements Comparable<Persona>{
	
	private String nome;
	private String cognome;
	private int eta;
	
	public Persona(String nome, String cognome, int eta) {
		this.nome = nome;
		this.cognome = cognome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	@Override
	public String toString() {
		return this.nome + " " + this.cognome + ", " + this.eta; 
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(o.getNome());
	}
}
