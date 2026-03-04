class Solution {
    public int subarraySum(int[] nums, int target) {
        int arr[]=new int[nums.length];
        arr[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr[i]=nums[i]+arr[i-1];
        }
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                int sum=i==0?arr[j]:arr[j]-arr[i-1];
                if(sum==target)count++;
            }
        }
        return count;
    }
}