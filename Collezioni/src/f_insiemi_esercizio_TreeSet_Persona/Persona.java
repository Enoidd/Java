package f_insiemi_esercizio_TreeSet_Persona;

import java.util.Set;
import java.util.Collections;

public class Persona implements Comparable<Persona>{

	private String nome;
	private int eta;
	
	public Persona(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}
	
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.getNome().compareTo(o.getNome());
	}
	
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		return this.getNome().equals(p.getNome()) && this.eta==p.getEta();
	}
}
