class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        for(int i=num1;i<=num2;i++){
            int num=i;
            if(num<99)continue;
            else{
                int ak=num;
                while(ak>=100){
                    num=ak;
                    int prev=num%10;
                    num/=10;
                    int curr=num%10;
                    num/=10;
                    int forward=num%10;
                    if((curr>forward && curr>prev) || (curr<forward && curr<prev))count++;
                    ak/=10;
                }
            }
        }
        return count;
    }
}