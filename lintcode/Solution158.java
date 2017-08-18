package lintcode;

import java.util.ArrayList;

public class Solution158 {
	 /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
    public boolean anagram(String s, String t) {
        // write your code here
        if(s.length()!=t.length())
        	return false;
        char[] a=s.toCharArray();
        char[] b=t.toCharArray();
        ArrayList<Character> ss=new ArrayList<>();
        ArrayList<Character> tt=new ArrayList<>();
        for(int i=0;i<a.length;i++){
        	ss.add(a[i]);
        	tt.add(b[i]);
        }
        while(ss.size()!=0){
        	int flag=0;
        	for(int j=0;j<tt.size();j++){
        		if(ss.get(0).equals(tt.get(j))){
        			ss.remove(0);
        			tt.remove(j);
        			flag=1;
        		}
        	}
        	if (flag==0)
        		return false;
        }
        return true;   
    }
}
