package estensione_di_classi;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente anonimo = new Studente("","");
		
		/*
		 * La variabile 'anonimo' riferimento alla classe oggetto 'Studente' essendo che 
		 * la classe 'Studente' estende la classe 'Persona' è possibile utilizzare il metodo:
		 * 'setNome' 
		 */
		anonimo.setNome("Paolo");
//		System.out.println(anonimo.getNome());
//		System.out.println(anonimo.toString());
		
		Persona p = new Studente("Paolo", "123456");
//		System.out.println(p.getNome());	// stampa: PAOLO
		p.setNome("Anna");	// Cambio nome di 'p' da PAOLO a ANNA
		System.out.println(p.getNome());	// stampa: ANNA
		System.out.println(p.toString());	// stampa: ANNA, 123456
		
		Studente s = new Studente("Luigi", "654321");	// 's' si chiama LUIGI
		s.setNome("Antonio");	// Cambio nome di 's' da LUIGI a ANTONIO
		System.out.println(s.getNome());	// stampa: LUIGI
		System.out.println(s.toString());	// stampa: LUIGI, 645321
		/*
		 * Posso invocare il metodo 'setNome' sia con tipo statico 'Persona'
		 * sia con tipo statico 'Studente', infatti 's' è di tipo statico 'Studente'
		 * e 'p' è di tipo statico 'Persona'.
		 */
		
		/* Ovviamente se facessi:
		 * 
		 * p.setMatricola("33333"); NON COMPILA
		 * 
		 * perché il tipo statico 'Persona' non offre il metodo 'setMatricola'
		 */
		
		
		// Tipo statico "studente" - tipo dinamico "studente"
		Studente studente = new Studente("Paolo", "123456");
		
		// Tipo statico "persona" - tipo dinamico "studente"
		Persona persona = new Studente("Anna", "654321");
		
		// E' il tipo dinamico a determinare quale metodo invocare in questo caso
		// invoca il metodo toString() della classe 'Studente'
		System.out.println(studente.toString());
		System.out.println(persona.toString());
		
	}

}
