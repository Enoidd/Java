package visibilitaProtected;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona p = new Persona("Giammaria", "Scardella");
		System.out.println(""+p.getNome()+" "+p.getCognome());	// Stampa "Giammaria Scardella"
		
		System.out.println("");
		
		Studente s = new Studente("Gina", "Di Cori", "123");
		
		s.getMatricola();
		s.getCognome();	// Metodo di Persona
		s.getNome();
	}

}
