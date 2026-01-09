class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)return false;
        int y=0;
        int n=x;
        while(x!=0){
            y=y * 10 + (x % 10);
            x=x/10;

        }
        if(y==n)return true;
        return false;
    }
}