class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length;
        int mid = low + (high - low) / 2;
        while(low<high){
            mid = low + (high - low) / 2;
            if(nums[mid]==target)return mid;
            else if(nums[mid]<target)low=mid+1;
            else high=mid-1;
        }
        if(mid-1>=0 && nums[mid]>target && target>nums[mid-1])return mid;
        if(low+1<nums.length && nums[low+1]>target && target>nums[low])return low+1;
        return low;
    }
}