package orario;

public class Orario implements Comparabile {
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
	@Override
	public boolean minoreDi(Comparabile comparabile) {
		/**
		 * Sopraggiunge il problema che 'Comparabile' non conosce orario, e soltanto 'orario' conosce
		 * 'comparabile' perché la classe 'orario' è sotto tipo del supertipo 'comparabile', di consequenza
		 * comparabile non possiede i metodi get etc., bisogna quindi fare un operazione di downcasting
		 */
		Orario o;
		o = (Orario) comparabile;	// downcasting
		// se l'orario fornito è maggiore di quello corrente
		if(this.getOre() > o.getOre())
			return false;
		// se l'orario corrente è uguale a quello fornito
		if(this.getOre() == o.getOre())
			return (this.getMinuti() < o.getMinuti());
		return true;
	}
}
