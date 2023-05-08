package prova5;

public class Quiz {
	
	public static void main (String[] args) {

		K a = new J();

		J b = new J();

//		System.out.println(""+a);
//		System.out.println(""+b);

		a.me();
		b.me();
		
		b.greet(b);
		a.greet(a);
		a.greet(b);
		b.greet(a);
		
		a.greet((J)a);
		b.greet((K)a);
		b.greet((K)b);
		a.greet((J)b);
		
		a.greet((K)a);
		b.greet((J)a);
		b.greet((J)b);
		a.greet((K)b);
	}
}
