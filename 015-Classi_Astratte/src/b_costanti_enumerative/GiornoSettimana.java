package b_costanti_enumerative;

/*
 * Le costanti enumerative, o enum, sono un tipo di dato in Java che rappresentano un insieme
 * predefinito di valori costanti. 
 * 
 * Le enum offrono un modo conveniente per definire e utilizzare un insieme limitato di valori
 * ben definiti.
 * 
 */


/*
 * I giorni della settimana, come valori costanti. Possiamo utilizzare questa enum per rappresentare
 * e manipolare i giorni della settimana nel nostro codice.
 */
public enum GiornoSettimana {
	LUNEDI("Lunedì", 1),
	MARTEDI("Martedì", 2),
	MERCOLEDI("Mercoledì", 3),
	GIOVEDI("Giovedì", 4),
	VENERDI("Venerdì", 5),
	SABATO("Sabato", 6),
	DOMENICA("Domenica", 7);
	
	private String nomeItaliano;
	private int numeroOrdine;
	
	GiornoSettimana(String nomeItaliano, int numeroOrdine) {
		this.nomeItaliano = nomeItaliano;
		this.numeroOrdine = numeroOrdine;
	}
	
	public String getNomeItaliano() {
		return nomeItaliano;
	}
	
	public int getNumeroOrdine() {
		return numeroOrdine;
	}
}
