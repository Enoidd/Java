package d_esercizio_comparator_studente;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Immatricolazioni i1 = new Immatricolazioni();
		
		Studente s1 = new Studente("550", 18);
		Studente s2 = new Studente("987", 20);
		Studente s3 = new Studente("435", 26);
		
		i1.aggiungiStudente(s1);
		i1.aggiungiStudente(s2);
		i1.aggiungiStudente(s3);
		
		System.out.println(""+i1.toString());
	}

}
