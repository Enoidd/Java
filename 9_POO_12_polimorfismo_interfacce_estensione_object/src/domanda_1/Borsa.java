package domanda_1;

public class Borsa extends Contenitore {

	public void addAttrezzo(Attrezzo a) {

		Attrezzo[] att = this.getAttrezzi();
		for (int i = 0; i < att.length; i++){
			if(att[i] == null){
				this.addAttrezzo(a,i);
				break;
			}
		}
	}
	
	public static void main(String[]args){
		
		Borsa borsa = new Borsa();
		Attrezzo attrezzo = new Attrezzo();

		borsa.addAttrezzo(attrezzo); // 0
		borsa.addAttrezzo(attrezzo,2); // 2
		borsa.addAttrezzo(attrezzo); // 1
	}

}