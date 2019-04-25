package problemsolving;

import java.util.Arrays;



public class MiniMaxSum {
	
	static void miniMaxSum(int[] arr) {
		
		// sort arr using java.util.Arrays.sort in ascending order
		Arrays.sort(arr);
		
		// sum min & max integers, cast result to long to avoid integer overflow
		long minSum = (long)arr[0] + arr[1] + arr[2] + arr[3];
		long maxSum = (long)arr[1] + arr[2] + arr[3] + arr[4];
		
		// print result to console
        	System.out.println(minSum + " " + maxSum);
	}


	public static void main(String[] args) {
		int[] test1 = {19999999, 2, 3, 4, 5};
		int[] test2 = {256741038, 623958417, 467905213, 714532089, 938071625};
		miniMaxSum(test1); 
		miniMaxSum(test2);
	}	
}
