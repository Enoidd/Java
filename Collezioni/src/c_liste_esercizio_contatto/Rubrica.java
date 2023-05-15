package c_liste_esercizio_contatto;

import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;

public class Rubrica{

	private List<Contatto> rubrica;
	
	public Rubrica() {
		this.rubrica = new LinkedList<Contatto>();
	}
	
	public void aggiungiContatto(String nome, String cognome, String numero) {
		this.rubrica.add(new Contatto(nome, cognome, numero));
	}
	
	public boolean rimuoviContatto(String nome) {
		
		Iterator<Contatto> iteratore = this.rubrica.iterator();
		while(iteratore.hasNext()) {	// C'è un prossimo elemento
			if(iteratore.next().getNome().equals(nome)) {
				iteratore.remove();
				return true;
			}
		}
		return false;
	}
	
	public String cerca(String nome, String cognome) {
		
		Iterator<Contatto> it = this.rubrica.iterator();
		String numero = null;
		while(it.hasNext() && numero==null) {
			Contatto c = it.next();
			if(c.getNome().equals(nome) && 
				c.getCognome().equals(cognome))
				numero = c.getNumero();
		}
		return numero;
	}
	
	@Override
	public String toString() {
		String s = "Rubrica\n";
		s+="------------------------------\n";
		Iterator<Contatto> it = this.rubrica.iterator();
		while(it.hasNext()) {
			Contatto contact = it.next();
			System.out.println(contact.toString());
		}
		return s;
	}
}
