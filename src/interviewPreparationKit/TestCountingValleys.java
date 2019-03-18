package interviewPreparationKit;

// import junit libraries for testing
import static org.junit.Assert.*;
import org.junit.Test;

/*
 * Class to test countingValleys method
 */
public class TestCountingValleys {
	
	@Test
	public void testCountingValleys() {
		// create arrays to use as arguments
		String str1	= "UDDDUDUU";
		int num1 = 8;
		String str2 = "DDUUDDUDUUUD";
		int num2 = 12;
		
		// instantiate CountingValleys & call counting valleys method
		int result1 = CountingValleys.countingValleys(num1, str1);
		int result2 = CountingValleys.countingValleys(num2, str2);
		
		// print expected & actual results to console
		System.out.println("test1 expected:  1 \ntest1 actual: " + result1);
		System.out.println("test2 expected: 2 \ntest2 actual: " + result2);
		
		// assert expected result equals actual result
		assertEquals(1, result1);
		assertEquals(2, result2);
	}

}
