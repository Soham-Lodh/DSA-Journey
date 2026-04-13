class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int target_idx=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                target_idx=Math.min(Math.abs(i-start),target_idx);
            }
        }
        return target_idx;
    }
}