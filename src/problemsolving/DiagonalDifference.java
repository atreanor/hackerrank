package problemsolving;

public class DiagonalDifference {

    static int diagonalDifference(int[][] arr) {
    	
    	// initialize variables to hold diagonal sums, absolute difference & row counters
    	int topDiff = 0; int bottomDiff = 0;
    	int absoluteDiff;
    	int row1 = 0;
    	int row2 = arr.length-1;
    	
    	// iterate top-down & bottom up summing values
    	for (int i=0; i < arr[0].length; i++) {
    		topDiff += arr[row1][i];
    		System.out.println("topDiff : " + topDiff);
    		row1++;
    		bottomDiff += arr[row2][i];
    		System.out.println("bottomDiff : " + bottomDiff);
    		row2--;
    	}
    	
    	// calculate absolute difference between differences
    	if (topDiff > bottomDiff) {
    		absoluteDiff = topDiff - bottomDiff;
    	} else if ( bottomDiff > topDiff) {
    		absoluteDiff = bottomDiff - topDiff;
    	} else {
    		absoluteDiff = 0;
    	}

    	// print result to console & return
    	System.out.println(absoluteDiff);
    	return absoluteDiff;
    }
	
	
	public static void main(String[] args) {
		// create 2D test array
		int[][] test1 = {{1,2,3},
						{4,5,6},
						{7,8,10}};
		
		int[][] test2 = {{11, 2, 4},
						{4, 5, 6},
						{10, 8, -12}};
		diagonalDifference(test1);
		System.out.print("-------------------");
		diagonalDifference(test2);
	}

}
