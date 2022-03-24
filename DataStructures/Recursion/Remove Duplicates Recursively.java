Question :

/*
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
*/

Solution :

public class Solution {

    public static String removeConsecutiveDuplicates(String str) {
        if(str.length()<=1) {
            return str;
        }

        String smallOutput=removeConsecutiveDuplicates(str.substring(1));
        if(str.charAt(0)==str.charAt(1)) {

            return smallOutput;
        }
        else {

            return str.charAt(0)+smallOutput;
        }
    }

}