package prova13;

import java.util.*;
public class Quiz {
    public static void main(String[] argv) {
        Map<Integer,String> matricola2agente;
        matricola2agente = new HashMap<Integer,String>();

        matricola2agente.put(400, "Rossi");
        matricola2agente.put(222 , "Carli");
        matricola2agente.put(400 , "Loschi");	// Loschi lo sovrascrive al primo Rossi
        matricola2agente.put(500 , "Rossi");

        List<Integer> ll = new LinkedList<Integer>(matricola2agente.keySet());
        Collections.sort(ll);
        Iterator<Integer> i = ll.iterator();
        while (i.hasNext())
            System.out.print(matricola2agente.get(i.next())+" ");
    }
}