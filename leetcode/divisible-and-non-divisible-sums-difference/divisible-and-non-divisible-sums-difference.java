class Solution {
    public int differenceOfSums(int n, int m) {
        int divisible=0;
        int notdivisible=0;
        for(int i=1;i<n+1;i++){
            if(i%m==0)divisible+=i;
            else notdivisible+=i;
        }
        return notdivisible-divisible;
    }
}