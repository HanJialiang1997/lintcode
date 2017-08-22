package lintcode;

public class Solution189 {
	 /*
     * @param A: An array of integers
     * @return: An integer
     */
    public int firstMissingPositive(int[] A) {
        // write your code here
    	int[] B=new int[A.length+2]; 
    	for(int i=0;i<B.length;i++){
    		B[i]=0;
    	}
    	for(int i=0;i<A.length;i++){
    		if(A[i]>0&&A[i]<A.length){
    			B[A[i]]=A[i];
    		}
    	}
    	for(int i=1;i<B.length;i++){
    		if(B[i]==0)
    			return i;
    	}
        return 0;
    }
}
