class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x==1)return 1;
        long n=x;
        while(n*n>x){
            n=(n+(x/n))/2;
        }
        return (int)n;
    }
}