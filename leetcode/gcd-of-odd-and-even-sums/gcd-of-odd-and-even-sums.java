class Solution {
    public int gcdOfOddEvenSums(int n) {
        int so=0,se=0;
        for(int i=1;i<=n;i++){
            so+=(i*2-1);
            se+=(i*2);
        }
        return gcd(so,se);
    }
    int gcd(int a,int b){
        int g=1;
        int s=Math.abs(b-a);
        for(int i=1;i<=s;i++){
            if(s%i==0)g=Math.max(g,i);
        }
        return g;
    }
}