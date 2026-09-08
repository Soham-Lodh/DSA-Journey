class Solution {
    public boolean uniformArray(int[] nums) {
        int m=Integer.MAX_VALUE;
        for(int num:nums){
            if(num%2!=0)m=Math.min(m,num);
        }
        if (m == Integer.MAX_VALUE)return true;
        for(int num:nums){
            if(num%2==0 && num<m)return false;
        }
        return true;
    }
}