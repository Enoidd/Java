package domanda_3;

public class M implements D {
	
    public void dim(D d) {
       System.out.print("M.dim(D) ");
    }
    public void dim(M m) {
       System.out.print("M.dim(M) ");
    }

    public static void main(String args[]) {
       M a = new M(); 
       D b = new M();
       a.dim(b);	// Stampa: M.dim(D)
       M a1 = new M();
       a1.dim(a);	// Stampa: M.dim(M)
    }
}
