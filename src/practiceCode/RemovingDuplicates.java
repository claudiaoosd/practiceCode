package practiceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//Given a list with duplicate elements for example the list shown below, 
//return a list without duplicate elements.
//Hint: convert list to another class in collections 
//framework that does not all duplicate elements
//ArrayList<String> listWithDuplicateElements = new ArrayList<String>();
//listWithDuplicateElements.add("JAVA");
//listWithDuplicateElements.add("J2EE");
//listWithDuplicateElements.add("JSP");
//listWithDuplicateElements.add("SERVLETS");
//listWithDuplicateElements.add("JAVA");
//listWithDuplicateElements.add("STRUTS");
//listWithDuplicateElements.add("JSP");

public class RemovingDuplicates {

	public static void main(String[] args) {
		ArrayList<String> listWithDuplicateElements = new ArrayList<String>();

		// populate list
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("J2EE");
		listWithDuplicateElements.add("JSP");
		listWithDuplicateElements.add("SERVLETS");
		listWithDuplicateElements.add("JAVA");
		listWithDuplicateElements.add("STRUTS");
		listWithDuplicateElements.add("JSP");
// print list as is
		
		System.out.println("Original List: "+ listWithDuplicateElements);
// convert list removing duplicates
		Set <String>  set = new HashSet <String>(listWithDuplicateElements);
		
		ArrayList<String> listWithOutDuplicateElements = new ArrayList<String>(set);
		
		System.out.println("Modified List: "+ listWithOutDuplicateElements);
		System.out.println("Printed using set: " + set);
		
	}

}



