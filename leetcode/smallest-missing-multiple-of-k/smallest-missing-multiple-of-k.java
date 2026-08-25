class Solution {
    public int missingMultiple(int[] nums, int k) {
        int max=k;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%k==0){
                max=Math.max(max,nums[i]);
                hs.add(nums[i]);
            }
        }
        for(int i=k;i<=max;i+=k){
            if(!hs.contains(i))return i;
        }
        return max+k;
    }
}