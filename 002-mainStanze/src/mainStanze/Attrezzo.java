package mainStanze;

public class Attrezzo {
	/* Variabili di istanza */
	private String nome;
	private int peso;
	
	/* Metodi */
	public void setNome(String nomeAttrezzo) {
		nome = nomeAttrezzo;
	}
	
	public void setPeso(int vPeso) {
		peso = vPeso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getPeso() {
		return peso;
	}
	
	/* Metodo toString */
	public String toString() {
		return "Attrezzo di nome " + this.getNome() + ". Peso: " + this.getPeso();
	}
	
}
