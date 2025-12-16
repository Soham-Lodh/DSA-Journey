class Solution {
    public long getDescentPeriods(int[] prices) {
        if (prices == null || prices.length == 0) return 0;
        long count=1;
        long len=1;
        for(int i=1;i<prices.length;i++){
            if(prices[i-1]-prices[i]==1)len+=1;
            else len=1;
            count+=len;
        }
        return count;
    }
}