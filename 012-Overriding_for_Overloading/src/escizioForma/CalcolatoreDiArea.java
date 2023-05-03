package escizioForma;

//Calcola l'area del cerchio
public class CalcolatoreDiArea implements Calcolatore {
	// 1)
	// Metodo 'areaDi' sovraccarico che prende un Cerchio
	public float areaDi(Cerchio c) {
		int r = c.getRaggio();
		return 3.14f*r*r;
	}
	
	// 1)
	// Metodo 'areaDi' sovraccarico che prende un Quadrato
	public float areaDi(Quadrato q) {
		int l = q.getLato();
		return l*l;
	}

	/*
	 * 2)
	 * Il tipo dinamico non è prevedibile a tempo statico
	 */
	/*
	 * static public float sommaAll(CalcolatoreDiArea calcolatore, Forma[] forme) {
			float acc = 0;
			for(Forma forma : forme) {
				acc += calcolatore.areaDi(forma); // <<<<----- Informa che area di non prende una FORMA
			}
			return acc;
		}
	*/
	
	// 2)
	@Override
	public float calcola(Cerchio c) {
		return 3.14f * c.getRaggio() * c.getRaggio();
	}
	
	@Override
	public float calcola(Quadrato q) {
		return q.getLato() * q.getLato();
	}
	
	static public float sommaAll(Calcolatore calc, Forma[] forme) {
		float acc = 0;
		for(Forma forma : forme) {
			acc += forma.accetta(calc); 
		}
		return acc;
	}
	
	public static void main(String[] args) {
		
		CalcolatoreDiArea calcolatore = new CalcolatoreDiArea();
		
		Cerchio cerchio = new Cerchio(1);
		Quadrato quadrato = new Quadrato(2);
		
		System.out.println(calcolatore.areaDi(cerchio));
		System.out.println(calcolatore.areaDi(quadrato));
		
		/* 1)
		 * 
		 * La situazione sarebbe più complicata se facessi così:
		 * 
		 * Forma cerchio = new Cerchio(1);
		 * Forma quadrato = new Quadrato(2);
		 * 
		 * System.out.println(calcolatore.areaDi(cerchio));
		 * System.out.println(calcolatore.areaDi(quadrato));
		 * 
		 * NON COMPILEREBBE perché a tempo statico il compilatore direbbe che:
		 * non conosce un metodo 'areaDi' che prenda una forma. Perché 'areaDi' prende o il 'Cerchio' o il 'Quadrato'
		 */
		
		
		
		
		
		/* Come risolvere quindi questo problema?
		 * 
		 * Si propone di avere una 'interface forma' che ha un nuovo metodo chiamato 'accetta', l'idea è che questo metodo serve
		 * a accettare, chiamiamolo 'Calcolatore' di numeri su questa gerarchia di 'forme'.
		 * 
		 * Il tipo 'Calcolatore' offrirà dei metodi 'calcola' che sono sovraccarichi, 'calcola(Cerchio)' etc. 
		 * 
		 * l'idea è che le 'forme' accetteranno vari calcolatori sulla gerarchia delle forme, e questi calcolatori
		 * sono quelli che ci faranno calcolare il perimetro, l'area etc.
		 * 
		 * L'idea è quella che le classi Cerchio e Quadrato, nell'implementare formadebbano offrire l'implementazione
		 * del metodo accetta (Guarda metodi accetta).
		 */
		
		Calcolatore calcAree = new CalcolatoreDiArea();
		Forma[] forme = { new Cerchio(1), new Quadrato(2) };
		
		System.out.println(sommaAll(calcAree, forme));
	}
}
