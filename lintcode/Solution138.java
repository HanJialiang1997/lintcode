package lintcode;

import java.util.ArrayList;

public class Solution138 {
	public ArrayList<Integer> subarraySum(int[] nums) {
        // write your code here
        for(int i=0;i<nums.length;i++){
            int sum=nums[i];
            int start=i;
            int point=i;
            while(sum!=0&&point<nums.length-1){
                point++;
                sum+=nums[point];
            }
            int end=point;
            if(sum==0){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(start);
                list.add(end);
                return list;
            }
        }
        return null;
    }

}
