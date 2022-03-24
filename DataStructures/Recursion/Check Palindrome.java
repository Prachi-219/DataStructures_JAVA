Question :

/*
Check whether a given String S is a palindrome using recursion. Return true or false.
Input Format :
String S
Output Format :
'true' or 'false'
*/

Solution :


public class solution {

    public static boolean isStringPalindrome(String str) {
        // Write your code here
        int i=0;
        int j=str.length()-1;
        while(i<=j) {
            if(str.charAt(i)!=str.charAt(j)) {
                return false;
            }
            else {
                i++;
                j--;
            }
        }return true;
    }
}
