Question :

/*
Sort an array A using Merge Sort.
Change in the input array itself. So no need to return or print anything.
Input format :
Line 1 : Integer n i.e. Array size
Line 2 : Array elements (separated by space)
Output format :
Array elements in increasing order (separated by space)
*/

Solution :

public class solution {

	public static void mergeSort(int[] a){
		// Write your code here
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
