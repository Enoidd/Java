package studente;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente[] s = new Studente[5];

		s[0] = new Studente("s1", 30);
		s[1] = new Studente("s2", 40);
		s[2] = new Studente("s3", 20);
		s[3] = new Studente("s4", 00);
		s[4] = new Studente("s5", 35);
		
		System.out.println("\nNon ordinato:");
		System.out.println("Nome: "+ s[0].getNome() + ", Eta: " + s[0].getEta());
		System.out.println("Nome: "+ s[1].getNome() + ", Eta: " + s[1].getEta());
		System.out.println("Nome: "+ s[2].getNome() + ", Eta: " + s[2].getEta());
		System.out.println("Nome: "+ s[3].getNome() + ", Eta: " + s[3].getEta());
		System.out.println("Nome: "+ s[1].getNome() + ", Eta: " + s[4].getEta());
		
		ordinatoreEta o = new ordinatoreEta();
		
		o.ordina(s);
		
		System.out.println("\nOrdinato:");
		System.out.println("Nome: "+ s[0].getNome() + ", Eta: " + s[0].getEta());
		System.out.println("Nome: "+ s[1].getNome() + ", Eta: " + s[1].getEta());
		System.out.println("Nome: "+ s[2].getNome() + ", Eta: " + s[2].getEta());
		System.out.println("Nome: "+ s[3].getNome() + ", Eta: " + s[3].getEta());
		System.out.println("Nome: "+ s[1].getNome() + ", Eta: " + s[4].getEta());
		
		System.out.println("Esito: " + s[1].compara(s[2]));	// 20 < 30 Esito: -1
		System.out.println("Esito: " + s[1].compara(s[1]));	// 20 < 30 Esito: 0
		System.out.println("Esito: " + s[2].compara(s[1]));	// 20 < 30 Esito: 1
	}

}
