class Solution {
    public boolean predictTheWinner(int[] nums) {
        return win(nums,0,nums.length-1,true,0,0);
    }
    boolean win(int nums[],int i,int j,boolean flag,int p1,int p2){
        if(i>j)return p1>=p2;
        if(flag){
            boolean c1=win(nums,i+1,j,false,p1+nums[i],p2);
            boolean c2=win(nums,i,j-1,false,p1+nums[j],p2);
            return c1||c2;
        }
        else{
            boolean c1=win(nums,i+1,j,true,p1,p2+nums[i]);
            boolean c2=win(nums,i,j-1,true,p1,p2+nums[j]);
            return c1&&c2;
        }
    }
}