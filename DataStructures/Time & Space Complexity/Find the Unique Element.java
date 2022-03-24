Question :

/*
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].
Now, in the given array/list, 'M' numbers are present twice and one number is present only once.
You need to find and return that number which is unique in the array/list.
*/

Solution :

public class Solution {

    public static int findUnique(int[] arr) {
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int tempArr[] = new int[max + 1];
        for(int i = 0;i<arr.length;i++) {
            tempArr[arr[i]] = tempArr[arr[i]]  + 1;
        }

        for(int i = 0;i<tempArr.length;i++) {
            if(tempArr[i] == 1) {
                return i;
            }
        }
        return -1;	}
}
