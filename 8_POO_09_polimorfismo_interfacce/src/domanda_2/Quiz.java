package domanda_2;

public class Quiz {

	public static void main(String []args){
        
		D d = new D();
        
        A obj = d.n(); // Dinamico B
        
        Printer x = new Printer();
        x.print(obj); // 'x' dinamico 'Printer' -> Statico 'A'
        
        /*
         * Output:
         * 
         * print(A) - B -> Perché 'A' in 'Printer(A a)' è di tipo dinamico 'B' nel main.
         */
     }
}
