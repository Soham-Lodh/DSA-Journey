class Solution {
    public double myPow(double x, int n) {
        if(x==1 || n==0)return 1;
        else{
            long p=n;
            if(n<0){
            x=1/x;
            p=-p;
        }
        double ans=1;
        while(p>0){
            if((p & 1)==1){
                ans=ans*x;
            }
            x=x*x;
            p=p>>1;
        }
        return ans;
        } 
    }
}