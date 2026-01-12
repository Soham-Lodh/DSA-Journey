class Solution {
    public void moveZeroes(int[] nums) {
        int ak=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ak]=nums[i];
                ak++;
            }
        }
        while(ak<nums.length){
            nums[ak]=0;
            ak++;
            
        }
    }
}