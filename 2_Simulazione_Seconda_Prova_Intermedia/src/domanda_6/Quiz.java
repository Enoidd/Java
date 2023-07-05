package domanda_6;

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * RISPOSTA: A.p(C1) - C2.a()
 */

public class Quiz {

	public static void main(String[] args) {
        A a = new A();
        
        C1 c = a.getC();	// DINAMICO: C2
        // E' vero che C2 estende C1? Si, quindi OK
        
        a.p(c); // STAMPA: A.p(C1) - C2.a()
    }
    
}