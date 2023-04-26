package studente;

public class Studente implements Comparabile {
	
	private String nome;
	private int eta;
	
	public Studente(String nome, int eta) {
		this.nome = nome;
		this.eta = eta;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getEta() {
		return this.eta;
	}

	@Override
	public boolean minoreDi(Comparabile c) {
		// TODO Auto-generated method stub
		Studente s;
		s = (Studente) c;
		if(this.getEta() < s.getEta())
			return true;	
		return false;
	}

	@Override
	public int compara(Comparabile c) {
		// TODO Auto-generated method stub
		Studente s;
		s = (Studente) c;
		// Se è minore
		if(this.getEta() < s.getEta())
			return -1;
		// Se è maggiore
		else if(this.getEta() > s.getEta())
			return 1;
		return 0;	// Altrimenti è uguale
	}
	
	
}
