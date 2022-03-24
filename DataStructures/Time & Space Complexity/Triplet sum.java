Question :

/*
You have been given a random integer array/list(ARR) and a number X. Find and return the triplet(s) in the array/list which sum to X.
*/

Solution :

import java.util.*;
public class Solution {

public static int tripletSum(int[] input, int num) {

        Arrays.sort(input);
        int n = input.length;
       
        int numTriplets = 0;
       
        for (int i=0; i<n; i++) {
            int pairSum = num - input[i];
            int numPairs = 0;
           
            int start = i + 1;
            int stop = n - 1;
             
             while (start < stop) {
                if (input[start] + input[stop] < pairSum) {
                    start++;
                } else if (input[start] + input[stop] > pairSum) {
                    stop--;
                } else {
                   if (input[start] == input[stop]) {
                       int totalCount = (stop - start) + 1;
                       numPairs += (totalCount * (totalCount - 1) / 2);
                       break;
                   }
                   
                    int tempI = start + 1;
                    int tempJ = stop - 1;
                   
                    while (tempI <= tempJ && input[start] == input[tempI]) {
                        tempI++;
                    }
                   
                    while (tempI <= tempJ && input[stop] == input[tempJ]) {
                        tempJ--;
                    }
                   
                    int totalElementFromStart = (tempI - start);
                    int totalElementFromEnd = stop - tempJ;
                   
            numPairs += (totalElementFromStart * totalElementFromEnd);
                   
                    start = tempI;
                    stop = tempJ;
                }
            }
            numTriplets += numPairs;
        }
        return numTriplets;
    }
 
}
