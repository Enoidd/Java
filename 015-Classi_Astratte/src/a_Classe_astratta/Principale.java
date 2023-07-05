package a_Classe_astratta;

public class Principale {

	public static void main(String[] args) {
		
		// Creo un oggetto rettangolo di tipo 'Rettangolo'
		Figura rettangolo = new Rettangolo("Rosso", 5, 3);
		rettangolo.descrivi();
		System.out.println("Area del rettangolo: "+rettangolo.calcolaArea());
		
		// Creo un oggetto cerchio di tipo 'Cerchio'
		Figura cerchio = new Cerchio("Blu", 2.5);
		cerchio.descrivi();
		System.out.println("Area del cerchio: "+cerchio.calcolaArea());

		/*
		 * Le classi astratte ci permettono di definire un comportamento comune per le figure 
		 * geometrice, ma senza implementare completamente il metodo 'calcolaArea()' nella classe
		 * astratta 'Figura'. Infatti questo viene fatto nelle classi derivate: Rettangolo e 
		 * Cerchio.
		 */
	}

}
