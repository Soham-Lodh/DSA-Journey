class Solution {
    public int minimumCost(int[] nums) {
        if(nums.length==3){
            int sum=0;
            for(int i=0;i<nums.length;i++)sum+=nums[i];
            return sum;
        }
        int sum=nums[0];
        int min=Integer.MAX_VALUE;
        int min1_idx=0;
        for(int i=1;i<nums.length-1;i++){
            if(nums[i]<min){
                min1_idx=i;
                min=nums[i];
            }
        }
        sum+=min;
        min=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(i!=min1_idx)min=Math.min(min,nums[i]);
        }
        sum+=min;
        return sum;
    }
}