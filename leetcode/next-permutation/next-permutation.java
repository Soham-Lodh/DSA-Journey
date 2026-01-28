class Solution {
    public void nextPermutation(int[] nums) {
        int i=nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i<0){
            reverse(nums,0,nums.length-1);
            return;
        }
        int j=nums.length-1;
        while(j>=0 && nums[j]<=nums[i])j--;
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        reverse(nums,i+1,nums.length-1);
        return;

    }
    public void reverse(int arr[],int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}