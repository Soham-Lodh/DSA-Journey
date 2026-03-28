class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int val=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int j=i+1;
                while(j<nums.length){
                    if(nums[j]==2){
                        val=Math.min(val,Math.abs(i-j));
                        break;
                    }
                    j++;
                }
            }
            else if(nums[i]==2){
                int j=i+1;
                while(j<nums.length){
                    if(nums[j]==1){
                        val=Math.min(val,Math.abs(i-j));
                        break;
                    }
                    j++;
                }
            }
        }
        return val==Integer.MAX_VALUE?-1:val;
    }
}