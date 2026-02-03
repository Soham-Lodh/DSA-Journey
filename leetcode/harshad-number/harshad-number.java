class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int n=x,num=0;
        while(n>0){
            num+=(n%10);
            n/=10;
        }
        if(x%num==0)return num;
        return -1;
    }
}