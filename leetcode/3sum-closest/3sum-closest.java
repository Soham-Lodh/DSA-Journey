class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=nums[0]+nums[1]+nums[2];
        int err=Math.abs(target-close);
        for(int i=0;i<nums.length-2;i++){
            int tar=(target-nums[i]);
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[left]+nums[right];
                if(sum==tar)return target;
                else if(sum<tar){
                    int val=nums[i]+sum;
                    if(Math.abs(target-val)<err){
                        close=val;
                        err=Math.abs(target-val);
                    }
                    left++;
                }
                else{
                    int val=nums[i]+sum;
                    if(Math.abs(target-val)<err){
                        close=val;
                        err=Math.abs(target-val);
                    }
                    right--;
                }
            }
        }
        return close;
    }
}