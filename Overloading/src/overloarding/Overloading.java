  package overloarding;

public class Overloading {
	
	/* Metodi */
	/* METODO SOVRACCARICO --->>> Overloading: 
	 * Permette di definire molteplici metodi / procedure con lo stesso nome.
	 * Chiamate anche "versioni sovraccariche", queste devono risultare distinguibili.
	 * 
	 * In che modo devono distinguersi?
	 * Numero di parametri
	 * Almeno un tipo tra i parametri deve essere diverso
	 */
	
	public void metodo(int a) {
		System.out.println("parametro int");
	}
	
	public void metodo(double a) {
		System.out.println("parametro double");
	}
	
	/* Le versioni sovraccariche dello stesso metodo possono differire anche per il
	 ")* tipo di valore restituito
	 */
	public int add(int a, int b) {
		return a+b;
	}
	
	public double add(int a, double b) {
		return a+b;
	}
	
	/* NB:
	 * L'operatore '+' è sovraccarico perché posso utilizzarlo sia per concatenare stringhe ad esempio, oppure
	 * utilizzarlo per sommare due tipi numerici
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading prova = new Overloading();
		prova.metodo(3);	// stampa "parametro int"
		prova.metodo(3.0d);	// stampa "parametro double"
		
		
		
	}

}
