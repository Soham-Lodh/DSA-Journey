class Solution {
    public int missingInteger(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int num:nums)hs.add(num);
        int maxLen=1;
        int maxSum=nums[0];
        int sum=nums[0],len=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                len++;
                sum+=nums[i];
                if(len>maxLen){
                    maxSum=sum;
                    maxLen=len;
                }
            }
            else{
                break;
            }
        }
        int i=maxSum;
        while(true){
            if(!hs.contains(i))return i;
            i++;
        }
    }
}