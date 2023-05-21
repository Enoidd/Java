package d_esercizio_comparator_moto;

public class Moto implements Comparable<Moto>{

	private String nome;
	private int cilindrata;
	
	public Moto(String nome, int cilindrata) {
		this.nome = nome;
		this.cilindrata = cilindrata;
	}
	
	public String getMarca() {
		return this.nome;
	}
	
	public int getCilindrata() {
		return this.cilindrata;
	}
	
	@Override
	public int compareTo(Moto o) {
		return this.nome.compareTo(o.getMarca());
	}

}
