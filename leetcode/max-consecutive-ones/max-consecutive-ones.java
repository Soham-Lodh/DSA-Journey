class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ms=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                if(count>ms){
                    ms=count;
                }
            }
           else count=0;
        }
        return ms;
    }
}