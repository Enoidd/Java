package domanda_1;

public class Anagrafe {
	
	public Persona cambiaNome(Persona persona, String nuovoNome) {
        persona.setNome(nuovoNome);
        return persona;
    }
}