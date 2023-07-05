package domanda_4;

// OK

/*
 * Scrivere il metodo che aggiorna lo stato di un conto corrente, modificando la data dell'ultimo
 * versamento e aggiungendo l'importo del versamento al totale del conto corrente.
 */

public class ContoCorrente {

	private String dataUltimoVersamento;
	private int totale;
	
	public ContoCorrente(String dataUltimoVersamento, int totale) {
		this.dataUltimoVersamento = dataUltimoVersamento;
		this.totale = totale;
	}
	
	public void deposita(String data, int versamento) {
		
		this.dataUltimoVersamento = data;
		this.totale += versamento;
	}
	
	public String getDataUltimoVersamento() {
		return dataUltimoVersamento;
	}
	
	public int getTotale() {
		return totale;
	}
	
	public static void main(String[] args) {
		
		ContoCorrente cc = new ContoCorrente("03/09/1994", 40000);
		
		cc.deposita("11/06/2023", 12378);
		System.out.println("Data ultimo versamento: "+cc.getDataUltimoVersamento()+" Totale: "+cc.getTotale());
		
		cc.deposita("14/06/2023", 1000);
		System.out.println("Data ultimo versamento: "+cc.getDataUltimoVersamento()+" Totale: "+cc.getTotale());
		
	}

}
