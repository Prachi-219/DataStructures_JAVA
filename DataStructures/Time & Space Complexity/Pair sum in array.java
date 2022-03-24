Question :

/*
You have been given an integer array/list(ARR) and a number 'num'. Find and return the total number of pairs in the array/list which sum to 'num'.
*/

Solution :

public class Solution {	

    public static int pairSum(int[] arr, int x) {
        //Your code goes here
        int n=arr.length;
        int count=0;
        int j=0;
        for(int i=j-1;i<n-1 && j<n;i++) {
            // for(int j=i+1;j<n;j++) {
            
            if(i==-1){
                return -1;
            }
            if(arr[i]+arr[j]==x) {
                count=count+1;
                j++;
            }
            //				System.out.println("("+arr[i]+ "," +arr[j]+")");
        }return count;
    }

}
