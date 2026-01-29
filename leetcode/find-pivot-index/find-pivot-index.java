class Solution {
    public int pivotIndex(int[] nums) {
        int idx=-1;
        int left[]=new int[nums.length];
        left[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            left[i]=left[i-1]+nums[i];
        }
        int total = left[nums.length - 1];
        for (int i = 0; i < nums.length; i++) {
            int leftSum = left[i] - nums[i];
            int rightSum = total - left[i];
            if (leftSum == rightSum) {
                return i;
            }
        }
        return -1;
    }
}