package prova;

public class K implements C{
	
	public void dim(C c) {
		System.out.println("K.dim(C) ");
     }
     public void dim(L l) {
		System.out.println("K.dim(L) ");
     }
     public void dim(K k) {
		System.out.println("K.dim(K) ");
     }
}
