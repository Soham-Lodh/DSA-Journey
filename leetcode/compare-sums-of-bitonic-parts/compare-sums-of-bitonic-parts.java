class Solution {
    public int compareBitonicSums(int[] nums) {
        int i=1;
        while(i<nums.length){
            if(nums[i]<nums[i-1])break;
            i++;
        }
        long sum1=0;
        long sum2=0;
        for(int j=0;j<i;j++)sum1+=nums[j];
        for(int j=i-1;j<nums.length;j++)sum2+=nums[j];
        if(sum1==sum2)return -1;
        else if(sum1>sum2)return 0;
        return 1;
    }
}