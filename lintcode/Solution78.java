package lintcode;

public class Solution78 {
	/*
     * @param strs: A list of strings
     * @return: The longest common prefix
     */
    public String longestCommonPrefix(String[] strs) {
        // write your code here
    	if(strs==null)
    		return null;
    	if(strs.length==0)
    		return "";
    	if(strs.length==1)
    		return strs[0];
    	String lcp="";
    	//求出前两个元素的最大公共前缀存入lcp
        for(int i=0;i<strs[0].length()&&i<strs[1].length();i++){
        	if(strs[0].charAt(i)==strs[1].charAt(i))
        		lcp+=strs[0].charAt(i);
        	else
        		break;
        }
        for(int i=2;i<strs.length;i++){
        	String temp="";
        	for(int j=0;j<lcp.length()&&j<strs[i].length();j++){
        		if(strs[i].charAt(j)==lcp.charAt(j))
        			temp+=strs[i].charAt(j);
        	}
        	lcp=temp;
        }
        return lcp;
    }
}
