package domanda_1;

/*
 * COSTA STAMPA QUESTO CODICE?
 * 
 * STAMPA: Gigi, Paolo, Paolo
 */

public class Ingegnere {

	private String nome;

    public Ingegnere (String nome) {
        this.nome = nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public static void main(String[] argc) {
    	// Sequenza 'ing' di tipo 'Ingegnere'
        Ingegnere[] ing = new Ingegnere[3];
        // Un ingegnere 'a' di nome "Giorgio"
        Ingegnere a = new Ingegnere("Giorgio");
        ing[0] = a;	// La prima cella contiene "Giorgio"
        a.setNome("Gigi");	// Cambio il nome ad 'a' da Giorgio a Gigi -> prima cella contiene Gigi
        a = new Ingegnere("Luca");	// 'a' si chama Luca
        ing[1] = a;	// Seconda cella contiene Luca
        Ingegnere b;	// Dichiaro un ingegnere 'b'
        b = a;	// b punta alla seconda cella e che chiama Luca
        b.setNome("Paolo");	// cambio il nome di 'b' da Luca a Paolo, 
        // sapendo che b e a puntano alla seconda cella la seconda cella si chiama Paolo
        ing[2] = b;	// Terza cella si chiama Paolo
        for(Ingegnere i : ing)
            System.out.print(i.getNome()+" ");
    }
}
