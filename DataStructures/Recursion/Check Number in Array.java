Question :

/*Given an array of length N and an integer x, you need to find if x is present in the array or not. Return true or false.
Do this recursively.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
'true' or 'false'
*/

Solution :

public class Solution {

    public static boolean checkNumber(int input[], int x) {

        if(input.length==1 && x!=input[input.length-1]) {
            return false;
        }
        if(x==input[0]) {
            return true;
        }
        int smallArray[]=new int[input.length-1];
        for(int i=1;i<input.length;i++) {
            smallArray[i-1]=input[i];
        }
        boolean isSmallArrayHasX=checkNumber(smallArray, x);
        return isSmallArrayHasX;
    }
}