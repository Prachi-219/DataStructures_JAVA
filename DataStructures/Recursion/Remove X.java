Question :

/*
Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
*/

Solution :


public class solution {

	// Return the changed string
	public static String removeX(String str){
		
        if(str.length()==0) {
			return str;
		}
		String smallOutput=removeX(str.substring(1));
		if(str.charAt(0)=='x') {
			return smallOutput;
		}
		else {
			return str.charAt(0)+smallOutput;
		}

	}
}
