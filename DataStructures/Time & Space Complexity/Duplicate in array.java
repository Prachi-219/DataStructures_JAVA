Question :

/*
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3, and among these, there is a single integer value that is present twice. 
You need to find and return that duplicate number present in the array.
*/

Solution :

public class Solution {

    public static int findDuplicate(int[] arr) {
        int tempArr[] = new int[arr.length];
        for(int i = 0;i<arr.length;i++) {
            
            tempArr[arr[i]] = tempArr[arr[i]]  + 1;
        }

        for(int i = 0;i<tempArr.length;i++) {
            if(tempArr[i] != 1) {
                return i;
            }
        }
        return -1;	}
}
