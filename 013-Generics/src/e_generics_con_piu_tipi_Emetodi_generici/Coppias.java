package e_generics_con_piu_tipi_Emetodi_generici;

public class Coppias {

	public static void main(String[] args) {

		// Creo una coppia formata da uno studente e una persona
		Coppia<Persona, Studente> coppiaPersonaStudente;
		coppiaPersonaStudente = new Coppia<Persona, Studente>(new Persona("Persona1"), new Studente("Studente1"));
		
		System.out.println("========Elementi della coppia:");
		System.out.println("Primo elemento: "+ coppiaPersonaStudente.getPrimo().getNome());
		System.out.println("Secondo elemento: "+ coppiaPersonaStudente.getSecondo().getNome());
		
		
	}

}
