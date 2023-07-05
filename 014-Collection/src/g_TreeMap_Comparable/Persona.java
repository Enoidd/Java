package g_TreeMap_Comparable;

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
	public String toString() {
		return "Persona [nome_"+nome+", "+eta+"]"+"\n";
	}

	@Override
	public int compareTo(Persona o) {
		return this.nome.compareTo(o.getNome());
	}
}
