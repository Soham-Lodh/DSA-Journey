class Solution {
    public int removeElement(int[] nums, int val) {
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==val){
                int j=i+1;
                while(j<nums.length && nums[j]==val)j++;
                if(j>nums.length)break;
                else if(j<nums.length){
                    int temp=nums[j];
                    nums[j]=nums[i];
                    nums[i]=temp;
                }
            }
        }
        for(int i=nums.length-1;i>=0 && nums[i]==val;i--)c++;
        return nums.length-c;
    }
}