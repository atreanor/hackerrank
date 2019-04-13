package problemsolving;

/*
 * VeryBigSum class contains method aVeryBigSum that calculates the sum of numbers in an array,
 * prints & returns resulting sum.
 */
public class VeryBigSum {
	
    static long aVeryBigSum(long[] ar) {
    	
    	// intialise variable to hold sum 
    	long sum = 0;
    	
    	// iterate over array summing values
    	for (int i = 1; i < ar.length; i++) {
    		sum += ar[i];
    	}
    	
    	// print result to console & return result
    	System.out.println(sum);
    	return sum;
    }

	public static void main(String[] args) {
		// create test list
		long[] test1 = {5, 1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
		
		// invoke aVeryBigSum passing test1 long array as parameter
		aVeryBigSum(test1);
	}

}
