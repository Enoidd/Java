package orario;

public class Orario {
	// Var di istanza
	private int ore;
	private int minuti;
	
	// Costruttore
	public Orario(int ore, int minuti) {
		this.ore = ore;
		this.minuti = minuti;
	}
	
	public int getOre() {
		return this.ore;
	}
	
	public int getMinuti() {
		return this.minuti;
	}
	
	/**
	 * Prende come parametro un Orario (quindi un riferimento alla classe oggetto orario, e di questo verifica
	 * se l'attuale orario (quello fornito come parametro al metodo è maggiore di quello corrente oppure
	 * se l'attuale orario (quello fornito come parametro al metodo è uguale a quello corrente.
	 * @param Oggetto orario
	 * @return true / false
	 */
	public boolean minoreDi(Orario o) {
		// se l'orario fornito è maggiore di quello corrente
		if(this.getOre() > o.getOre())
			return false;
		// se l'orario corrente è uguale a quello fornito
		if(this.getOre() == o.getOre())
			return (this.getMinuti() < o.getMinuti());
		return true;
	}
}
