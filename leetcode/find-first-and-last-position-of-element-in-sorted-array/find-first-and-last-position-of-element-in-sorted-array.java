class Solution {
    public int[] searchRange(int[] nums, int target) {
        int []ans = {-1,-1};
        ans[0] = firstIndex(nums,target);
        ans[1] = lastIndex(nums,target);
        return ans;
    }
    private int firstIndex(int []nums,int target)
    {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]==target)
            {
                ans = mid;
                high = mid - 1;
            }
            else if(nums[mid]<target)
            {
                low = mid + 1;

            }
            else
            {
                high = mid - 1;
            }
        }
        return ans;
    }
    private int lastIndex(int []nums,int target)
    {
        int ans = -1;
        int low = 0;
        int high = nums.length - 1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(nums[mid]==target)
            {
                ans = mid;
                low = mid + 1;
            }
            else if(nums[mid]<target)
            {
                low = mid + 1;

            }
            else 
            {
                high = mid - 1;
            }
        }
        return ans;
    }
}