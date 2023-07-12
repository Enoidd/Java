package domanda_3;

public class Messaggio {

	private static final int LUNGHEZZA_MAX_DEFAULT = 160;
	private int lunghezzaMassima; // 0
	
	// 1° Costruttore
	public Messaggio(int lunghezzaMassima) {
		this.lunghezzaMassima = lunghezzaMassima;
	}
	// 2° Costruttore
	public Messaggio() {
		this(LUNGHEZZA_MAX_DEFAULT);
	}

	public int getLunghezzaMassima() {
		return lunghezzaMassima;
	}
	
}
