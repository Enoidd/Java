package domanda_1;

/*
 * Cosa stampa questo programma?
 * OP: Z.dim(y) - Y.dim(Z)
 */

public class Y extends X{

	public void dim(X x) {
		System.out.print("Y.dim(X)");
	}
	public void dim(Y y) {
		System.out.print("Y.dim(Y)");
	}
	public void dim(Z z) {
		System.out.print("Y.dim(Z)");
	}
	
	public static void main(String args[]) {
		
		X a = new Z();
		Y b = new Y();
		
		a.dim(b);	// 'a' dinamico 'Z' - 'b' statico 'X' -> OP: Z.dim(Y)
		
		Y a1 = new Y();
		System.out.print(" - ");	// -
		
		a1.dim(a);	// 'a1' dinamico 'Y' - 'a' static 'Y' -> OP: Y.dim(Z)
	}
}