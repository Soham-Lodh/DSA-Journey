class Solution {
    public void rotate(int[] nums, int k) {
        rotator(nums,0,nums.length-1);
        k=k%nums.length;
        rotator(nums,0,k-1);
        rotator(nums,k,nums.length-1);
    }
    public void rotator(int[] nums,int start,int end){
        int i=start;
        int j=end;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}