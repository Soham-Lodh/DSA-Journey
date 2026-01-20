class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans=new int[nums.size()];
        Arrays.fill(ans,-1);
        for(int i=0;i<nums.size();i++){
            int a=nums.get(i);
            for(int j=1;j<=a;j++){
                if((j|(j+1))==a){
                    ans[i]=j;
                    break;
                }
            }
        }
        return ans;
    }
}