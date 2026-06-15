
public class Container_Most_Water{
    static int maxArea_BruteForce(int[] height) {
        int water=Integer.MIN_VALUE;
        for(int i=0;i<height.length;i++){
            for(int j=i+1;j<height.length;j++){
                int area=(j-i)*Math.min(height[i],height[j]);
                water=Math.max(water,area);
            }
        }
        return water;
    }
    static int maxArea_Optimized(int[] height) {
        int water=Integer.MIN_VALUE;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int area=Math.min(height[left],height[right])*(right-left);
            water=Math.max(water,area);
            if(height[left]<height[right])left++;
            else right--;
        }
        return water;
    }
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        System.out.println("Brute Force: "+maxArea_BruteForce(height));
        System.out.println("Optimized: "+maxArea_Optimized(height));
    }
}