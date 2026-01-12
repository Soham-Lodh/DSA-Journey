class Solution {
    public void sortColors(int[] nums) {
        int zero=0,one=0,two=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)zero++;
            else if(nums[i]==1)one++;
            else two++;
        }
        int k=0;
        while(k<zero){
            nums[k]=0;
            k++;
        }
        while(k<=zero+one-1){
            nums[k]=1;
            k++;
        }
        while(k<=zero+one+two-1){
            nums[k]=2;
            k++;
        }
    }
}