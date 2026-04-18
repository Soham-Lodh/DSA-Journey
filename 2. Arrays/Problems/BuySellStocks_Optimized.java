public class BuySellStocks_Optimized {
    static int maxProfit(int[] prices) {
        int bp=prices[0],profit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<bp)bp=prices[i];
            profit=Math.max(profit,prices[i]-bp);
        }
        return profit;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit: " + maxProfit(prices));
    }
}
