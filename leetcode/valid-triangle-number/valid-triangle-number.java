class Solution {
    public int triangleNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=2;i--){
            int j=0,k=i-1;
            while(j<k){
                if(nums[j]+nums[k]>nums[i]){
                    count+=(k-j);
                    k--;
                }
                else j++;
            }
        }
        return count;
    }
}