package interviewPreparationKit;


/*
 * Class to test RepeatedString
 */
public class TestRepeatedString {

	public static void main(String[] args) {
		// test repeatedString method 
		String test1 = "aba";
		String test2 = "a";
		// test1
		long result1 = RepeatedString.repeatedString(test1, 10);
		System.out.println("Expected result: 7 \nActual result: " + result1);
		//test2
		long result2 = RepeatedString.repeatedString(test2, 1000000000000L);
		System.out.println("Expected result: 1000000000000 \nActual result: " + result2);

	}

}
