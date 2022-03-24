Question :

/*
You have been given a random integer array/list(ARR) of size N. Write a function that rotates the given array/list by D elements(towards the left).
*/

Solution :

public class Solution {  

    public static void rotate(int[] arr, int d) {
    	int n  = arr.length;
		// temporary array
		int[] tempArrayD = new int[d];
		for(int i = 0;i<d;i++) {
			tempArrayD[i] = arr[i];
		}
		
		// Now rotate array
		for(int i = 0;i<n-d;i++) {
			arr[i] = arr[i+d];
		}
		int count = 0;
		// Now add tempArrayD to main Array
		for(int i = (n - d);i<n;i++) {
			arr[i] = tempArrayD[count];
			count = count + 1;
		}
    }

}