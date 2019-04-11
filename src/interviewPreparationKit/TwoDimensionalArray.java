package interviewPreparationKit;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDimensionalArray {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        // create an ArrayList myList to hold hour glass integer sums
        List<Integer> myList = new ArrayList<Integer>();        
        
        // int variable count to store hour glass sum values before adding to myList
        int count;
        
        // nested loop iterates over 2D array, 2 positions from end of column &
        // 2 positions from end of row
        for (int i =0; i < arr.length-2;i++) {
        	for (int j= 0; j < arr[i].length-2;j++) {
                count = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] 
                		+ arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                
                // add hour glass count to myList
                myList.add(count);
                
                // print to console for testing
                //System.out.println(count);
                
                // reset count for next hour glass count 
                count = 0;
        	}
        }
        // maxInt initialised to first integer in myList
        int maxInt = myList.get(0);
        
        // iterate over myList of hour glass sums & return the maximum integer
        for (int i: myList){
            if (i > maxInt) maxInt = i;
        } 
        System.out.println(maxInt);
        return maxInt;
    }


    public static void main(String[] args) {
    	int[][] test = {{1, 1, 1, 0, 0, 0},
    		    {0, 1, 0, 0, 0, 0},
    		    {1, 1, 1, 0, 0, 0},
    		    {0, 0, 2, 4, 4, 0},
    		    {0, 0, 0, 2, 0, 0},
    		    {0, 0, 1, 2, 4, 0}};
    	int[][] test1 = {{-1, -1, 0, -9, -2, -2},
    		    {-2, -1, -6, -8, -2, -5},
    		    {-1, -1, -1, -2, -3, -4},
    		    {-1, -9, -2, -4, -4, -5},
    		    {-7, -3, -3, -2, -9, -9},
    		    {-1, -3, -1, -2, -4, -5}};
    	
    	hourglassSum(test);
    	System.out.println("________________________________________________");
    	hourglassSum(test1);
    }

}