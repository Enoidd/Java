package domanda_3;

public class SMS extends Messaggio {
	
	private String mittente;
	private String destinatario;
	
	// Costruttore
	public SMS(String mittente, String destinatario) {
		super();
		this.mittente = mittente;
		this.destinatario = destinatario;
	}
}
