package lintcode;

public class Solution64 {
	/**
     * @param A: sorted integer array A which has m elements, 
     *           but size of A is m+n
     * @param B: sorted integer array B which has n elements
     * @return: void
     */
    public void mergeSortedArray(int[] A, int m, int[] B, int n) {
        // write your code here
        int pointer=0;
        for(int i=0;i<n;i++){
            while(B[i]>A[pointer]&&pointer<m){
                pointer++;
            }
            for(int j=m;j>pointer;j--){
                A[j]=A[j-1];
            }
            A[pointer]=B[i];
            m++;
        }
    }
}
