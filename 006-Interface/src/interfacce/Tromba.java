package interfacce;


/* 'Tromba' implementa l'interfaccia 'Strumento', questo implica che 'Chitarra' è sotto tipo di 'Strumento',
 * meglio dire che 'Strumento' è supertipo di 'Tromba'
 */
public class Tromba implements Strumento{
	/* Descrizione */
	public void produciSuono() {
		System.out.println("pe-pe-re-pe-pe");
	}
}
