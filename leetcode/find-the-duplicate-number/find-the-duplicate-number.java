class Solution {
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int k=Math.abs(nums[i]);
            if(nums[k-1]>0)nums[k-1]*=-1;
            else return Math.abs(nums[i]);
        }
        return -1;
    }
}