package comparable_liste;

import java.lang.String;
import java.util.List;
/*
 * Ordinamento "Naturale" o "Interno", si ha quando una classe implementa "Comparable"
 */
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
	public int compareTo(Persona that) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(that.getNome());
		/*
		 * compareTo viene offerto da 'java.lang.String'
		 * 
		 * that.nome -> Voglio ordinare le persone sulla base dell'ordinamento lessico-grafico
		 */
	}

}
