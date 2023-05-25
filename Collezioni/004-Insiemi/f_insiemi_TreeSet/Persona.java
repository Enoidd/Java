package f_insiemi_TreeSet;

public class Persona implements Comparable<Persona> {

	private String nome;
	
	public Persona(String nome) {
		this.nome = nome;
	}
	
	public String toString() {
		return this.nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	/*
	 * L'interface 'Set<E>' che estende 'Collection<E>' offre tutti e soli i metodi della interface 'Collection<E>'
	 * con il fatto che non ammette DUPLICATI.
	 * 
	 * Il Criterio di equivalenza per non ammettere duplicati di TreeSet<> è dato da:
	 *
	 * 
	 * Due metodi: public boolean equals(Object o) & public int compareTo() <- interno
	 * oppure public int compare() <- esterno;
	 * 
	 */
	
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		return this.getNome().compareTo(o.getNome());
	}
	
	@Override
	public boolean equals(Object o) {
		Persona p = (Persona) o;
		return this.getNome().equals(p.getNome());
	}
	
	

}
