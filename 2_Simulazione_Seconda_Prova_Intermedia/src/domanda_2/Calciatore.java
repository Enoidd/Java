package domanda_2;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: FRANCESCO, FRANCESCO, DANIELE, MAX
 */

public class Calciatore {

	private String nome;

    public Calciatore(String nome) {
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    public static void main(String args[]) {
        Calciatore[] uomo = new Calciatore[10];
        Calciatore p1 = new Calciatore("paolo");

        uomo[0] = p1; // prima cella "Paolo"
        p1.setNome("francesco");	// Cambio il nome della prima cella in "Francesco"
        uomo[1] = p1; // Seconda cella "Francesco"
        uomo[2] = new Calciatore("daniele");	// Terza cella "Daniele"
        uomo[3] = new Calciatore("max");	// Quarta cella "Max"

        Calciatore mister = new Calciatore("max");

        for(int i = 0; i<4; i++)
            if (uomo[i] != mister)	// saranno sempre diverse le locazioni di memoria
                System.out.print(uomo[i].getNome()+" ");
     }
}