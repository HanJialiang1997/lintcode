package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution57 {
	/*
     * @param numbers: Give an array numbers of n integer
     * @return: Find all unique triplets in the array which gives the sum of zero.
     */
    public List<List<Integer>> threeSum(int[] numbers) {
        // write your code here
    	List<List<Integer>> result=new ArrayList<List<Integer>>();
    	Arrays.sort(numbers);
    	for(int i=0;i<numbers.length;i++){
    		int start=i+1;
    		int end=numbers.length-1;
    		while(start<end){
    			if(numbers[i]+numbers[start]+numbers[end]==0){
    				List<Integer> list=new ArrayList<>();
    				list.add(numbers[i]);
    				list.add(numbers[start]);
    				list.add(numbers[end]);
    				result.add(list);
    			}
    			if(numbers[i]+numbers[start]+numbers[end]>0){
    				end--;
    			}
    			else
    				start++;
    		}
    	}
    	return result;
    }
}
