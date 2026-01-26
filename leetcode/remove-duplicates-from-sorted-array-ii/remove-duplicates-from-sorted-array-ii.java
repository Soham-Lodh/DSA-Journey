class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int arr[]=new int[nums.length];
        int k=1;
        int count=1;
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]==nums[i])count++;
            else count=1;
            if(count<=2){
                arr[k]=nums[i];
                k++;
            }
        }
        for(int i=0;i<k;i++){
            nums[i]=arr[i];
        }
        return k;
    }
}