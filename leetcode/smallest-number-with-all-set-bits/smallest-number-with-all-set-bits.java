class Solution {
    int binary(int n){
        if (n == 0) return 0;
        int res = 0, place = 1;
        while (n > 0) {
            res += (n % 2) * place;
            place *= 10;
            n /= 2;
        }
        return res;
    }
    boolean containsOnlyOnes(int x) {
        if (x <= 0) return false;
        while (x > 0) {
            if (x % 10 != 1) return false;
            x /= 10;
    }
        return true;
    }
    public int smallestNumber(int n) {
        int x=n;
        while(x>=n){
            if(containsOnlyOnes(binary(x)))return x;
            else x++;
        }
        return x;
    }
}