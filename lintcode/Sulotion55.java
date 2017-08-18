package lintcode;

import java.util.ArrayList;

public class Sulotion55 {
	public boolean compareStrings(String A, String B) {
        // write your code here
        if(A.length()<B.length())
        	return false;
        char[] a=A.toCharArray();
        char[] b=B.toCharArray();
        ArrayList<Character> aa=new ArrayList<>();
        ArrayList<Character> bb=new ArrayList<>();
        for(int i=0;i<a.length;i++){
        	aa.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
        	bb.add(b[i]);
        }
        while(bb.size()!=0){
        	int flag=0;
        	for(int i=0;i<aa.size();i++){
        		if(bb.get(0).equals(aa.get(i))){
        			bb.remove(0);
        			aa.remove(i);
        			System.out.println(bb);
        			System.out.println(aa);
        			flag=1;
        			break;
        		}
        	}
        	if (flag==0)
        		return false;
        }
        return true; 
    }
}
