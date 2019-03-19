package interviewPreparationKit;
/*
 * Class to test SockMerchant method 
 */
public class TestSockMerchant {

	public static void main(String[] args) {
		// create test integer arrays, array length & expected result
		// test1 - expected result: 3
		int[] test1 = {1,0,2,0,0,0,1,0,1};
		int len1 = 9;
		
		// test2 - expected result: 5
		int[] test2 = {2,0,1,2,2,2,1,0,1,2,1};
		int len2 = 11;
		
		// invoke sockMerchant with test parameters
		int actResult1 = SockMerchant.sockMerchant(len1, test1);
		int actResult2 = SockMerchant.sockMerchant(len2, test2);
		
		// print expected & actual results to console
		System.out.println("Test 1 expected result: 3 \nTest 1 actual result: " + actResult1);
		System.out.println("Test 2 expected result: 5 \nTest 2 actual result: " + actResult2);
	}

}
