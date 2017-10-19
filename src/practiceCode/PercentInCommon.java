package practiceCode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Mini dating application
// take qualities of two people
// find out what they have in common (preferences)
// create two sets
// find per centages

public class PercentInCommon {

	public static void main(String[] args) {
		
		HashSet<String> likesOfFirstPerson = new HashSet<String>();
		// List of First Person's Likes
		likesOfFirstPerson.add("Italian Food");
		likesOfFirstPerson.add("Jazz");
		likesOfFirstPerson.add("dogs");
		likesOfFirstPerson.add("swimming");
		likesOfFirstPerson.add("children");
		likesOfFirstPerson.add("cooking");
//		System.out.println(likesOfFirstPerson);
		
		// List of Second Person's LIkes
		
		HashSet<String> subSet = new HashSet<String>();
//		HashSet<String> likesOfSecondPerson = new HashSet<String>();
		subSet.add("Italian Food");
		subSet.add("RockNRoll");
		subSet.add("dogs");
		subSet.add("hiking");
		subSet.add("children");
		subSet.add("sports");
		
		
//		Set <String> set = new HashSet <String>(likesOfFSecondPerson);
//		ArrayList<String> secondPersonWithOutDuplicateElements = new ArrayList<String>(set);
		
		
		likesOfFirstPerson.retainAll(subSet);
		System.out.print("Elements in common:");
		
		// prints out stuff in common
		System.out.println(likesOfFirstPerson);
		double commonPerCent;
		double numMatched = likesOfFirstPerson.size();
		double numOfQuestions = 6;
//		System.out.println(numMatched);
		
		// find percentage
		commonPerCent = (numMatched / numOfQuestions) * 100;
	
		System.out.println("Percent in common is: " + commonPerCent);
		
		
	}

}
