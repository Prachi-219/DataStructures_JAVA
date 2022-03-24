Question :

/*
Given two integers M & N, calculate and return their multiplication using recursion. You can only use subtraction and addition for your calculation. No other operators are allowed.
Input format :
Line 1 : Integer M
Line 2 : Integer N
Output format :
M x N
*/

Solution :

public class solution {

    public static int multiplyTwoIntegers(int m, int n){
        if(n == 0) {
            return 0;
        }
        else if (n == 1) {
            return m;
        }

        int smallOutput = multiplyTwoIntegers(m, n - 1);
        if(smallOutput >=1) {
            return m + smallOutput;
        }
        else {
            return 0;
        }	
    }
}
