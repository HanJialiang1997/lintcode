package lintcode;

import java.util.ArrayList;
import java.util.List;

public class Solution50 {
	/*
     * @param nums: Given an integers array A
     * @return: A long long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... * A[n-1]
     */
    public List<Long> productExcludeItself(List<Integer> nums) {
        // write your code here
        List<Long> result=new ArrayList<>();
        if (nums.size()==1||nums.size()==0||nums==null)
        	return result;
        for(int i=0;i<nums.size();i++){
            long elem=1;
            for(int j=0;j<nums.size();j++){
                if(i!=j)
                    elem*=nums.get(j);
            }
            result.add(elem);
        }
        return result;
    }
}
