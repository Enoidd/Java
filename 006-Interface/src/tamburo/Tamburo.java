package tamburo;

/* La parola chiave 'implements' serve a specificare che la classe 'Tamburo' implementa l'interfaccia
 * 'Strumento'. Questo significa che gli oggetti 'Tamburo', sono in grado di offrire i metodi del tipo
 * 'Strumento'
 */
public class Tamburo implements Strumento {
	
	public void produciSuono() {
		System.out.println("bum-bum-bum");
	}

}
