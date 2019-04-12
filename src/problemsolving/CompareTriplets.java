package problemsolving;

import java.util.ArrayList;
import java.util.List;

public class CompareTriplets {
	
	static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
		
		// create List<Integer> myList to return result
    	List<Integer> myList = new ArrayList<Integer>();
    	
    	// initialise variables to hold scores 
    	int aScore = 0; int bScore = 0;
    	
    	// iterate over list, if score a > b increment a, else if b > a increment b 
    	for (int i=0; i < a.size(); i++) {
    		if (a.get(i) > b.get(i)) {
    			aScore++;
    		} else if (b.get(i) > a.get(i)){
    			bScore++;
    		} 
    	}
    	// add aScore & bScore to myList
    	myList.add(aScore); myList.add(bScore);
    	
    	// iterate over myList & print scores to console serparated by " "
		for (int k=0; k < myList.size(); k++) {
			System.out.print(myList.get(k) + " ");
		}
		// return resulting List<Integer> myList 
    	return myList;
    }

	public static void main(String[] args) {
		// create test1 & test2 List<Integer> & pass to compareTriplets method
		List<Integer> test1 = new ArrayList<Integer>();
		test1.add(17); test1.add(28); test1.add(30);
		List<Integer> test2 = new ArrayList<Integer>();
		test2.add(99); test2.add(16); test2.add(8);
		
		compareTriplets(test1, test2);

	}

}
