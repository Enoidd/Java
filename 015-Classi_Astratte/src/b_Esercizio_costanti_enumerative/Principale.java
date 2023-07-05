package b_Esercizio_costanti_enumerative;

public class Principale {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Mario", 30, Genere.MASCHIO);
		Persona p2 = new Persona("Carla", 26, Genere.FEMMINA);
		
		System.out.println("Persona 'p1':");
		System.out.println(""+p1.toString());

		System.out.println("Persona 'p2':");
		System.out.println(""+p2.toString());
		
		
	}

}
