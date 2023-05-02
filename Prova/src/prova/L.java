package prova;

public class L implements C{
	public void dim(C c) {
		System.out.println("L.dim(C) ");
     }
     public void dim(L l) {
		System.out.println("L.dim(L) ");
     }
     public void dim(K k) {
		System.out.println("L.dim(K) ");
     }

     public static void main(String args[]) {
//		K a2 = new K();
//		K a3 = new K();
//		
//		a2.dim(a3);
    	 
    	K a4 = new K();
    	L a5 = new L();
    	
    	a4.dim(a5); 
    	
//    	
//    	C a6 = new K();
//    	C a7 = new K();
    	
//    	a6.dim(a7);	// nelle parentesi ci mette il tipo statico
		
    	C a = new K();
        C b = new L();
        a.dim(b); // a tipo dinamico - b tipo statico K.dim(C)
        
        a = b;
        
        /* Dopo questa assegnazione ho cambiato il riferimento della tipologia
         * dinamica di 'a', che prima puntava a K ma adesso punta a L. 
         * Quindi, il tipo statico di 'b' è 'C', mi domando, quali sono i metodi 
         * che posso implementare? (ossia quali sono i metodi che prendono una variabile
         * di tipo 'C'. I metodi sono quelli che stampano K.dim(C) e L.dim(C) ). 
         * Vista questa cosa, mi domando, quale sia il metodo dinamico della variabile
         * 'a'. In questo caso come detto sopra, è L pertando andrà a vedere il metodo
         * che prende la variabile di tipo 'C' nella classe 'L'. 
         */
        a.dim(b);
        
        L a1 = new L();
        a1.dim(a);
     }
}
