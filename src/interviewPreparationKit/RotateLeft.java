package interviewPreparationKit;

public class RotateLeft {

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
    	// create newArray to store new order of elements
    	int[] newArray = new int[a.length];
    	
    	// variable to store index from which point the newArray will begin
    	int index = 0;
    	
    	// iterate over array to define the index at which to start newArray
    	for (int i=0; i <= d; i++) {
    		if (i == a.length+1) {
    			i = 0;
    			index = i;
    		} else {
    			index = i;
    		}
    	}
    	
    	// print index to start newArray from to consoel for reference
    	System.out.println("Final starting index position: "+ index);
    	
    	// iterate over array from a[index], adding elements to newArray from newArray[0]
    	for (int j=0; j < a.length; j++) {
    		if (index == a.length) {
    			index = 0;
    			newArray[j] = a[index];
    			index++;
    		} else {
    			newArray[j] = a[index];
    			index++;
    		}
    	}
    	
    	// print newArray to consoel with each element separated by " "
    	for (int k: newArray) {
    		System.out.print(k + " ");
    	}
    	
    	// return rotated left newArray
        return newArray;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] test = {1, 2, 3, 4, 5};
		rotLeft(test, 4);

	}

}
