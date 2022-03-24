Question :

/*
Write a recursive function that returns the sum of the digits of a given integer.
Input format :
Integer N
Output format :
Sum of digits of N
*/

Solution :


public class solution {

	public static int sumOfDigits(int input){
			if(input<=0) {
			return input;
		}
		int sum=0;
		int c=input%10;
		int smallOutput=sumOfDigits(input/10);
		sum=c+smallOutput;
        return sum;
	
	}
}
