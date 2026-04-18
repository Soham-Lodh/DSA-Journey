public class BuySellStocks_BruteForce {
    static int maxProfit(int[] prices) {
        int profit=Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            for(int j=i+1;j<prices.length;j++){
                profit=Math.max(prices[j]-prices[i],profit);
            }
        }
        return profit>0?profit:0;
    }
    public static void main(String[] args) {
        int prices[]={7,1,5,3,6,4};
        System.out.println("Maximum profit: " + maxProfit(prices));
    }
}
