class Solution {
    public boolean isGood(int[] nums) {
        int freq[]=new int[nums.length-1];
        for(int num:nums){
            if(num<=0 || num>freq.length)return false;
            else freq[num-1]++;
        }
        for(int i=0;i<freq.length-1;i++){
            if(freq[i]!=1)return false;
        }
        if(freq[freq.length-1]!=2)return false;
        return true;
    }
}
