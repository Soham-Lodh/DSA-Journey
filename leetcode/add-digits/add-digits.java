class Solution {
    public int addDigits(int num) {
        if(num>-1 && num<10)return num;
        int n=num;
        while(n>=10){
            num=n;
            n=0;
            while(num>0){
                n+=num%10;
                num/=10;
            }
        }
        return n;
    }
}