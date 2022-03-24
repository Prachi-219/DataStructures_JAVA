Question :

/*
You have been given two integer arrays/list(ARR1 and ARR2) of size N and M, respectively. You need to print their intersection; An intersection for this problem can be defined when both the arrays/lists contain a particular value or to put it in other words, when there is a common value that exists in both the arrays/lists.
Note :
Input arrays/lists can contain duplicate elements.

The intersection elements printed would be in the order they appear in the first sorted array/list(ARR1).


Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

The first line of each test case or query contains an integer 'N' representing the size of the first array/list.

The second line contains 'N' single space separated integers representing the elements of the first the array/list.

The third line contains an integer 'M' representing the size of the second array/list.

The fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output format :
For each test case, print the intersection elements in a row, separated by a single space.

Output for every test case will be printed in a separate line.
*/

Solution :

public class Solution {

    public static void intersection(int[] arr1, int[] arr2) { // chutki ka abcd
        sortArray(arr2);
        sortArray(arr1);

        int i = 0, j = 0;
        while(i<arr1.length && j<arr2.length) {
            if(arr1[i] == arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
            else if(arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }

        }
    }

    public static int[] sortArray(int[] arr) {

        mergeSort(arr);

        return arr;
    }

    public static void mergeSort(int a[]){
        if(a.length<=1){
            return;
        }
        int b[]=new int[a.length/2];
        int c[]=new int[a.length-b.length];
        for(int i=0;i<a.length/2;i++){
            b[i]=a[i];
        }
        for(int i=a.length/2;i<a.length;i++){
            c[i-a.length/2]=a[i];
        }
        mergeSort(b);
        mergeSort(c);
        merge(b,c,a);
    }

    public static void merge(int[]s1,int[]s2,int[]d){
        int i=0;
        int j=0;
        int k=0;
        while(i<s1.length && j<s2.length){
            if(s1[i]<=s2[j]){
                d[k]=s1[i];
                i++;
                k++;
            }else{
                d[k]=s2[j];
                k++;
                j++;
            }
        }
        if(i<s1.length){
            while(i<s1.length){
                d[k]=s1[i];
                i++;
                k++;
            }
        }
        if(j<s2.length){
            while(j<s2.length){
                d[k]=s2[j];
                k++;
                j++;
            }
        }
    }
}