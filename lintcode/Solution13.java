package lintcode;

public class Solution13 {
	    /**
	     * Returns a index to the first occurrence of target in source,
	     * or -1  if target is not part of source.
	     * @param source string to be scanned.
	     * @param target string containing the sequence of characters to match.
	     */
	    public int strStr(String source, String target) {
	        // write your code here
	        if(target==null||source==null)
	            return -1;
	        if(target.length()==0)
	            return 0;
	        int i=0;
	        while(i<source.length()){
	            int j=0;
	            int tempI=i;
	            while(j<target.length()&&tempI<source.length()){
	                if(source.charAt(tempI)==target.charAt(j)){
	                    tempI++;
	                    j++;
	                    continue;
	                }
	                break;
	            }
	            if(j==target.length())
	                return i;
	            else 
	                i++;
	        }
	        return -1;
	    }	
}
