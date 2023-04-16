package prova1;

public class Olimpiadi {
	public void iscrivi(Atleta a){
		System.out.print("A ");
	}
	public void iscrivi(Corridore C) {
		System.out.print("C ");
	}
	public void iscrivi(Saltatore s) {
		System.out.print("S ");
	}

	public static void main(String args[]) {
	  Olimpiadi o = new Olimpiadi();

	  Corridore c = new Corridore();
	  Saltatore s = new Saltatore();
	  Atleta a = new Corridore();
	  System.out.println("a: "+a);
	  System.out.println("s: "+s);
	  
	  a = s;
	  System.out.println("a = s");
	  System.out.println("a: "+a);
	  System.out.println("s: "+s);
	  	  

	  o.iscrivi(a);
	  o.iscrivi(s);
	  o.iscrivi(c);
	}
}
