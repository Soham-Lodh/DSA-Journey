class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2)return 0;
        int dif=Integer.MIN_VALUE;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            dif=Math.max(dif,(nums[i]-nums[i-1]));
        }
        return dif;
    }
}