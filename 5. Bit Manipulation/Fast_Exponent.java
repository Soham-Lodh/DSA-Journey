public class Fast_Exponent {
    static double myPow(double x, int n) {
        if(x==0)return 0;
        else if(n==1)return x;
        else if(n==0)return 1;
        else if(n<0){
            long N=n;
            x=(1/x);
            N=N*(-1);
            return pow(x,N);
        }
        return pow(x,n);
    }
    static double pow(double a,int n){
        double ans=1;
        while(n>0){
            if((n&1)!=0)ans*=a;
            a*=a;
            n=n>>1;
        }
        return ans;
    }
    static double pow(double a,long n){
        double ans=1;
        while(n>0){
            if((n&1)!=0)ans*=a;
            a*=a;
            n=n>>1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.err.println("The value of 2^10 is: "+myPow(2,10));
    }
}
