class Solution {
    public int[] resultArray(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        arr1[0]=nums[0];
        arr2[0]=nums[1];
        int k=0,j=0;
        for(int i=2;i<nums.length;i++){
            if(arr1[k]>arr2[j]){
                arr1[++k]=nums[i];
            }
            else{
                arr2[++j]=nums[i];
            }
        }
        int i=0;
        for(int l=0;l<=k;l++){
            nums[i++]=arr1[l];
        }
        for(int l=0;l<=j;l++){
            nums[i++]=arr2[l];
        }
        return nums;
    }
}