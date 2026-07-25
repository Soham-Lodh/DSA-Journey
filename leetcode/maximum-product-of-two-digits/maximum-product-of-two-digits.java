class Solution {
    public int maxProduct(int n) {
        int max1=Integer.MIN_VALUE,max2=Integer.MIN_VALUE;
        int x=n;
        while(x>0){
            int a=x%10;
            if(a>max1){
                max2=max1;
                max1=a;
            }
            else if(a>max2){
                max2=a;
            }
            x/=10;
        }
        return max1*max2;
    }
}