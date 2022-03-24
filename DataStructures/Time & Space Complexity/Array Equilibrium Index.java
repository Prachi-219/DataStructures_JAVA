Question :

/*
For a given array/list(ARR) of size 'N,' find and return the 'Equilibrium Index' of the array/list.
Equilibrium Index of an array/list is an index 'i' such that the sum of elements at indices [0 to (i - 1)] is equal to the sum of elements at indices [(i + 1) to (N-1)]. One thing to note here is, the item at the index 'i' is not included in either part.
If more than one equilibrium indices are present, then the index appearing first in left to right fashion should be returned. Negative one(-1) if no such index is present.
Example:
Let's consider an array/list Arr = [2, 3, 10, -10, 4, 2, 9]  of size, N = 7.

There exist two equilibrium indices, one at 2 and another at 3.

At index 2, the sum of all the elements to the left, [2 + 3] is 5, and the elements to its right, [-10 + 4 + 2 + 9] is also 5. Hence index 2 is an equilibrium index according to the condition we want to achieve. Mind it that we haven't included the item at index 2, which is 10, to either of the parts.

Similarly, we can see at index 3, the elements to its left sum up to 15 and to the right, sum up to 15 either. 

Since index 2 comes early in the order, left to right, the answer would be 2.
Input Format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the array/list
Output Format :
For each test case, print the 'Equilibrium Index'.

Output for every test case will be printed in a separate line.
*/

Solution :

public class Solution {

	public static int arrayEquilibriumIndex(int[] a){  
		//Your code goes here
        int ls=0, index=0, rs=0;
		int ts=totalSum(a);
		while(index<a.length) {
			rs=ts-ls-a[index];
			if(rs==ls) {
				return index;
			}
			else {
				ls=ls+a[index];
				index++;
			}
			
		}return -1;
		
	}public static int totalSum(int a[]) {
		int ts=0, i=0;
		while(i<a.length) {
			ts+=a[i];
			i++;
		}
		return ts;
	}
}