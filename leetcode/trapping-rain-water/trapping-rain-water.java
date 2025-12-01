class Solution {
    public int trap(int[] height) {
        int left[]=new int[height.length];
        int right[]=new int[height.length];
        left[0]=height[0];
        right[height.length-1]=height[height.length-1];
        for(int i=1;i<left.length;i++){
            left[i]=Math.max(height[i],left[i-1]);
        }
        for(int j=right.length-2;j>=0;j--){
            right[j]=Math.max(right[j+1],height[j]);
        }
        int water=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(left[i],right[i]);
            water+=(waterLevel-height[i]);
        }
        return water;
    }
}