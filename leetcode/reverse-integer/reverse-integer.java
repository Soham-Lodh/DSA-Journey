class Solution {
    public int reverse(int x) {
        int y=0;
        while(x!=0){
            long k = (long) y * 10 + (x % 10);
            if(k>Integer.MAX_VALUE || k<Integer.MIN_VALUE)return 0;
            y=(int)k;
            x=x/10;

        }
        return y;
    }
}