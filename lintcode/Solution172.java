package lintcode;

public class Solution172 {
	public int removeElement(int[] A, int elem) {
		if(A.length==0)
            return 0;
        int flag=A.length-1;
        int i=0;
        while(i<=flag){
            if(A[i]==elem){
                A[i]=A[flag];
                flag--;
            }
            else{
                i++;
            }
        }
        return flag+1;
	}
}
