package interviewPreparationKit;

import java.util.HashSet;
import java.util.Set;


public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        // variable to count the number of pairs
        int pairs = 0;

        // create a set to hold unique types of socks
        Set<Integer> uniqueSocks = new HashSet<>();

        // iterate over sock array, if sock exists in set increment pairs &
        // remove from set, else add sock to set & continue with iteration
        for (int j = 0; j < ar.length; j++) {
            if (uniqueSocks.contains(ar[j])) {
                pairs++;
                uniqueSocks.remove(ar[j]);
            } 
            else {
                uniqueSocks.add(ar[j]);
            }
        }
        // return count of pairs of socks
        return pairs;
    }

}
