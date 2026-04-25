class Solution {
    public int longestSubarray(int[] nums) {
        int length=2;
        int maxLength=0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]==(nums[i-1]+nums[i-2]))length++;
            else length=2;
            maxLength=Math.max(length,maxLength);
        }
        return maxLength;
    }
}