class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int maxLen=1;
        int len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                len++;
                maxLen=Math.max(maxLen,len);
            }
            else{
                len=1;
            }
        }
        len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                len++;
                maxLen=Math.max(maxLen,len);
            }
            else{
                len=1;
            }
        }
        return maxLen;
    }
}