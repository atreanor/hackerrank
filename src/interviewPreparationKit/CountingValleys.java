package interviewPreparationKit;
/*
 * Class reads a String of characters consisting of either 'U' for step up, or 'D' for step down
 * of length n from console. It iterates over the String of characters & counts the number of 
 * valleys traversed & returns to console. 
 */
public class CountingValleys {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {

        // declare variables to assist with checks
        int valleysTraversed = 0; // no. valleys traversed
        int steps = 0; // level of steps

        // iterate over String s
        for (int i = 0; i < s.length(); i++){
            // if character = 'U', increment steps
            if (s.charAt(i) == 'U') {
                steps++;
            }
            else if (s.charAt(i) == 'D'){
                // if steps = 0, increment valleysTraversed
                if (steps == 0){
                    valleysTraversed++;
                }
                steps--; // decrement steps level
            }
        }
        // return result valleyTraversed
        return valleysTraversed;
    }
}