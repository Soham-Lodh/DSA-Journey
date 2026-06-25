class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        int ck=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            if(nums[i]==target){
                count++;
                ck++;
            }
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]==target)count++;
                if(count>((j-i+1)/2))ck++;
            }
        }
        return ck;
    }
}