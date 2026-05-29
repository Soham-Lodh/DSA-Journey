class Solution {
    public int minElement(int[] nums) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            int s=sum(nums[i]);
            min=Math.min(min,s);
        }
        return min;
    }
    int sum(int n){
        int s=0;
        while(n>0){
            s+=(n%10);
            n/=10;
        }
        return s;
    }
}