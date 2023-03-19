package stringhe;

public class equivalenza_di_stringhe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String favorita = "Sono la favorita!";
		
		// è equivalente a:
		
		//String favorita = new String("Sono la favorita!");
		
		String nome = new String("Alice");
		String omonimo = new String("Alice");
		
		System.out.println(nome == omonimo);	// Stampa False perché sono due oggetti distinti quindi riferimenti diversi
		
		System.out.println(nome.equals(omonimo));	// Stampa True perché il contenuto è uguale
		
		/* 
		 * Per concatenare due stringhe si utilizza l'operatore '+'
		 */
		nome = nome + omonimo;	// si sta creando un nuovo oggetto e si sovrascive il vecchio riferimento
		System.out.println(nome);	// Stampa AliceAlice
		
		/* Metodi della classe String */
		String s = "POO";
		
		// Lunghezza della stringa
		System.out.println(s.length());	// restituisce 3
		
		// Si ottiene un carattere in una certa posizione
		System.out.println(s.charAt(2)); 	// valore interno rappresenta posizione
		
		
		String s1 = "una Stringa";
		// Si ottiene indice a partire da un carattere
		System.out.println(s1.indexOf('s')); // restituisce un valore non valido -1 perché s minuscola non esiste
		System.out.println(s1.indexOf('S')); // restituisce 4 (posizione del carattere)
		
		System.out.println(s1.indexOf("ring")); // può anche prendere una stringa, trova la prima occorrenza
		
		// Rimpiazzare caratteri
		String s3 = "una stringa";
		String s4 = s3.replace("stringa", "stringa lunga");
		
		System.out.println(s3);	// stampa una stringa
		System.out.println(s4);	// stampa stringa lunga
		
	}

}
