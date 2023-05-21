package c_liste_esercizio_contatto;

public class Contatto {
	
	private String nome;
	private String cognome;
	private String numero;
	
	public Contatto(String nome, String cognome, String numero) {
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCognome() {
		return this.cognome;
	}
	
	public String getNumero() {
		return this.numero;
	}
	
	@Override
	public String toString() {
		return ""+this.nome+" "+this.cognome+": "+this.numero;
	}
}
