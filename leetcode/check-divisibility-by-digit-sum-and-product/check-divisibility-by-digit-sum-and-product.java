class Solution {
    public boolean checkDivisibility(int n) {
        return n%res(n)==0;
    }
    int res(int n){
        int m=0,k=1;
        while(n>0){
            m+=(n%10);
            k*=(n%10);
            n/=10;
        }
        return m+k; 
    }
}