package interviewPreparationKit;
/*
 * Class counts the number of steps taken to traverse from start to finish of string consisting
 * of 0 or 1s, the user can only step onto position with 0 & step a maximum of two steps forward
 * per move. 
 */
public class JumpingOnClouds {

	public static void main(String[] args) {
		// create integer arrays for testing
		int[] test1 = {0,0,1,0,0,1,0};
		int[] test2 = {0,0,0,1,0,0};
		// test1
		int result1 = jumpingOnClouds(test1);
		System.out.println("expected result: 4 \nActual result: " + result1);
		// test2
		int result2 = jumpingOnClouds(test2);
		System.out.println("expected result: 3 \nActual result: " + result2);

	}
	
	public static int jumpingOnClouds(int[] c) {
		// declare variables
		int jumps = 0; int i=0;
		int len = c.length;
		// iterate over integer array
		while (true) {
			// check if integer at current index +2 = 0 & within range
			if (i+2 < len && c[i+2] == 0) {
				// increment i & jumps
				i+=2; jumps++;
			}
			// check if integer at current index +1 = 0 & within range
			else if (i+1 < len && c[i+1] == 0) {
				i++; jumps++;
			}
			// break true loop
			else {
				break;
			}
		} 
		// return number of jumps taken
		return jumps; 
	}
}
