package domanda_2;

public class Quiz {
	
    public static void main(String[] args) {
    	
        Dinosauro a = new Tirannosauro();
        Dinosauro b = new Dinosauro();
		
        a.verso(); // a dinamico Tirannosauro -> OP: ROOOOAR!!!!
        b.verso(); // b dinamico Dinosauro -> OP: ROAR!
    }
}
