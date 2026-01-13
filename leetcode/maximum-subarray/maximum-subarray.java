class Solution {
    public int maxSubArray(int[] nums) {
        int cs=0;
        int ms=0;
        for(int i=0;i<nums.length;i++){
            cs+=nums[i];
            if(cs<0)cs=0;
            if(cs>ms)ms=cs;
        }
        if(ms==0){
            ms=nums[0];
            for(int i=0;i<nums.length;i++){
                if(nums[i]>ms)ms=nums[i];
            }
            return ms;
        }
        return ms;
    }
}