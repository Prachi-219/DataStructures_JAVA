Question :

/*
Write a recursive function to convert a given string into the number it represents. That is input will be a numeric string that contains only numbers, you need to convert the string into corresponding integer and return the answer.
Input format :
Numeric string S (string, Eg. "1234")
Output format :
Corresponding integer N (int, Eg. 1234)
*/

Solution :


public class solution {

	public static int convertStringToInt(String a){

        	if(a.length()<=0) {
			return 0;
		}
		int number=Integer.parseInt(a);
		return number;
	}
}
