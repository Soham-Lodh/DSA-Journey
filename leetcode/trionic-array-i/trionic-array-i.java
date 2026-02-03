class Solution {
    public boolean isTrionic(int[] nums) {
        int p=0,q=0,r=0,i=1;
        while(i<nums.length && nums[i]>nums[i-1]){
            p++;
            i++;
        }
        while(i<nums.length && nums[i]<nums[i-1]){
            q++;
            i++;
        }
        while(i<nums.length && nums[i]>nums[i-1]){
            i++;
            r++;
        }
        if(p==0 || q==0 || r==0 || p+q+r<nums.length-1 )return false;
        return true;
    }
}