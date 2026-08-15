class Solution {
    public int longestSubsequence(int[] nums) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)c++;
        }
        if(c==nums.length)return 0;
        int total=nums[0];
        for(int i=1;i<nums.length;i++)total^=nums[i];
        return total==0?nums.length-1:nums.length;
    }
}