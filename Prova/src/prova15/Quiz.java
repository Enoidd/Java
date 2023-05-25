package prova15;
import java.util.*;

public class Quiz {
    public static void main(String[] args) {
        Set< Persona > persone = new TreeSet<>();
        
        Persona p1 = new Persona("Simone", 20);
        Persona p2 = new Persona("Marta", 18);
        Persona p3 = new Persona("Simone", 19);
        Persona p4 = new Persona("Simona", 29);
        
        
        persone.add(p1);
        persone.add(p2);
        persone.add(p3);
        
        System.out.println(persone.size());
        
        Persona[] persone1 = new Persona[10];
        
        p1.aggiungiNome("Carlo", 12);
        p2.aggiungiNome("Sandro", 13);
        p3.aggiungiNome("Paolo", 14);
        p4.aggiungiNome("Carla", 15);
        
//        System.out.println("Duplicati trovati: "+ nomi.);
    }
}