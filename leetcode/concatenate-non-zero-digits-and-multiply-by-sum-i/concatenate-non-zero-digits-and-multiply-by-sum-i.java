class Solution {
    public long sumAndMultiply(int n) {
        long a=0;
        while(n>0){
            if(n%10!=0)a=(a*10)+(n%10);
            n/=10;
        }
        long b=a;
        long s=0;
        while(b>0){
            s+=b%10;
            b/=10;
        }
        b=0;
        while(a>0){
            b=(b*10)+(a%10);
            a/=10;
        }
        return b*s;
    }
}