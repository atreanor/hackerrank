package interviewPreparationKit;

/*
 * Class to count the instances of 'a' in a string. The string is constructed from an input
 * string, which is repeated until it has the length of 'n' inputed as a parameter.
 */

public class RepeatedString {

    public static long repeatedString(String s, long n) {
    	// declare variables to store 'a' counts, string length & a holder 
        long substrCount = 0;
        long strCount = 0;
        long length = s.length();
        long holder = 0;
        
        // iterate over string s counting instances of 'a'
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'a') {
                strCount++;
            }
        }
        
        // divide n by string length, assign result to holder
        holder = n / length;
        
        // multiple holder by strCount to get total instances of 'a'
        substrCount = holder * strCount;
        
        // n % length equals the length of remaining string
        holder = n % length;
        
        // iterate over the remaining string to get remaining instances of 'a'
        for (int i = 0; i < holder; i++){
            if (s.charAt(i) == 'a'){
                substrCount++; // increment total substrCount
            }
        }
        // return total number of instances of 'a'
        return substrCount;
    }
}
