package domanda_3;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: risposta nei commenti nel main.
 */

public class Motocicletta {

	private int anno;
    private String targa;

    public Motocicletta(String targa, int anno) {
        this.targa = targa;
        this.anno = anno;
    }

    public void cambioTarga(String targa){
        this.targa = targa;
    }

    public String toString() {
        return this.targa + " " + this.anno;
    }

    public static void main(String[] args) {
        Motocicletta m1 = new Motocicletta("1111",1);
        Motocicletta m2 = new Motocicletta("2222", 2);
        Motocicletta m3 = m1; // m3 ha targa: 1111 e 1

        System.out.println(m1.toString()); // Stampa 1111, 1
        System.out.println(m2.toString()); // Stampa 2222, 2

        m2 = m3;	// m2 ha targa 1111 e 1
        m2.cambioTarga("3333");	// m2 ha targa 3333

        System.out.println(m2.toString()); // Stampa 3333, 1
        System.out.println(m3.toString()); // Stampa 3333, 1
    }
}