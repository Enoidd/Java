package d_wildcard;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coppia<Persona> persone;	// Creo una coppia di persone
		
		Persona p1 = new Persona("Alfio");
		Persona p2 = new Persona("Erminio");
		
		persone = new Coppia<Persona>(p1, p2);
		
		Coppia<Studente> studenti;	// Creo una coppia di studenti
		
		Studente s1 = new Studente("s1");
		Studente s2 = new Studente("s2");
		
		studenti = new Coppia<Studente>(s1, s2);
		
		// Invocazione del metodo 'copyAll' che copia nella coppia di 'persone' (p1 e p2) la coppia di 'studenti' (s1 e s2)
		persone.copyAll(studenti);
	}

}
