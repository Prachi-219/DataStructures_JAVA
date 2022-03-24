Question :

/*
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
*/

Solution:


public class Solution {

	public static String replaceCharacter(String str, char c1, char c2) {
		if(str.length()==0) {
			return str;
		}
		String smallOutput=replaceCharacter(str.substring(1), c1, c2);
		if(str.charAt(0)==c1) {
			return c2 + smallOutput;
		}
		else {
			return str.charAt(0)+smallOutput;
		}

	}
}
