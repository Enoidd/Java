package domanda_9;

// OK

/*
 * COSA STAMPA QUESTO CODICE?
 * 
 * STAMPA: "Cantante qualsiasi ", "David Bowie ", "Freddie Mercury "
 */

public class Quiz {

	public void scrivi(Cantante r) { 
        System.out.print("Cantante qualsiasi "); 
    }
    
    public void scrivi(Mercury l) { 
        System.out.print("Freddie Mercury "); 
    }
    
    public void scrivi(Bowie s) { 
        System.out.print("David Bowie "); 
    }

    public static void main(String args[]) {
        Quiz  quiz = new Quiz();

        Mercury m = new Mercury();
        Bowie b = new Bowie();
        Cantante c = new Mercury();
      
        c = b; // dinamico di 'c' ora è Bowie
      
        quiz.scrivi(c);
        quiz.scrivi(b);
        quiz.scrivi(m);
    }
}