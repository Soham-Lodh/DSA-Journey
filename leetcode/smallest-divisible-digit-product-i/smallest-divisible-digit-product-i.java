class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int k=digProduct(n);
            if(k%t==0)return n;
            n++;
        }
    }
    int digProduct(int n){
        int k=1;
        while(n>0){
            k=k*(n%10);
            n/=10;
        }
        return k;
    }
}