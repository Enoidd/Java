package g_TreeMap_Comparator;


public class Persona {
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
}
