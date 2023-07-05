package b_Esercizio_costanti_enumerative;

public class Persona {
	
	private String nome;
	private int eta;
	private Genere genere;
	
	public Persona(String nome, int eta, Genere genere) {
		this.nome = nome;
		this.eta = eta;
		this.genere = genere;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getEta() {
		return eta;
	}
	
	public Genere getGenere() {
		return genere;
	}
	
	@Override
	public String toString() {
		return "Nome: "+nome+", Età: "+eta+", Genere: "+genere;
	}
}
