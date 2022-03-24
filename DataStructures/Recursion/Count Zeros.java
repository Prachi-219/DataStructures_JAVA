Question :

/*
Given an integer N, count and return the number of zeros that are present in the given integer using recursion.
Input Format :
Integer N
Output Format :
Number of zeros in N
*/

Solution :


public class solution {

	public static int countZerosRec(int num){
		// Write your code here4
		if (number == 0) {
		return 1;
		} else if (number <= 9) {
		return 0;
		} else {
		return ((number % 10 == 0) ? 1 : 0) + countZerosRec(number / 10);
		}