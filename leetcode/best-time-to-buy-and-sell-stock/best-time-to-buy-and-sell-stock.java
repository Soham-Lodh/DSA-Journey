class Solution {
    public int maxProfit(int[] nums) {
        int buy=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<nums.length;i++){
            if(buy<nums[i]){
                int profit=nums[i]-buy;
                maxprofit=Math.max(maxprofit,profit);
            }
            else{
                buy=nums[i];
            }
        }
        return maxprofit;
    }
}