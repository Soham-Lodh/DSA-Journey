public class TrappingRainWater {
    static int rainWater(int heights[]){
        if(heights.length<3)return 0;
        int left[]=new int [heights.length];
        int right[]=new int[heights.length];
        left[0]=heights[0];
        right[heights.length-1]=heights[heights.length-1];
        for(int i=1;i<heights.length;i++)left[i]=Math.max(heights[i-1],left[i-1]);
        for(int i=heights.length-2;i>=0;i--)right[i]=Math.max(heights[i+1],right[i+1]);
        int water=0;
        for(int i=0;i<heights.length;i++){
            int h=Math.min(left[i],right[i])-heights[i];
            if(h>0)water+=h;
        }
        return water;
    }
    public static void main(String[] args) {
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped rain water: " + rainWater(height));
    }
}
