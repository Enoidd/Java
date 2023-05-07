package visibilitaProtected;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Persona p = new Persona("Giammaria", "Scardella");
//		System.out.println(""+p.getNome()+" "+p.getCognome());	// Stampa "Giammaria Scardella"
//		
//		System.out.println("");
//		
//		Studente s = new Studente("Gina", "Di Cori", "123");
//		
//		s.getMatricola();
//		s.getCognome();	// Metodo di Persona
//		s.getNome();
//		
//		Persona ps = new Studente();

	Persona p = new Persona();
	Persona ps = new Studente();
	Studente s = new Studente();
	
	Organizzazione org = new Organizzazione();
	Organizzazione studi = new Universita();
	Universita rm3 = new Universita();
	
//	org.immatricola(p);	// Errore
//	org.immatricola(ps); // Errore
	org.immatricola(s);
	
//	studi.immatricola(p); // Errore
//	studi.immatricola(ps); // Errore
	studi.immatricola(s);
	
	rm3.immatricola(s);
	rm3.immatricola(ps);
	rm3.immatricola(p);
	
	}

}
