Question : 

/*Given an array of length N and an integer x, you need to find and return the first index of integer x present in the array. Return -1 if it is not present in the array.
First index means, the index of first occurrence of x in the input array.
Do this recursively. Indexing in the array starts from 0.
Input Format :
Line 1 : An Integer N i.e. size of array
Line 2 : N integers which are elements of the array, separated by spaces
Line 3 : Integer x
Output Format :
first index or -1
*/

Solution : 



public class Solution {

	public static int firstIndex(int a[], int x) {
		   if(a.length==0){
            return -1;
        }
        if(a[0]==x){
            return 0;
        }
        int smallArray[]=new int[a.length-1];
        for(int i=1;i<a.length;i++){
            smallArray[i-1]=a[i];
        }
        int fi=firstIndex(smallArray,x);
        if(fi==-1){
            return -1;
        }else{
            return fi+1;
        }
	}
	
}