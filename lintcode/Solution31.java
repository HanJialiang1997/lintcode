package lintcode;

public class Solution31 {
	/*
     * @param nums: The integer array you should partition
     * @param k: An integer
     * @return: The index after partition
     */
    public int partitionArray(int[] nums, int k) {
        // write your code here
    	int start=0;
    	int end=nums.length-1;;
    	while(start<=end){
    		if(nums[start]>=k){
    			int temp=nums[start];
    			nums[start]=nums[end];
    			nums[end]=temp;
    			end--;
    		}
    		else{
    			start++;
    		}
    	}
    	int result=0;
    	for(int i=0;i<end+1;i++){
    		if(nums[i]<k){
    			result++;
    		}
    	}
    	return result;
    }
}
