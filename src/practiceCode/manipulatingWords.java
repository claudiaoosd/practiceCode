package practiceCode;

import java.util.ArrayList;

// Create an array list with few words, 
// print the the list of words 
// and then remove words and print an empty list.

public class manipulatingWords {

	public static void main(String[] args) {
		// create the arraylist called funWords		
		ArrayList<String> funWords = new ArrayList<String>();
		
		// add words to array list
		
		funWords.add("supercalifragilisticexpialidocious");
		funWords.add("widdershins");
		funWords.add("collywobbles");
		funWords.add("gubbins");
		funWords.add("bumfuzzle");
		funWords.add("cattywampus");
		funWords.add("gardyloo");
		funWords.add("taradiddle");
		funWords.add("snickersnee");
		
		// print out array list
		
		System.out.println("List of Fun Words: "+ funWords);
			
		// remove all the words and print empty list
//		funWords.removeAll(c)
		funWords.clear();
		System.out.println("Should be an empty List of Fun Words: "+ funWords);
	}

}
