package d_LinkedList;

import java.util.List;
import java.util.LinkedList;

public class Principale {

	public static void main(String[] args) {
		
		final List<String> myList = new LinkedList<>();
		
		myList.add("Giacomo");
		myList.add("Elsa");
		myList.add("Matteo");
		myList.add("Sara");
		
		for(String iteratore : myList) {
			System.out.println(iteratore);
		}
		
		/*
		 * 
		 * LISTA
		 *  __
		 * |__|-------->:LINKEDLIST
		 * 			      _____        :Node
		 * 				 |     |	   ______       ______
		 * 				 |first|----> |next* |---->|next* |
		 *				 |_____|	  |valure|     |valure|
		 *							  |___|__|     |___|__|
		 *								  |			   |
		 *								  |            |
		 *								  v            v
		 *							   :String        :String
		 *							   __________      _________
		 *							  |nome: " " |    |nome: " "|
		 *							  |__________|    |_________|
		 */
	}

}
