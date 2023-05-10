package it.uniroma3.diadia.ambienti;

import it.uniroma3.diadia.attrezzi.Attrezzo;

public class StanzaMagicaProtected extends StanzaProtected {
	// Variabili di istanza
	final static private int SOGLIA_MAGICA_DEFAULT = 3;
	private int contatoreAttrezziPosati;
	private int sogliaMagica;

	// Costruttori
	public StanzaMagicaProtected(String nome) {
		this(nome, SOGLIA_MAGICA_DEFAULT);
	}

	public StanzaMagicaProtected(String nome, int soglia) {
		super(nome);
		this.contatoreAttrezziPosati = 0;
		this.sogliaMagica = soglia;
	}

	@Override
	public boolean addAttrezzo(Attrezzo attrezzo) {

		this.contatoreAttrezziPosati++;
		if(this.contatoreAttrezziPosati > this.sogliaMagica)
			attrezzo = this.modificaAttrezzo(attrezzo);

		return super.addAttrezzo(attrezzo);
	}


	private Attrezzo modificaAttrezzo(Attrezzo attrezzo) {

		StringBuilder nomeInvertito;
		int pesoX2 = attrezzo.getPeso()*2;
		nomeInvertito = new StringBuilder(attrezzo.getNome());
		nomeInvertito = nomeInvertito.reverse();	// metodo 'reverse' che inverte il nome dell'attrezzo
		attrezzo = new Attrezzo(nomeInvertito.toString(), pesoX2);

		return attrezzo;
	}	
}
