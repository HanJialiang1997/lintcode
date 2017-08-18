package lintcode;

public class Solution79 {
    /**
     * @param A, B: Two string.
     * @return: the length of the longest common substring.
     */
    public int longestCommonSubstring(String A, String B) {
        // write your code here
    	String longestStr="";
    	int longest=0;
    	for(int i=0;i<A.length();i++){
    		for(int j=0;j<B.length();j++){
    			int length=0;
        		String tempStr="";
    			int ii=i;
    			int jj=j;
    			while(ii<A.length()&&jj<B.length()&&A.charAt(ii)==B.charAt(jj)){
    				//System.out.println("ii="+ii+" jj="+jj);
    				length+=1;
    				tempStr+=A.charAt(ii);
    				ii++;
    				jj++;
    			}
    			if(length>longest){
    				longest=length;
    				longestStr=tempStr;
    			}
    		}
    	}
    	System.out.println(longestStr);
    	return longest;
    }
}
