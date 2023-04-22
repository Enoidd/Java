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
		
		Persona p = new Studente("Paolo", "123456");
		p.setNome("Anna");
		System.out.println(p.getNome());
		Studente s = new Studente("Luigi", "654321");
		s.setNome("Antonio");
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
