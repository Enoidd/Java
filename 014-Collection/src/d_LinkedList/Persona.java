package d_LinkedList;


public class Persona implements Comparable<Persona>{
	
	private String nome;
	
	public Persona(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String toString() {
		return this.nome + " "; 
	}

	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.nome.compareTo(o.getNome());
	}
}
