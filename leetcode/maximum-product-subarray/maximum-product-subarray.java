class Solution {
    public int maxProduct(int[] nums) {
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int product=nums[i];
            maxProduct = Math.max(maxProduct, nums[i]);
            while(j<nums.length){
                product*=nums[j];
                maxProduct=Math.max(product,maxProduct);
                j++;
            }
        }
        return maxProduct;
    }
}