Question :

/*
Given a string S, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*".
Input format :
String S
Output format :
Modified string
*/

Solution :


public class solution {

	// Return the updated string
	public static String addStars(String str) {
		// Write your code here

        if(str.length()<=1) {
		return str;
	}
	String smallOutput=addStars(str.substring(1));
	if(str.charAt(0)==str.charAt(1)) {
		return str.charAt(0)+"*" + smallOutput;
	}
	else {
		return str.charAt(0)+smallOutput;
	}
	}
}
