package chitarra;

/* 'Chitarra' implementa l'interfaccia 'Strumento', questo implica che 'Chitarra' è sotto tipo di 'Strumento',
 * meglio dire che 'Strumento' è supertipo di 'Chitarra'
 */
public class Chitarra implements Strumento {
	/* Variabili di istanza */
	private int[] corde;
	/* Costruttore */
	public Chitarra() {
		corde = new int[6];
	}
	
	public void produciSuono() {
		System.out.println("dlen-dlen-dlen");
	}
	
	public int accorda(int corda, int val) {
		return corde[corda] += val;
	}
}
