package lintcode;

import java.util.Arrays;
import java.util.HashMap;

public class Solution56 {
	/*
     * @param numbers : An array of Integer
     * @param target : target = numbers[index1] + numbers[index2]
     * @return : [index1 + 1, index2 + 1] (index1 < index2)
         numbers=[2, 7, 11, 15],  target=9
         return [1, 2]
     */
    public static int[] twoSum(int[] numbers, int target) {
    	HashMap<Integer,Integer> map=new HashMap<Integer, Integer>();
    	for(int i=0;i<numbers.length;i++){
    		if(map.get(numbers[i])!=null){
    			int[] result={map.get(numbers[i])+1,i+1};
    			return result;
    		}
    		map.put(target-numbers[i], i);
    	}
    	return new int[2];
    }
}
